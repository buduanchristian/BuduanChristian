import java.util.Scanner;

public class Kyron {

    public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee x = new Employee();
        x.displayFirst();
        double salary = input.nextDouble();
        x.displaySecond();
        double hours = input.nextDouble();
        x.setHourlyRate(salary);
        x.setWorkingHours(hours);
        x.displayThrid();
        System.out.println("Result " + x.getMonthlySalary());
        System.out.println("Result = " + x.addOvertime());

    }

    public class Employee {
        private double hourlyRate;
        private double workingHours;

        public void setHourlyRate(double rate) {
            hourlyRate = rate;
        }

        public void setWorkingHours(double hour) {
            workingHours = hour;
        }

        public double getMonthlySalary() {
            return hourlyRate * workingHours * 25.00;
        }

        public void displayFirst() {
            System.out.println("Lab Activity 5");
            System.out.println("Please fill out Employee Details");
            System.out.println("Enter Hourly Rate (PHP):");
        }

        public void displaySecond() {
            System.out.println("Enter Daily Working Hours:");
        }

        public void displayThrid() {
            System.out.println("Computing Montly Salary........");
        }

        public double addSalary() {
            double plus = 0;
            if (getMonthlySalary() < 10000.00) {
                System.out.println("Monthly Salary Is not a Livable Wage, adding salary..");
                plus = getMonthlySalary() + 4000.00;
            } else {
                System.out.println("Monthly Salary Is a Livable Wage");
                plus = getMonthlySalary();
            }
            return plus;
        }

        public double addOvertime() {
            double overtime = 0;
            if (workingHours > 6) {
                System.out.println("Working Hours is More than Required, adding overtime pay...");
                overtime = addSalary() + 2000.00;

            } else {
                System.out.println("Working Hours is on Time ");
                overtime = addSalary();
            }
            return overtime;
        }
    }
}
