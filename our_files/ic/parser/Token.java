package ic.parser;

import java_cup.runtime.Symbol;

public class Token extends Symbol {
    public Token(int id, int line) {
        super(id, null);
    }
}

