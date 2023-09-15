import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

// --> for loop, while, do-while

/*  --> for loop

        System.out.println("enter a number for factoiral:");
        Scanner obj1 = new Scanner(System.in);
        int n = obj1.nextInt();

        int count = 1;
        if(n == 0){
            System.out.println(1);
        }
        else if(n < 0) {
            System.out.println("number is negative or out of range");
        }
        for(int i = 1; i<=n; i++){
            count = count*i;

        }
        System.out.println("value of "+n+" fact is "+count);
 ----------------------------------------------------------------------
 --> while loop

    System.out.println("enter a number for fibonacci:");
    Scanner obj1 = new Scanner(System.in);
    int n = obj1.nextInt();
    int fact, fact1=0, fact2=1;
    int i = 0;
    System.out.println("0");
    System.out.println("1");
    while(i <= n){
        fact = fact1+fact2;
        fact1 = fact2;
        fact2 = fact;
        System.out.println(fact);
        i++;
    }
----------------------------------------------------------------------
--> do-while loop

            int n = 2, i = 1;
        do{
            System.out.println(n +" x "+i + " = "+n*i );
            i++;

        }while (i <= 10);

 */
    }
}