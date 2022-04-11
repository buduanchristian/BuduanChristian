public class Salary {
    private double hourlyrate;
    private double workinghours;
    private double monthlysalary;
    private double GetInformation;

    public void GetInformation(double rate, double hoursperday){
        hourlyrate = rate;
        workinghours = hoursperday;
    }

    public void setMonthlysalary(double mslary){
        monthlysalary = mslary;
    }
    public double getmonthlysalary(){
        monthlysalary = hourlyrate * workinghours * 25;
        return monthlysalary;
    }


    public double addsalary(){
        double additional;
        if (getmonthlysalary() < 10000){
            System.out.println("-Monthly Salary is below PHP 10,000, adding PHP 4,000....");
            additional = getmonthlysalary() + 4000;
        } else{
            System.out.println("-Monthly Salary exceeds PHP 10,000, No Additional for you!");
            additional = getmonthlysalary();
        }
        return additional;
    }

    public double addOvertimePay(){
        double overtime;
        if (workinghours > 6){
            System.out.println("-Your working hour per day exceeds 6 hours, adding Overtime Pay....");
            overtime = addsalary() + 2000;
        }
        else{
            System.out.println("-Your working hour per day is not enough for an Overtime Pay");
            overtime = addsalary();
        }
        return overtime;
    }


}


