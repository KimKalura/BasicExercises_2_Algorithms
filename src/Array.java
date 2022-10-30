public class Array {
    public static void main(String[] args) {

//Write a program to search for a phone number in a list of numbers. The program will print "the number was found" or "the number was not found"

        int[] numbers = {3, 14, 27, 51, 99};
        System.out.println("number from index 2 is: " + numbers[2]);
        System.out.println("the length of array: " + numbers.length);

        numbers[3] = 52;
        System.out.println("number from index 3 is modified in " + numbers[3]);

        System.out.println("Display the elements of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Searching for the number in the array:");
        int searchNumber = 66;
        boolean isFound = false;
        System.out.println("Each number from array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            if (numbers[i] == searchNumber) {
                System.out.println("the number was founded");
                isFound = true;
                break;
            }
        }
        if (isFound == false) {
            System.out.println("the number was not founded");
        }


//Write a program to display the average price per square meter, from a list of real estate prices:
//Example: for int[] prices = {1, 7, 3, 10, 9}, the value 6 will be displayed in the console

        int[] prices = {5, 25, 36, 14};
        int sum = 0;

        for (int i = 0; i < prices.length; i++) {
            sum = sum + prices[i];
        }
        System.out.println("The sum of the prices: " + sum);

        int averagePrice = 0;
        averagePrice = sum / prices.length;
        System.out.println("The average price: " + averagePrice);

    }
}
