class Bike1 {
    int age;
    String name;

    Bike1() {
        //creating a default constructor
        System.out.println("BIKE is created");
    }

    //creating a parameterized constructor
    Bike1(int n, String nam) {
        age = n;
        name = nam;
    }

    void display() {
        System.out.println(age + " " + name);

    }

}

public class Const {
    public static void main(String args[]) {

        Bike1 b1 = new Bike1(), b2 = new Bike1(22, "avatar");
        b1.display();
        b2.display();
        /*
        --> default constructor provides default values to the
         object such 0 or null etc depending on the type.

       --> Explanation:In the above class,you are not creating any constructor
        so compiler provides you a default constructor. Here 0 and null values
         are provided by default constructor.
         */

    }
}
