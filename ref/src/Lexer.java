import java.io.IOException;
import java.io.Reader;
import java.util.Collection;

public class Lexer {

    public void process(Reader rd, Collection<Token> outTokens)
            throws LexicalException, IOException {
        Token token;
        Scanner scanner = new Scanner(rd);

        while ((token = scanner.yylex()) != null)
            outTokens.add(token);
    }

}