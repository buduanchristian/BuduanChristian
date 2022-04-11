import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Account xb = new Account();
        Scanner sc = new Scanner(System.in);
        int option = 0;
        while (option != 5) {
            System.out.println("What do you want to do?");
            System.out.println("1 - Deposit");
            System.out.println("2 - Withdraw");
            System.out.println("3 - Display Balance");
            System.out.println("4 - Display Details");
            System.out.println("5 - Exit");
            System.out.println("Select: ");
            option = sc.nextInt();

            if(option == 1){
                System.out.println("How much would you want to deposit?");
                double ammount = sc.nextDouble();
                xb.adddeposit(ammount);
            }
            if(option == 2){
                System.out.println("How much would you want to withdraw?");
                double ammount = sc.nextDouble();
                xb.withdraw(ammount);
            }
            if(option == 3){
                System.out.println("Your current balance is :" + xb.getBalance());
            }
            if(option == 4){
                xb.display();
            }
            if(option == 5){
               System.out.println("Exit Program...");
            }
        }
    }
}

