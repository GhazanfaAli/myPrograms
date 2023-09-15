//==> copy constructor
class Students{
    int id;
    String name;
    Students(int i, String n){
        id = i;
        name = n;
    }
    Students(Students a1){
        id = a1.id;
        name = a1.name;;
    }
    void display(){
        System.out.println((id+id) + " "+ name);
    }
}
/*
   ==> Copying values without constructor
    We can copy the values of one object into another by assigning the objects values to another object.
    In this case, there is no need to create the constructor.
 */

class Person1{
    int id;
    String name;
    Person1(int i, String n){
        id = i;
        name = n;
    }
      Person1(){}
        void display() {
        System.out.println(id+" "+name);
    }

}
public class copy_constr {
    public static void main(String args[]){
        Students obj1 = new Students(23, "ali");
        Students obj2 = new Students(obj1);
        obj1.display();
        obj2.display();

    Person1 obj3 = new Person1(90, "rizwan");
    Person1 obj4 = new Person1();
    obj4.name = obj3.name;
    obj4.id = obj3.id;
    obj3.display();
    obj4.display();


    }
}
