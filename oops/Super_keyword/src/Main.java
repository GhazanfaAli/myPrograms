/*
->super can be used to refer immediate parent class instance variable.
->super can be used to invoke immediate parent class method.
->super() can be used to invoke immediate parent class constructor.
 */

class A{
    A(){
        System.out.println("CLASS A");

    }
    int z = 4;
   public void f1(){
    System.out.println("class A IS here");
    }
}

class B extends A{
    B(){
        super();
        System.out.println("b is here");
    }
    int z = 3;
    public void f1(){

        super.f1();
        System.out.println("class B IS here");
    }
    public void f2(){

        int z;
        z = 2;
       // this.z =3;
       // super.z = 4;
        System.out.println("z = "+z);
        System.out.println("z = "+this.z);
        System.out.println("z = "+super.z);

    }
}
public class Main {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.f1();
        obj1.f2();

    }
}