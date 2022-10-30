package oop;

//Create the Dog class:
//a dog has the attributes: name, color, breed
//a dog has the behaviors: bark, run

public class Dog {
    String name;
    String color;
    int age;

    Dog() {
    }

    Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    void bark() {
        System.out.println(name + " bark ");
    }

    void run() {
        System.out.println(name + " run ");
    }

}
