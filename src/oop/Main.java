package oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Dog
        Dog dogLabus = new Dog();
        dogLabus.age = 3;
        dogLabus.name = "Labus";
        dogLabus.color = "brown";
        System.out.println(dogLabus.age);
        System.out.println(dogLabus.name);
        System.out.println(dogLabus.color);
        dogLabus.bark();
        dogLabus.run();

        Dog dogRex = new Dog("Rex", "black", 7);
        System.out.println(dogRex.name + " is " + dogRex.color +  " color and is " + dogRex.age + " years");
        dogRex.bark();
        dogRex.run();

        // Calculator
        Calculator calculator = new Calculator();
        int sum = calculator.computeSum(1, 2);
        System.out.println("Sum: " + sum);
        int diff = calculator.computeDiff(34, 18);
        System.out.println("Difference: " + diff);
        int factorial = calculator.computeFact(12);
        System.out.println("Factorial: " + factorial);

        //Car
        Car carAudi = new Car(250);
        carAudi.brand = "Audi";
        System.out.println("The brand is " + carAudi.brand + " and has maxim speed: " + carAudi.maxSpeed);

        Car carVolkswagen = new Car(280);
        carVolkswagen.brand = "Volkswagen";
        System.out.println("The brand is " + carVolkswagen.brand + " and has maxim speed: " + carAudi.maxSpeed);

        System.out.println("Each car has " + Car.NUMBER_OF_WHEELS + " wheels");


        System.out.println();

        //Menu for Car
        Car myCar = new Car(180);
        Scanner console = new Scanner(System.in);
        int option;

        do {
            printMenu();
            option = console.nextInt();
            performSelectedAction(myCar, option, console);
        } while (option != 6);

    }

    public static void performSelectedAction(Car car, int option, Scanner console) {
        switch (option) {
            case 1:
                car.startCar();
                break;
            case 2:
                System.out.println("Enter speed to accelerate.");
                int accSpeed = console.nextInt();
                car.accelerate(accSpeed);
                System.out.println("The speed of the car is now: " + car.currentSpeed);
                System.out.println("The gear is now: " + car.getCurrentGear());
                break;
            case 3:
                System.out.println("Enter speed to decelerate.");
                int decelerateSpeed = console.nextInt();
                car.decelerate(decelerateSpeed);
                System.out.println("The speed of the car is now: " + car.currentSpeed);
                break;

            case 6:
                System.out.println("You left the application.");
                break;
            default:
                System.out.println("The entered option is invalid, try again.");

        }
    }

    public static void printMenu() {
        System.out.println("Driver menu.");
        System.out.println("1. Start the car.");
        System.out.println("2. Accelerate.");
        System.out.println("3. Decelerate.");
        System.out.println("4. Convert a distance from km to miles.");
        System.out.println("5. Display the details of the car.");
        System.out.println("6. Exit.");
        System.out.println("Choose the option");
    }

}


