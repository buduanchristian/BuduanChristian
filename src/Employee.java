public class Employee {
    private String empname;
    private String empsurname;
    private double monthsalary;
    private double increasesalary;

    public void surname(String lname){
        empsurname = lname;
    }
    public String getsurname(){
        return empsurname;
    }

    public void name(String ename) {
        empname = ename;
    }
    public String getname(){
        return empname;
    }

    public void salary(double msalary){
        monthsalary = msalary;
    }
    public double getsalary(){
        return monthsalary;
    }
    public void increase(double insalary){
        monthsalary = insalary;
    }
    public double getincrease(){
        return monthsalary/4 + monthsalary;
    }

}
