import java.util.Scanner;

public class StringExercises {

    public static void main(String[] args) {
        //1
        computeLength();

        //2
        getChar();

        //3
        computeReversed();

        //4
        boolean isPalindrom = isPalindrom("ana");
        System.out.println(isPalindrom);
    }

//1.Write a program to display the length of a String:
    public static void computeLength() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a text");
        String text = console.nextLine();
        int length = text.length();
        System.out.println("The length is: " + length);
    }

//2.Write a program to display the character from a certain index in the String.
    public static void getChar() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a text");
        String text = console.nextLine();
        System.out.println("Enter the index");
        int index = console.nextInt();
        char character = text.charAt(index);
        System.out.println("The character from the position " + index + " is " + character);
    }

//3. Do you want when the user enters a password to the account, to enter it reversed in the database, so that it cannot be read by someone else.
//Write a program that reverses a word.
//Example: string word= "avaJ", it will be displayed in the "Java" console
//Use the reverse function, then solve the problem without using the reverse() method.
    public static void computeReversed() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the word you want to reverse: ");
        String word = console.nextLine();
        String reversedWord = reversedString(word);
        System.out.println("The reversed word is: " + reversedWord);
    }

    public static String reversedString(String word) {
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        return reversed;
    }

//4. Write a program that checks if a word is a palindrome
    public static boolean isPalindrom(String word) {
        boolean isPalindrom = false;
        String reverseString = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverseString = reverseString + word.charAt(i);
        }
        System.out.println(reverseString);
        if (word.equals(reverseString)) {
            isPalindrom = true;
        }
        return isPalindrom;
    }
}
