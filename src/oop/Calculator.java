package oop;

//Create a Calculator class that has the following behaviors:
// sum of two numbers
// difference of two numbers
//the factorial of a number
// !class has no attributes, only behaviors

public class Calculator {
    int computeSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    int computeDiff(int a, int b) {
        int diff = a - b;
        return diff;
    }

    int computeFact(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
