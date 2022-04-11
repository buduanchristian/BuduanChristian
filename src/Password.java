import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String password = scanner.nextLine();

        int length = password.length();
        if (length >= 15){
            System.out.println("The password you've entered is valid");
        }else
            System.out.println("The password you've entered is invalid. Please Try Again");

    }
}
