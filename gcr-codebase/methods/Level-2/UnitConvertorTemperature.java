// Creating a class UnitConvertorTemperature to convert values between units
import java.util.Scanner;

class UnitConvertorTemperature{
	//creating functions to return converted value
    public static double convertFarhenheitToCelsius(double farhenheit) {
        return (farhenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFarhenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;

    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value:");
        double input = sc.nextDouble();

	//printing output
         System.out.println("Fahrenheit to Celsius: " + convertFarhenheitToCelsius(input));
        System.out.println("Celsius to Fahrenheit: " + convertCelsiusToFarhenheit(input));
        System.out.println("Pounds to Kilograms: " + convertPoundsToKilograms(input));
        System.out.println("Kilograms to Pounds: " + convertKilogramsToPounds(input));
        System.out.println("Gallons to Liters: " + convertGallonsToLiters(input));
        System.out.println("Liters to Gallons: " + convertLitersToGallons(input));


        sc.close();
    }
}
