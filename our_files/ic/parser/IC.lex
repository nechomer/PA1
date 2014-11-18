package ic.parser;
import ic.parser.LexicalError;

%%
%class Lexer
%public
%yylexthrow LexicalError
%type Token
%unicode
%line
%column
%{
	StringBuffer string = new StringBuffer();

	// store line, column info when entering a new state
	private int stateLine, stateCol;

	private int getCurrentLine() {
		return yyline+1;
	}

	private int getCurrentColumn() {
		return yycolumn+1;
	}

	private void savePos() {
		stateLine = getCurrentLine();
		stateCol = getCurrentColumn();  
	}

	// if restorePos is true, then use the previously saved line and column numbers.
	private Token token(int id, String tag, String value, boolean restorePos) {
		return new Token(id, restorePos ? stateLine : getCurrentLine(),
				restorePos ? stateCol : getCurrentColumn(), tag, value); 
	}

	private void Error(String token, boolean restorePos) throws LexicalError {
		throw new LexicalError(restorePos ? stateLine : getCurrentLine(), 
				restorePos ? stateCol : getCurrentColumn(), token);
	}

%}

/****************************************** MACROS ****************************************/
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t]

EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}

IdentifierCharacter = [a-zA-Z0-9_]
ClassIdentifier = [A-Z]{IdentifierCharacter}*
RegularIdentifier = [a-z]{IdentifierCharacter}*

DecIntegerLiteral = (0 | [1-9][0-9]*)

Keyword = ("class" | "extends" | "static" | "void" | "int" | "boolean" | "string" |
           "return" | "if" | "else" | "while" | "break" | "continue" | "this" |
           "new" | "length" | "true" | "false" | "null")

Operator = ("[" | "]" | "(" | ")" | "." | "-" | "!" | "*" | "/" | "%" | "+" |
            "<" | "<=" | ">" | ">=" | "==" | "!=" | "&&" | "||" | "=")

// StringCharacter: allowed ASCII codes between decimal 32 and 126 excluding " and \.
// and the escape sequences: \", \\, \\t, \\n
StringCharacter = ([\040-\041\043-\133\135-\176] | "\\\"" | "\\\\" | "\\t" | "\\n")

Structure = [{};,]

%state STRING, TRADITIONAL_COMMENT

%%
/****************************************** RULES ****************************************/
<YYINITIAL> {
/* keywords */
{Keyword}                      { return token(sym.OTHER_SYMBOL, yytext(), yytext(), false); }

/* identifiers */
"_" {IdentifierCharacter}*     { Error(yytext(), false);}
{RegularIdentifier}            { return token(sym.ID,"ID", yytext(), false); }
{ClassIdentifier}              { return token(sym.CLASS_ID, "CLASS_ID", yytext(), false); }

/* literals */
0+ {DecIntegerLiteral}         { Error(yytext(), false); }
{DecIntegerLiteral}            { return token(sym.INTEGER, "INTEGER", yytext(), false); }
\"                             { savePos(); string.setLength(0); string.append("\""); yybegin(STRING); }

/* operators */                                                 
{Operator}                     { return token(sym.OTHER_SYMBOL, yytext(), yytext(), false); }
                                                                
/* structure */  
{Structure}                    { return token(sym.OTHER_SYMBOL, yytext(), yytext(), false); }
                                                                
/* comments */                                 
{EndOfLineComment}             { /* ignore */ }         
"/*"                           { savePos(); yybegin(TRADITIONAL_COMMENT); }     
                                                                
/* whitespace */                                                
{WhiteSpace}                   { /* ignore */ }
}

<STRING> {
\"                             { yybegin(YYINITIAL); string.append("\""); return token(sym.STRING, "STRING", string.toString(), true); }
{StringCharacter}+             { string.append(yytext()); }
<<EOF>>                        { Error(yytext(), true); }
}

<TRADITIONAL_COMMENT> {
[^\*]                          { /* ignore */ }
"*/"                           { yybegin(YYINITIAL); }
"*"                            { /* ignore */ }
<<EOF>>                        { Error(yytext(), true); }
}

/* error fallback */
[^]                           { Error(yytext(), false); }

