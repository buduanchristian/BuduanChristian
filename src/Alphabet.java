import java.util.Locale;
import java.util.Scanner;

public class Alphabet{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character to know its Ordinal number in the alphabet");
        String input = scanner.next();

        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int ordinal = letters.indexOf(input.toUpperCase(Locale.ROOT));
        ordinal++;
        System.out.printf("Your character %s has an ordinal number of %d in the Alphabet",input.toUpperCase(Locale.ROOT),ordinal);

    }
}
