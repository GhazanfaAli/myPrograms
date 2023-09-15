
class Mythread implements Runnable{
    

//    Mythread(){
//        new Thread(this).start();
//    }

   public void run(){
    for(int i = 1; i<=5; i++){
        System.out.println(i);

    }
    }
}

public class RunableThread {

    public static void main(String[] args) {

        Mythread obj1 = new Mythread();

        Thread th1 = new Thread(obj1);
        th1.start();

    }

    }
