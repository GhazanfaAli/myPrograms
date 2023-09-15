//import java.lang.management.ManagementFactory;
//import java.util.ArrayList;
//
//class StuentTest{
//    String name;
//    int age;
//    StuentTest(String s, int a){
//        name = s;
//        age = a;
//    }
//}
//class StudentManagement{
//    ArrayList<StuentTest> list = new ArrayList<>();
//    void addStudent(StuentTest s){
//
//    }
//    void print(){
//
//    }
//}
//
//class main{
//    public static void main(String[] args) {
//    StuentTest t1 = new StuentTest("nk", 25);
//        StudentManagement manage = new StudentManagement();
//        manage.addStudent(t1);
//
//    }
//}

class curtomExcetion extends Exception{
    curtomExcetion(String message){
        super(message);
    }
}

class main{
    public static void main(String[] args) {


        try {
            throw new curtomExcetion("erro has been occur");
        }
        catch (curtomExcetion e){
            System.out.println("solved");
            System.out.println(e.getMessage());
        }


    }
}