/*
=>Binding means the Connection/Linking of method call and method definition

->static binding

        When type of the object is determined at compiled time(by the compiler), it is known as static binding.

        If there is any private, final or static method in a class, there is static binding.

        Example of static binding

class Dog{
    private void eat(){System.out.println("dog is eating...");}

    public static void main(String args[]){
        Dog d1=new Dog();
        d1.eat();
    }
}


 */


/*
->Dynamic binding

        When type of the object is determined at run-time, it is known as dynamic binding.

        Example of dynamic binding


class Animal{
    void eat(){System.out.println("animal is eating...");}
}

class Dog extends Animal{
    void eat(){System.out.println("dog is eating...");}

    public static void main(String args[]){
        Animal a=new Dog();
        a.eat();
    }
}

 */