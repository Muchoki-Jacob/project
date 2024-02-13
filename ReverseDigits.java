//Question 5: Reverse IntegerWrite a program that takes an integer as input and returns an integer with reversed digit
//ordering.


import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int input = scanner.nextInt();
        int reversed = reverseDigits(input);
        System.out.println("Reversed integer: " + reversed);
        scanner.close();
    }

    public static int reverseDigits(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
}


//output:
//Enter an integer:
//1789
//Reversed integer: 9871
//
//Process finished with exit code 0