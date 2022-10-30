import java.util.Scanner;
public class SwitchStatement {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int day;
        System.out.print("Enter the number of the day ");
        day = console.nextInt();


        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
                break;
        }
    }
}
