public class Main extends Thread
{

    /*
    thread is a smallest execution unit
    threadpool
    periyamt
    th.0, th.1, th.2 ...........

    call stack
    separate call stack allocate

    activation record pushed
    scheduled to cpu

     */
    public void run(){
       // System.out.println("Hello world!!!");
//        for(int i = 0; i<9; i++){
//            System.out.println(i);
//        }
        int c=10;
        c = c/0;
    }
   
    public static void main(String[] args)
    {
        Main th1 = new Main();
        th1.start();


    }
}