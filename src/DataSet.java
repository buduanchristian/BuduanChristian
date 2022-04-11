import javax.swing.*;
import java.util.*;
public class DataSet {

    private int count; // Number of numbers that have been entered.
    private double sum; // The sum of all the items that have been entered.
    private double min;
    private double max;

    //Adds numbers to dataset.
    public void addDatum(double num) {
        count++;
        sum += num;
        if (count == 1) {
            min = num;
            max = num;
        } else if (num < min) {
            min = num;
        } else if (num > max) {
            max = num;
        }
    }

    public boolean isEmpty() {
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }

    //Return number of items entered into the dataset.
    public int getCount() {
        return count;
    }

    //Return the sum of all the numbers that have been entered.
    public double getSum() {
        return sum;
    }

    //Return the average of all the numbers that have been entered.
    public double getAvg() {
        return sum / count;
    }

    //return Maximum value of data entered.
    public double getMax() {
        return max;
    }
    public double getMin(){
        return min;
    }
}