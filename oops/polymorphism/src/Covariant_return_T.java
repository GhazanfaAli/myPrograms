class A{
    A user(){
        System.out.println("A is here");
        return this;
    }
}

class B extends A{
    @Override
    B user() {
        System.out.println("B is here");
        return this;
    }

}

public class Covariant_return_T {
    public static void main(String args[]){
        B obj1 = new B();
        obj1.user();

    }
}
