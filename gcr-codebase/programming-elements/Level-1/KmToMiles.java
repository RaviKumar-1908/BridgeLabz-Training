// creating a class KmToMiles to convert kilometers to miles
import java.util.Scanner;

class KmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaring variable to store kilometers
        double km;

        // Taking user input
        km = sc.nextDouble();

        // Calculating miles 
        double miles = km / 1.6;

        // Displaying the result
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}
