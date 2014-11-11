import java.io.FileReader;
import java.io.IOException;

/**
 * @team TheCunningLinguists
 * 1. Stanislav Podolsky
 * 2. Artyom Lukianov
 * 3. Michael Velbaum
 */

public class Main {

    public static void main(String[] args) {
        Token token;

        System.out.printf("%-13s %-13s %-4s : %-4s\n", "token", "tag", "line", "column");
        try {
            Scanner scanner = new Scanner(new FileReader(args[0]));
            while ((token = scanner.yylex()) != null)
                System.out.printf("%-13s %-13s %-4d   %-4d\n", token.value,
                        token.tag, token.line, token.column);

        } catch (IOException e) {
            System.err.printf("IO Error:\n%s\n", e.getMessage());
        } catch (LexicalException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
