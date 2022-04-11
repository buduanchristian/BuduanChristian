import java.util.Scanner;

/***1. Ask for the user's weight
 *  2. Ask for the user Height
 *  3. Compute the user's BMI, then display the result.
 *  4. Get the result of the user's BMI, then the program is capable of identifying
 *  whether the user is underweight, Normal Weight, overWeight or obese.
 *  #ranges
 *  Underweight = less than 18.5
 *  Normal Weight = 18.5-24.9
 *  Overweight = 25-29.9
 *  obese = greater than 30
 */

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* Asking*/
        System.out.println("Body Mass Index Calculator");
        System.out.println("Kindly Input your Weight: (In Kilograms) ");
        float weight = scanner.nextFloat();
        System.out.println("Kindly Input your Height: (In Meters) ");
        float height = scanner.nextFloat();
        /*BMI Computation*/
        float BMI = weight / (height * height);
        System.out.println("Your Body Mass Index is " + BMI);
        /*Identification*/
        if (BMI < 18.5){
            System.out.println("Which means, you're Underweight");
        } else if (BMI >=18.5 && BMI < 25){
            System.out.println("Congratulations! You're Normal Weight");
        } else if (BMI >= 25 && BMI < 30){
            System.out.println("Which means, you're Overweight");
        } else if (BMI >= 30){
            System.out.println("Which means, you're Obese");
        }

    }
}


