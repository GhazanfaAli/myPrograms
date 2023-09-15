// When there is a chain of inheritance, it is known as multilevel inheritance
class Human2{
    void eat(){
        System.out.println("human is eating");
    }
}
class Male extends Human2{
    void walk(){
        System.out.println("male is walking");
    }
}
class Female extends Male{
    void write(){
        System.out.println("female is writing a book");
    }
}

public class multi_lev {
    public static void main(String args[]){
        Female obj1 = new Female();
        obj1.write();
        obj1.eat();
        obj1.walk();

    }
}
