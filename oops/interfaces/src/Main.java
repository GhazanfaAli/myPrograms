/*
All the fields in interfaces are public, static and final by default
All methods are public and abstract by default

 */


interface Animal{

     void walk();

}
interface Bird{

}
// FOR ACHIEVING MULTIPLE INHERITANCE WE USE INTERFACES NOT THE CLASSES

class Horse implements Animal, Bird{
   public void walk(){
        System.out.print("WALKS ON 4 LEGS");
    }
}


public class Main {
    public static void main(String[] args) {
    Horse obj1 = new Horse();
    obj1.walk();


    }
}
/// ==> implementation meaning = "using"