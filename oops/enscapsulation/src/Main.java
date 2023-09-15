// =>Encapsulation in Java is a process of wrapping code and data together into a single unit

 class A {
   private int age;
   private String name;

   void setAge(int age){
       this.age=age;
   }
   int getAge(){
        return age;
    }
   void setName(String name){
       this.name = name;
   }
  String getName(){
       return name;
  }
}

public class Main{
    public static void main(String args[]){

        A obj1 = new A();
        obj1.setAge(22);
        obj1.setName("ali");
        System.out.println(obj1.getAge());
        System.out.println(obj1.getName());

    }
}