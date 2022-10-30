package oop;
//Create a Car class:
// a. a car has the following attributes
// number of wheels, full speed, brand, color, current speed, current gear

// b. a car has the following behaviors:
// I. start the car
// II. accelerate (increase the speed by a certain value)
// III. decelerate (decrease speed by a certain amount)
// IV. increase the gear (if it accelerates by more than 20 km/h)
// V. lowers the gear (if it decelerates by more than 20 km/h)

public class Car {
    static final int NUMBER_OF_WHEELS = 4;
    final int maxSpeed;
    String brand;
    String color;
    int currentSpeed;
    private int currentGear;


    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void startCar() {
        System.out.println("The car started.");
        this.currentGear = 1;
        this.currentSpeed = 1;
    }

    public int getCurrentGear() {
        return currentGear;
    }

//Increase the current speed by a certain value.If the speed increases by more than 20 (km/h), the gear will also increase by one unit
    public void accelerate(int aSpeed) {
        if (this.currentSpeed + aSpeed > maxSpeed) {
            System.out.println("The speed limit has been exceeded!");
        } else {
            this.currentSpeed += aSpeed;
            if (aSpeed > 20) {
                this.currentGear++;
            }
        }
    }

//Decrease the speed by a certain value.If the speed drops by more than 20 (km/h), it will go to a lower gear (the gear will be decreased by one unit
    public void decelerate(int dSpeed) {
        if (this.currentSpeed - dSpeed < 1) {
            System.out.println("The car will stop!");
        } else {
            this.currentSpeed -= dSpeed;
            if (dSpeed > 20) {
                this.currentGear++;
            }
        }
    }

    public static double convertKmToMiles(double km) {
        return 0.62 * km;
    }

    @Override
    public String toString() {
        return "My car is {" +
                "maxSpeed=" + maxSpeed +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", currentSpeed=" + currentSpeed +
                ", currentGear=" + currentGear +
                '}';
    }
}
