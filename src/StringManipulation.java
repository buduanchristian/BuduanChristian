import java.util.Scanner;

public class StringManipulation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a String:");
        String input = scanner.nextLine();
        System.out.println("Want to replace something from the string? What is it?");
        String old = scanner.nextLine();
        boolean check = input.contains(old);
        if (check) {
            System.out.println("Replace it with what?");
            String replacement = scanner.nextLine();
            String replace = input.replace(old, replacement);
            System.out.println("New String: " + replace);
        }
        else{
            System.out.println("Character not found!");
        }

    }
}
