/*
we can initialize java final variable with three patterns

-> 1) Java final variable
    If you make any variable as final, you cannot change the value of final variable(It will be constant).

-> 2) Java final method
    If you make any method as final, you cannot override it.

-> 3) Java final class
    If you make any class as final, you cannot extend it.

................................................................................

=> Q) Is final method inherited?

->Ans) Yes, final method is inherited but you cannot override it. For Example:

class Bike{
  final void run(){System.out.println("running...");}
}
class Honda2 extends Bike{
   public static void main(String args[]){
    new Honda2().run();
   }
}
/////////////////////////////////////////////////////////////////////////////////

--> Example of static blank final variable

class A{
  static final int data;//static blank final variable
  static{ data=50;}
  public static void main(String args[]){
    System.out.println(A.data);
 }
}
///////////////////////////////////////////////////////////////////////////

--> Q) What is final parameter?

If you declare any parameter as final, you cannot change the value of it.

class Bike11{
  int cube(final int n){
   n=n+2;//can't be changed as n is final
   n*n*n;
  }
  public static void main(String args[]){
    Bike11 b=new Bike11();
    b.cube(5);
 }
}
//////////////////////////////////////////////////////////////////////

->Q) Can we declare a constructor final?
    = No, because constructor is never inherited.

 */



public class Main {
    public static void main(String[] args) {


    }
}
