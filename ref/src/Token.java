public class Token {
    int line, column;
    String tag, value;

    public Token(int line, int column, String tag, String value) {
        this.line = line;
        this.column = column;
        this.tag = tag;
        this.value = value;
    }
}
