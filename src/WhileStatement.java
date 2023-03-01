import java.util.Scanner;

public class WhileStatement {

    public static void main(String[] args) {
//Write a program that displays the numbers from 1 to 10.

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

//Write a program to display the sum of numbers from 1 to 10.

        /*int i = 1;
        int sum = 0;
        while (i <= 10) {
            System.out.println(i);
            sum = sum + i;
            i++;
        }
        System.out.println("The sum of numbers from 1 to 10 is: " + sum);*/

//Write a program to display the even numbers from 1 to 10.
        //option 1
        /*int i = 1;
        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }*/

        //option 2
        /*int i = 2;
        while (i <= 10) {
            System.out.println(i);
            i+=2;
        }*/

//Write a program to display the sum of numbers divisible by 3, from the interval [1-n],
// n being entered from the keyboard

        /*Scanner console = new Scanner(System.in);
        int n;
        System.out.print("Enter a number to find the sum of numbers divisible by 3:");
        n = console.nextInt();

        int i = 1;
        int sum = 0;
        while (i <= n) {
            if (i % 3 == 0) {
                sum+=i;
            }
            i++;
        }
        System.out.println(sum);*/


//Write a program to reverse the digits of a number.
        int number = 123;
        int reversedNumber = 0;
        int lastDigit;
        while (number > 0) {
            lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number = number / 10;
        }
        System.out.println(reversedNumber);
    }
}