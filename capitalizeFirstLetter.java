//Question 4: Capitalize Words
//Write a program that accepts a string as input, capitalizes the first letter of each word in the
//string, and then returns the result string.


import java.util.Scanner;

public class capitalizeFirstLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        String capitalizedString = capitalizeWords(input);
        System.out.println("Capitalized String: " + capitalizedString);
        scanner.close();
    }

    public static String capitalizeWords(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder result = new StringBuilder(str.length());
        boolean capitalizeNext = true;

        for (char c : str.toCharArray()) {
            if (Character.isWhitespace(c)) {
                capitalizeNext = true;
            } else if (capitalizeNext) {
                c = Character.toTitleCase(c);
                capitalizeNext = false;
            }
            result.append(c);
        }

        return result.toString();
    }
}


//output:
//Enter a string:
//i used java as my coding languange
//Capitalized String: I Used Java As My Coding Languange
//
//Process finished with exit code 0