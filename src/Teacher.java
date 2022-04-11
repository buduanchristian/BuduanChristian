import java.sql.SQLOutput;

/**
 * Consider a Teacher Object can be created from A Person Class.
 *
 */

public class Teacher{
    private String name;
    private int age;
    private String address;

    Teacher(){
        this.name = "Buduan C";
        this.age = 23;
        this.address = "Laoag City";
    }

    public static void main(String[] args) {
        Person obj = new Person();
        obj.Teacher();
        Teacher obj2 = new Teacher();
        System.out.println(obj2.name);
        System.out.println(obj2.age);
        System.out.println(obj2.address);

        /**
         * Create a Teacher object from the Person Class
         * Print the Name, age, and address
         */
    }
}
