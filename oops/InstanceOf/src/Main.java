// => The java instanceof operator is used to test whether the object is an
//       instance of the specified type (class or subclass or interface).

// => an example or single occurrence of something.
// => object  ref instanceof class or interface or subclass
// -> When Subclass type refers to the object of Parent class, it is known as downcasting.


//class A{}
//
//public class Main extends A {
//    public static void main(String[] args) {
//    Main obj1 = new Main();
//    Main obj2 = null;
//    System.out.println(obj1 instanceof Main);
//        System.out.println(obj2 instanceof Main);
//
//        Main obj3 = (Main)new A(); //ClassCastException is thrown at runtime.
//
//    }
//}
class Animal { }

class Dog3 extends Animal {

    static void method(Animal a) {
        if(a instanceof Dog3){
            Dog3 d=(Dog3)a;//downcasting
            System.out.println("ok downcasting performed");
        }
    }

    public static void main (String [] args) {
        Animal a=new Dog3();
        Dog3.method(a);

    }

}