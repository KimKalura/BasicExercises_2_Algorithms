import java.util.Scanner;

public class Methods_Functions {
    public static void main(String[] args) {
//3. Write a program that checks if a number entered from the keyboard is a prime number.
//Input: x=7 => Result: "7 is a prime number"
//Input: x=12 => Result: "12 is not a prime number"
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = console.nextInt();
        isPrime(number);


       isPrime2();
    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                System.out.println(number + " is not prime number");
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number");
        }
        return isPrime;
    }

    public static boolean isPrime2() {
        int[] numbers = {5, 9, 11, 6, 4, 8};
        boolean isPrime2 = true;
        for (int i = 0; i < numbers.length; i++) {
            isPrime(numbers[i]);
        }
        return isPrime2;
    }
}
