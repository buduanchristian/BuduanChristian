import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Salary a = new Salary();
        Scanner input = new Scanner(System.in);

        System.out.println("Lab Activity 5");
        System.out.println("Please fill out Employee Details");
        System.out.println("Enter Hourly Rate (PHP):");
        double rate = input.nextDouble();
        System.out.println("Enter Daily Working Hours:");
        double hoursperday = input.nextDouble();
        a.GetInformation(rate,hoursperday);

        System.out.println("------Your Monthly Salary------");
        System.out.println("Initial Monthly Salary: " + a.getmonthlysalary());
        System.out.println("------Remarks------");
        System.out.println("Final Monthly Salary: " + a.addOvertimePay());

    }
}
