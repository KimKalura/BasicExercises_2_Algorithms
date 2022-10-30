public class Conditionals {
    public static void main(String[] args) {

//You produce software for a kettle. You have available the temperature variable, which stores the current water temperature.
    //• displays an appropriate message if the temperature is higher than 100 degrees (boiling water)
    //• displays an appropriate message if the water is boiling, and another appropriate message otherwise
    //• displays a corresponding message if the temperature is higher than 100 degrees (water is boiling),
    // another message if the temperature is lower than 50 degrees (water is in the process of boiling)
    // and another if the water has a temperature between 50 and 100 degrees (the water is almost boiled)

        int temperature = 20;
        System.out.println(temperature);
        temperature = -120;
        System.out.println(temperature);
        //temperature = 70;

        if (temperature > 100) { // T>100 [100, infinite]
            System.out.println("water is boiling");
        } else if (temperature > 50 && temperature < 100) { // T=[50, 100] 70>50 70<100
            System.out.println("the water is almost boiling");
        } else if (temperature > 0 && temperature < 50) { // T=[0, 50] 70>0 70<50 f
            System.out.println("the water does not boil");
        } else { // T=[-infinite,0]
            System.out.println("the water froze");
        }

        //option2
        /*int temperature = 120;
        System.out.println("The current water temperature is " + temperature);
        if (temperature > 100) {
            System.out.println("water is boiling");
        } else if (temperature > 50 && temperature < 100) {
            System.out.println("the water is almost boiling");
        } else if (temperature < 50) {
            System.out.println("water is in the process of boiling");
        } else {
            System.out.println("the water froze");
        }*/

    }
}