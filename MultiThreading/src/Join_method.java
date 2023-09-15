/*
dead lock arise
// a thread goes to sleep upto another thread complete it's own execution

 */
class Joining_method extends Thread {
    public void run() {
        try{
        this.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
}

public class Join_method {
    public static void main(String[] args) throws InterruptedException {

        Joining_method obj1 = new Joining_method(); // Create an instance of Joining_method
        obj1.start(); // Start the thread, and it will execute the run() method defined in Joining_method
       //obj1.join(); // Wait for the obj1 thread to finish before proceeding

        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
}
