class Human {
    String name;
    int age;

    Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void display() {
        System.out.println(age + " " + name);
    }

    //this:==> to invoke current class method
    void m() {
        System.out.print("hello m");
    }
    void n() {
        System.out.println("HELLO n");
        //m();//same as this.m()
        this.m();
    }
}

public class ThisKey {
    public static void main(String args[]) {

        Human obj1 = new Human(22, "ali");
        obj1.display();
        obj1.n();

    }
}
/*
3)==> this() : to invoke current class constructor
->Calling default constructor from parameterized constructor:

class A{
A(){System.out.println("hello a");}
A(int x){
this();
System.out.println(x);
}
}
class TestThis5{
public static void main(String args[]){
A a=new A(10);
}}

->Calling parameterized constructor from default constructor:
class A{
A(){
this(5);
System.out.println("hello a");
}
A(int x){
System.out.println(x);
}
}
class TestThis6{
public static void main(String args[]){
A a=new A();
}
}
..........................................................................................
==> Real usage of this() constructor call
 -->It maintains the chain between the constructors i.e. it is used for constructor chaining.

class Student{
int rollno;
String name,course;
float fee;
Student(int rollno,String name,String course){
this.rollno=rollno;
this.name=name;
this.course=course;
}
Student(int rollno,String name,String course,float fee){
this(rollno,name,course);//reusing constructor
this.fee=fee;
}
void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}
}
class TestThis7{
public static void main(String args[]){
Student s1=new Student(111,"ankit","java");
Student s2=new Student(112,"sumit","java",6000f);
s1.display();
s2.display();
}}
  note ~~> Rule: Call to this() must be the first statement in constructor.
.......................................................................................
4)==> this: to pass as an argument in the method

class S2{
  void m(S2 obj){
  System.out.println("method is invoked");
  }
  void p(){
  m(this);
  }
  public static void main(String args[]){
  S2 s1 = new S2();
  s1.p();
  }
}
.........................................................................................

5)==> this: to pass as argument in the constructor call

class B{
  A4 obj;
  B(A4 obj){
    this.obj=obj;
  }
  void display(){
    System.out.println(obj.data);//using data member of A4 class
  }
}

class A4{
  int data=10;
  A4(){
   B b=new B(this);
   b.display();
  }
  public static void main(String args[]){
   A4 a=new A4();
  }
}
.......................................................................................
6 ==> Example of this keyword that you return as a statement from the method

class A{
A getA(){
return this;
}
void msg(){System.out.println("Hello java");}
}
class Test1{
public static void main(String args[]){
new A().getA().msg();
}
}
 */