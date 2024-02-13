//Question 2: Fibonacci Sequence
//Write a program to generate the Fibonacci sequence up to 100.


public class Fibonacci {

    public static void main(String[] args){
        int z=0;
        int x=0;
        int y=1;
        System.out.println("Fibonacci sequence upto 100:");
        while (z<=100){
            System.out.print(z+ " ");
            z=x+y;
            x=y;
            y=z;
        }
    }
}


//output:
// Fibonacci sequence upto 100:
//0 1 2 3 5 8 13 21 34 55 89
//Process finished with exit code 0
