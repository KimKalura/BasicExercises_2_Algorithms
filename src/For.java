import java.util.Scanner;


public class For {
    public static void main(String[] args) {
//Write a program that displays the numbers from 1 to 10.

        System.out.println("Numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

//Write a program that displays the numbers from 10 to 1.

        System.out.println("Numbers from 10 to 1:");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

//Write a program to display the sum of numbers from 1 to 10.

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of numbers from 1 to 10 is: " + sum);

//Write a program to display the even numbers from 1 to 10.

        System.out.println("Even numbers from 1 to 10:");
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
        }

        //with IF
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        //with WHILE
        /*int i = 2;
        while (i <= 10) {
            System.out.print(i + " ");
            i += 2;
        }*/

        //sum of odd numbers
        /*int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.print("The sum of odd numbers " + sum);*/


//Write a program to display the factorial of a number.

        Scanner console = new Scanner(System.in);
        int n;
        System.out.println("Enter a number to find its factorial:");
        n = console.nextInt();
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial of the number " + n + " is: " + fact);
    }

}
