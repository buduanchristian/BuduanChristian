import java.util.Scanner;
public class BMIApplication {
    /**
     * this program computes the users BMI and identifies their category
     * ask user for Height
     * ask user for Weight
     * compute BMI
     * Underweight = <18.5
     * Normal weight = 18.5 – 24.9
     * Overweight = 25 – 29.9
     * Obesity = BMI of 30 or greater
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Body Mass Index Application Matthew");
        System.out.println("Your Weight (kg)");
        float yourWeight = scanner.nextFloat();
        System.out.println("Your Height (m)");
        float yourHeight = scanner.nextFloat();

        float BMI = (yourWeight) / (yourHeight * yourHeight);
        System.out.println("Your BMI is " + BMI);
        if (BMI < 18.5){
            System.out.println("You're under weight");
        } else if (BMI >= 18.5 && BMI < 25) {
            System.out.println("You're normal weight");
        } else if (BMI > 25 && BMI < 30) {
            System.out.println("You're overweight");
        } else if (BMI > 30) {
            System.out.println("You're obese");
        }
    }
}