/*
an abstract class must be declared with an abstract keyword
it can have abstract and not abstract methods(normal methods)
it can not be instantiated(it's object can not be created)
it can have constructor and static method
it can have final methods which will force the subclass not
to change the body of the method

 */

abstract class Animal {
    abstract void walk();
    final void eat() {
        System.out.println("Animal is eating.");
    }

    final void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

class Hore extends Animal {
    public void walk() {
        System.out.println("walk on lege 4 legs");
    }

}

class Chicken extends Animal {
    public void walk() {
        System.out.println("waks on 2 legs");
    }

}


public class Main {
    public static void main(String[] args) {
        Hore horse = new Hore();
        horse.walk();
        horse.eat();
        horse.sleep();

        Animal c = new Chicken();//In a real scenario, object is provided through method


    }
}
