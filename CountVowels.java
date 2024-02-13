// Question 6: Count Vowels
//Write a program that counts the number of vowels in a sentence.


import java.util.Scanner;

public class CountVowels{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        int vowelCount = countVowels(sentence);
        System.out.println("Number of vowels in the sentence: " + vowelCount);
        scanner.close();
    }

    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}


//output:
//Enter a sentence:
//this is my last project
//Number of vowels in the sentence: 5
//
//Process finished with exit code 0