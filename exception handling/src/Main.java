//==> there are three types of error in java
// syntax, logical, runtime
// syntax error -> a syntax error occurs when the programmer writes an instruction using incorrect syntax

// logical error -> it is a bug in a program that causes it to operate incorrectly or A logic error is classified
//              as a type of runtime error that can result in a program producing an incorrect output

// A runtime error -> it is a problem that happens during the execution of a program When runtime errors occur
// after a program has been distributed to the public, developers often release patches, or small updates
// designed to fix the errors.


public class Main {
    public static void main(String[] args) {

        int a[] = new int[3];
        try{
            System.out.println(a[4]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("error occurs in our program");
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println("below the line");

        System.out.println();
        try{
            System.out.println(2/0);
        } catch (Exception e){
            System.out.println("error occurs in our programm");
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println("below the line");

    }

}