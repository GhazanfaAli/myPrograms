//class A2{
//    static{System.out.println("static block is invoked");}
/*
Q) Can we execute a program without main() method?
        Ans) No, one of the ways was the static block, but it was
        possible till JDK 1.6. Since JDK 1.7, it is not possible to execute a Java class without the main method.

 */
class Student {
    int rollno;
    String name;
    static String college = "ILTS";
    static int count;

    Student(int i, String n) {
        rollno = i;
        name = n;
        count++;
        System.out.println(count);
    }

    //method to display the values
    void display() {
        System.out.println(rollno + " " + name + " " + college);

    }

}

class Teacher1 {

    static String school = "opf";

    static void change() {
        school = "dawn";
        System.out.println(school);
    }


}

public class Stat_key {
    public static void main(String[] args) {
        Student obj1 = new Student(22, "ali");
        Student obj2 = new Student(32, "akram");
        Student obj3 = new Student(32, "akram");
        //we can change the college of all objects by the single line of code
        Student.college = "BBDIT";
        obj1.display();
        obj2.display();
        Teacher1.change();


    }
}
