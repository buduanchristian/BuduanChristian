import java.util.Scanner;

public class Hakdog {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        DataSet calc = new DataSet();
        double nextnumber = 0;

        while (true){
            System.out.print("Enter the next number(0 to exit): ");
            nextnumber = scanner.nextDouble();
            if (nextnumber == 0)
                break;
            calc.addDatum(nextnumber);
        }

        System.out.println("Min = "+calc.getMin());
        System.out.println("Max = "+calc.getMax());
        System.out.println("Mean = "+calc.getAvg());
        System.out.println("Count = "+calc.getCount());
        System.out.println("Sum = "+calc.getSum());
    }

} //end class DataSet

