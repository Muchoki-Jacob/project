//Question 3: Power of Two
//Write a program that takes an integer as input and returns true if the input is a power of two.


import java.util.Scanner;

public class isPoweroftwo {
    public static boolean isPowerOfTwo(int n) {

        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        scanner.close();

        System.out.println(num + " is a power of two: " + isPowerOfTwo(num));
    }
}


//output1:
// Enter an integer: 8
//8 is a power of two: true
//
//Process finished with exit code 0

//output 2:
//Enter an integer: 13
//13 is a power of two: false
//
//Process finished with exit code 0