public class SleepMethod extends Thread{
    public void run2(){

        Thread th = Thread.currentThread();
        String name = th.getName();

        for(int i = 1; i<=5; i++){
            System.out.println(i+" "+name);

            try{
                Thread.sleep(250);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }

    }
    public static void main(String[] args)
    {

        SleepMethod th1 = new SleepMethod();
        th1.start();
        Thread th = Thread.currentThread();
        String name = th.getName();

        for(int i = 1; i<=5; i++){
            System.out.println(i + " "+name);

        try{
            Thread.sleep(250);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        }
    }

    }

