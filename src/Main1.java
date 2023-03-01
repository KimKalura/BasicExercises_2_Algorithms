public class Main1 {
    public static void main(String[] args) {

        /*double newPrice = 20.99;
        double newPrice2 = 10.11;
        double totalPrice;
        totalPrice = newPrice + newPrice2;
        double totalPricePerPerson = totalPrice / 5;
        boolean isMoreExpensive = newPrice > newPrice2;

        System.out.println(totalPrice);
        System.out.println(totalPricePerPerson);
        System.out.println(isMoreExpensive);

        System.out.println(newPrice <= 2);
        System.out.println(newPrice == newPrice2);
        System.out.println(10 / 3);
        System.out.println(10 % 3);

        boolean isAvailable2 = true;
        boolean isAffordable = newPrice2 < 10;
        boolean isAA = isAvailable2 && isAffordable;
        System.out.println(isAA);
        System.out.println(isAffordable || isAvailable2);
        System.out.println(!isAvailable2);*/


        //VARIABLES AND DATA TYPES DEMO
        String city = "Cluj-Napoca"; //declaration+initialization
        String country = "Romania";
        int population; //variable declaration
        population = 18000000;//initialization
        System.out.println(population); //display in the console

        String thisisavariableandicannotfigureoutwhatisitfor; //wrong name for a variable
        String evenIfTheNameIsLongICanReadIt;//wrong name for a variable
        String goodVariableName;


        //VARIABLES AND TYPES OF EXERCISE DATA
        //we retain the information of a product from an online store, using different types of data
        String productName = "mustard";
        double price = 4.99;
        boolean isAvailable = true;
        char nutriScore = 'C';
        boolean isBio = false;

        //we display the product information in the console
        System.out.println(productName);
        System.out.println(price);
        System.out.println(isAvailable);
        System.out.println(nutriScore);
        System.out.println(isBio);


        //EXERCISE OPERATORS
        String productName2 = "ketchup";
        double price2 = 20.99;
        boolean isAvailable2 = true;
        char nutriScore2 = 'A';
        boolean isBio2 = true;

        double totalAmount = price + price2;
        System.out.println(totalAmount);
        //the value of the expression "price<price2", which can be true or false, will be assigned to the variable isMustardCheaper:
        boolean isMustardCheaper = price < price2;
        System.out.println("it is mustard cheaper: " + isMustardCheaper);
        //we display directly in the console the value of the expression "price<2", without assigning it to a variable sum of odd numbers:
        System.out.println(price < 2);
        System.out.println(isBio2 == isAvailable2);
        System.out.println(isBio2 || isAvailable2);
        System.out.println(!isBio2);
    }
}
