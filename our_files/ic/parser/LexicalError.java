package ic.parser;

public class LexicalError extends Exception
{
	public LexicalError(int line, int column, String token) {
		super("Error!\t"+token+"\t"+"\t"+line+":"+column);
    }
}

