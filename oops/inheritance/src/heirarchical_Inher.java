// When two or more classes inherits a single class, it is known as hierarchical inheritance
//Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object.
class Animal2 {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog2 extends Animal2 {
    void bark() {
        System.out.println("barking...");
    }
}

class Cat extends Animal2 {
    void meow() {
        System.out.println("meowing...");
    }
}

public class heirarchical_Inher {
    public static void main(String args[]) {

        Cat c = new Cat();
        c.meow();
        c.eat();
//c.bark();//C.T.Error

    }
}
