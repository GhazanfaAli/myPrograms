// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.age = 23;
        p2.age = 222;
        p2.name = "world";
        p1.name = "avatar";
        System.out.println(p1.age + " " + p1.name);
        System.out.println(p2.age + " " + p2.name);
        p1.eat();
        p2.walk();
        p1.steps(9);

    }
}

class Person {
    String name;
    int age;

    void walk() {
        System.out.println(name + " is walking");
    }

    void eat() {
        System.out.println(name + " is eating");
    }

    void steps(int n) {
        System.out.println(name + " walks " + n);
    }
}

/*

==> Initialization through method

class Student{
 int rollno;
 String name;
 void insertRecord(int r, String n){
  rollno=r;
  name=n;
 }
 void displayInformation(){System.out.println(rollno+" "+name);}
}
class TestStudent4{
 public static void main(String args[]){
  Student s1=new Student();
  Student s2=new Student();
  s1.insertRecord(111,"Karan");
  s2.insertRecord(222,"Aryan");
  s1.displayInformation();
  s2.displayInformation();
 }
}
.....................................................................
==> anonymous object

class Calculation{
 void fact(int  n){
  int fact=1;
  for(int i=1;i<=n;i++){
   fact=fact*i;
  }
 System.out.println("factorial is "+fact);
}
public static void main(String args[]){
 new Calculation().fact(5);//calling method with anonymous object
}
}


==> Creating multiple objects by one type only
Rectangle r1=new Rectangle(), r2=new Rectangle();//creating two objects
 */