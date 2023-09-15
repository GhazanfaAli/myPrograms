/*
->Inheritance in Java is a mechanism in which one object acquires all the properties
    and behaviors of a parent object.
->The idea behind inheritance in Java is that you can create new classes that are built
    upon existing classes.
->Inheritance represents the IS-A relationship which is also known as a parent-child
    relationship.
 */
class Human{
    int age;
    String name;

}

class Person extends Human{

}
public class Main{
    public static void main(String args[]){
        Person obj1 = new Person();
        obj1.name = "ali";
        obj1.age = 222;

    }
        }