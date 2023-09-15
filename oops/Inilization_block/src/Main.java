
/*
=> there are two types of initialization blocks
->instance initialization block
->static initialization block

=> Rules for instance initializer block
->The instance initializer block is created when instance of the class is created.
->The instance initializer block is invoked after the parent class constructor is invoked
    (i.e. after super() constructor call).
->The instance initializer block comes in the order in which they appear.

 */
class Test{
     int x;
    {
        System.out.println("initialization block: x = "+x);
    }
    {x=4;}
   Test(){
        System.out.println("CONSTRUCTOR CALLED: x = "+x);
    }


}

public class Main {
    public static void main(String[] args) {

        Test t1 = new Test();
        Test t2 = new Test();


    }
}
/*
class A {
    A() {
        System.out.println("parent class constructor invoked");
    }
}

class B2 extends A {
    B2() {
        super();
        System.out.println("child class constructor invoked");
    }

    {
        System.out.println("instance initializer block is invoked");
    }

    public static void main(String args[]) {
        B2 b = new B2();
    }
}

Output:parent class constructor invoked
       instance initializer block is invoked
       child class constructor invoked


 */