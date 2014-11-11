public class LexicalException extends Error {
    public LexicalException(int line, int column, String message) {
        super(line + ":" + column + " : lexical error; " + message);
    }
}
