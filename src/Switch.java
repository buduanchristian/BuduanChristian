import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a String:");
        String input = scanner.nextLine();

        int length = input.length();
        char first = input.charAt(0);
        length -= 1;
        char last = input.charAt(length);

        String chuchu = input.substring(1,length);
        System.out.println("Input: " + input);
        System.out.print("Swapped Result: ");
        System.out.println(last + chuchu + first);

    }
}
