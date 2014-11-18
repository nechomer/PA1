/* The following code was generated by JFlex 1.6.0 */

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.0
 * from the specification file <tt>jflex_spec.lex</tt>
 */
class Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;
  public static final int TRADITIONAL_COMMENT = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\50\1\50\1\1\22\0\1\45\1\37\1\47"+
    "\2\44\1\36\1\42\1\44\1\36\1\36\1\40\1\36\1\36\1\36"+
    "\1\36\1\4\1\10\11\11\1\44\1\36\1\37\1\41\1\37\2\44"+
    "\32\6\1\36\1\46\1\36\1\44\1\5\1\44\1\14\1\26\1\12"+
    "\1\22\1\16\1\32\1\30\1\34\1\23\1\7\1\35\1\13\1\7"+
    "\1\21\1\25\2\7\1\27\1\15\1\20\1\31\1\24\1\33\1\17"+
    "\2\7\1\36\1\43\1\36\1\44\6\0\1\50\u1fa2\0\1\50\1\50"+
    "\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\2\2\1\3\1\4\1\5\1\6\2\7"+
    "\14\6\2\3\2\1\1\10\1\11\1\12\1\11\1\13"+
    "\1\2\1\0\1\14\1\15\13\6\1\3\6\6\1\0"+
    "\1\16\35\6";

  private static int [] zzUnpackAction() {
    int [] result = new int[86];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\51\0\122\0\173\0\244\0\173\0\315\0\366"+
    "\0\u011f\0\u0148\0\u0171\0\u019a\0\u01c3\0\u01ec\0\u0215\0\u023e"+
    "\0\u0267\0\u0290\0\u02b9\0\u02e2\0\u030b\0\u0334\0\u035d\0\u0386"+
    "\0\173\0\u03af\0\u03d8\0\u0401\0\173\0\173\0\u042a\0\u0453"+
    "\0\173\0\u047c\0\u04a5\0\173\0\u0171\0\u04ce\0\u04f7\0\u0520"+
    "\0\u0549\0\u0572\0\u059b\0\u05c4\0\u05ed\0\u0616\0\u063f\0\u0668"+
    "\0\u0148\0\u0691\0\u06ba\0\u06e3\0\u070c\0\u0735\0\u075e\0\u0453"+
    "\0\173\0\u0787\0\u07b0\0\u07d9\0\u0802\0\u082b\0\u0854\0\u087d"+
    "\0\u08a6\0\u08cf\0\u08f8\0\u0921\0\u094a\0\u0973\0\u099c\0\u09c5"+
    "\0\u09ee\0\u0a17\0\u0a40\0\u0a69\0\u0a92\0\u0abb\0\u0ae4\0\u0b0d"+
    "\0\u0b36\0\u0b5f\0\u0b88\0\u0bb1\0\u0bda\0\u0c03";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[86];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\2\6\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\12\1\17\1\20\1\12\1\21"+
    "\1\22\1\12\1\23\1\24\1\12\1\25\1\26\2\12"+
    "\1\27\1\30\2\12\1\31\1\32\1\31\1\32\1\33"+
    "\1\34\1\4\1\6\1\4\1\35\1\0\1\36\1\0"+
    "\2\36\42\37\1\40\1\41\1\0\40\6\1\42\10\6"+
    "\53\0\1\6\52\0\1\43\33\0\1\44\15\0\31\10"+
    "\20\0\31\11\20\0\31\12\23\0\2\45\47\0\2\14"+
    "\44\0\6\12\1\46\11\12\1\47\10\12\20\0\11\12"+
    "\1\50\17\12\20\0\13\12\1\51\15\12\20\0\6\12"+
    "\1\52\3\12\1\53\16\12\20\0\22\12\1\54\4\12"+
    "\1\55\1\12\20\0\11\12\1\56\12\12\1\57\4\12"+
    "\20\0\14\12\1\60\10\12\1\61\3\12\20\0\20\12"+
    "\1\62\10\12\20\0\20\12\1\63\1\12\1\64\6\12"+
    "\20\0\11\12\1\65\17\12\20\0\7\12\1\66\21\12"+
    "\20\0\27\12\1\67\1\12\54\0\1\31\51\0\1\31"+
    "\51\0\1\31\11\0\42\37\1\70\22\0\2\37\24\0"+
    "\2\37\5\0\1\71\44\0\1\43\1\5\1\6\46\43"+
    "\5\0\7\12\1\72\21\12\20\0\14\12\1\73\14\12"+
    "\20\0\14\12\1\74\14\12\20\0\7\12\1\75\12\12"+
    "\1\76\6\12\20\0\10\12\1\77\20\12\20\0\13\12"+
    "\1\100\15\12\20\0\24\12\1\77\4\12\20\0\16\12"+
    "\1\101\12\12\20\0\26\12\1\61\2\12\20\0\6\12"+
    "\1\102\22\12\20\0\13\12\1\61\15\12\20\0\16\12"+
    "\1\103\12\12\20\0\20\12\1\104\10\12\20\0\11\12"+
    "\1\105\17\12\20\0\13\12\1\106\15\12\20\0\6\12"+
    "\1\52\22\12\20\0\16\12\1\107\12\12\20\0\10\12"+
    "\1\101\20\12\20\0\13\12\1\110\15\12\20\0\23\12"+
    "\1\111\5\12\20\0\13\12\1\112\15\12\20\0\16\12"+
    "\1\113\12\12\20\0\11\12\1\61\17\12\20\0\11\12"+
    "\1\114\17\12\20\0\10\12\1\61\20\12\20\0\6\12"+
    "\1\61\22\12\20\0\15\12\1\61\13\12\20\0\6\12"+
    "\1\115\22\12\20\0\7\12\1\116\21\12\20\0\24\12"+
    "\1\117\4\12\20\0\6\12\1\77\22\12\20\0\16\12"+
    "\1\120\12\12\20\0\13\12\1\121\15\12\20\0\16\12"+
    "\1\122\12\12\20\0\14\12\1\123\14\12\20\0\14\12"+
    "\1\124\14\12\20\0\11\12\1\125\17\12\20\0\30\12"+
    "\1\61\20\0\22\12\1\126\6\12\20\0\14\12\1\54"+
    "\14\12\20\0\27\12\1\61\1\12\20\0\5\12\1\61"+
    "\23\12\20\0\23\12\1\61\5\12\20\0\15\12\1\101"+
    "\13\12\20\0\7\12\1\126\21\12\20\0\14\12\1\61"+
    "\14\12\13\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3116];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\1\1\1\11\22\1\1\11\3\1\2\11"+
    "\2\1\1\11\1\1\1\0\1\11\23\1\1\0\1\11"+
    "\35\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[86];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
  StringBuffer string = new StringBuffer();
  
  // store line, column info when entering a new state
  private int stateLine, stateCol;

  private void savePos() {
     stateLine = yyline+1;
     stateCol = yycolumn+1;  
  }

  // if restorePos is true, then use the previously saved line and column numbers.
  private Token token(String tag, String value, boolean restorePos) {
     return new Token(restorePos ? stateLine : (yyline+1),
                      restorePos ? stateCol : (yycolumn+1), tag, value); 
  }
  
  private void Error(String msg, boolean restorePos) {
      throw new LexicalException(restorePos ? stateLine : (yyline+1), 
                                 restorePos ? stateCol : (yycolumn+1), msg);
  }



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Scanner(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 174) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;           
    int totalRead = 0;
    while (totalRead < requested) {
      int numRead = zzReader.read(zzBuffer, zzEndRead + totalRead, requested - totalRead);
      if (numRead == -1) {
        break;
      }
      totalRead += numRead;
    }

    if (totalRead > 0) {
      zzEndRead += totalRead;
      if (totalRead == requested) { /* possibly more input available */
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      return false;
    }

    // totalRead = 0: End of stream
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 1: 
          { Error("invalid character '"+ yytext()+"'", false);
          }
        case 15: break;
        case 2: 
          { /* ignore */
          }
        case 16: break;
        case 3: 
          { return token(yytext(), yytext(), false);
          }
        case 17: break;
        case 4: 
          { Error("an identifier cannot start with '_'", false);
          }
        case 18: break;
        case 5: 
          { return token("CLASS_ID", yytext(), false);
          }
        case 19: break;
        case 6: 
          { return token("ID", yytext(), false);
          }
        case 20: break;
        case 7: 
          { return token("INTEGER", yytext(), false);
          }
        case 21: break;
        case 8: 
          { savePos(); string.setLength(0); string.append("\""); yybegin(STRING);
          }
        case 22: break;
        case 9: 
          { Error("malformed string literal", true);
          }
        case 23: break;
        case 10: 
          { string.append(yytext());
          }
        case 24: break;
        case 11: 
          { yybegin(YYINITIAL); string.append("\""); return token("STRING", string.toString(), true);
          }
        case 25: break;
        case 12: 
          { savePos(); yybegin(TRADITIONAL_COMMENT);
          }
        case 26: break;
        case 13: 
          { Error("numbers should not have leading zeros", false);
          }
        case 27: break;
        case 14: 
          { yybegin(YYINITIAL);
          }
        case 28: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            switch (zzLexicalState) {
            case STRING: {
              Error("malformed string literal", true);
            }
            case 87: break;
            case TRADITIONAL_COMMENT: {
              Error("unterminated comment", true);
            }
            case 88: break;
            default:
            return null;
            }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}