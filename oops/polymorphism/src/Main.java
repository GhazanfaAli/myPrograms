import javax.swing.text.html.StyleSheet;
/*
This type of polymorphism is achieved by function overloading or operator overloading.
"==> Note: But Java doesn’t support the Operator Overloading."

// -->  changing no. of arguments, changing data type of arguments
// "Overloading with Type Promotion in case of ambiguity"
// overriding means = use one's authority to reject or cancel (a decision, view, etc.).

--> It is because the static method is bound with class whereas instance method is bound with an object.
        Static belongs to the class area, and an instance belongs to the heap area.

--> Why Method Overloading is not possible by changing the return type of method only?

 */
class Pen {
    int price;
    String name;

    void pirntInfo(int price) {
        System.out.println("price " + price);
    }

    void pirntInfo(String name) {
        System.out.println("name " + name);
    }

    void pirntInfo(String name, int price) {
        System.out.println(price + " " + name);
    }

    void print() {
        System.out.println("overriding called for pen");
    }
}

class Pencil extends Pen {
    void print() {
        System.out.println("overriding called for pencil func");
    }
}


public class Main {
    public static void main(String[] args) {
        Pen obj1 = new Pen();
        obj1.name = "dollar";
        obj1.price = 22;
        obj1.pirntInfo(obj1.name);
        obj1.pirntInfo(obj1.price);
        obj1.pirntInfo(obj1.name, obj1.price);

        Pencil obj2 = new Pencil();
        obj2.print();
        Pen obj = new Pencil();
        obj.print();


    }
}

/*
==> Overload java main() method

class TestOverloading4{
public static void main(String[] args){System.out.println("main with String[]");}
public static void main(String args){System.out.println("main with String");}
public static void main(){System.out.println("main without args");}
}
...................................
Method Overloading with TypePromotion
Method Overloading with Type Promotion if matching found
Method Overloading with Type Promotion in case of ambiguity
 */

