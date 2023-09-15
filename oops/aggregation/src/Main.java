// ==> If a class have an entity reference, it is known as Aggregation.
//        Aggregation represents HAS-A relationship.

class Address{
    String city,state,country;
     Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

}

class Emp{
    int id;
    String name;
 Address address;
 Emp(int id, String name, Address address){
     this.id = id;
     this.name = name;
     this.address= address;

 }
 void display(){
     System.out.println(id+" "+name);
System.out.println(address.city+" "+address.state+" "+address.country);
 }

}

public class Main {
    public static void main(String[] args) {
    Address address1  = new Address("gzb", "UP", "CANDA");
    Address address2  = new Address("gzb", "UP", "pakistan");
    Emp e1 = new Emp(111, "varun", address1);
    Emp E2 = new Emp(112, "ali", address2);
        e1.display();
        E2.display();
    }
}