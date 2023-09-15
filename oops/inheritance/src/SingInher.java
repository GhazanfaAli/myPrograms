// ==> When a class inherits another class, it is known as a single inheritance.

class Animal{
    void eat(){
        System.out.println("animal is eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("dog is barking");
    }
}


public class SingInher {
    public static void main(String args[]){
        Dog obj1 = new Dog();
        obj1.bark();
        obj1.eat();

    }
}
