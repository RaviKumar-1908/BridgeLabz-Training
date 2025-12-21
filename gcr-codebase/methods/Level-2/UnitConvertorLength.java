//creating a class UnitConvertorLength to convert the values in other unit
import java.util.Scanner;
class  UnitConvertor{

	//creating  functions to return the converted value
    public static double convertKmToMiles(double km){
	double km2miles = 0.621371;
	return km *  km2miles;
    } 


    public static double convertMilesTokm(double miles){
	double miles2km = 1.60934;
	return miles *  miles2km;
    }

    public static double convert<etersToFeet(double meters){
	double meters2feet = 3.28084;
	return meters *  meters2feet ;
    }

    public static double convertFeetToMeters(double feet){
	double feet2meters = 0.3048;
	return feet *  feet2meters;
    }

    public static void main(String[] args){
   	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number :");
	int input = sc.nextInt();
	
	//printing outputs
	System.out.println(UnitConvertor.convertKmToMiles(input));
        System.out.println(UnitConvertor.convertMilesToKm(input));
        System.out.println(UnitConvertor.convertMetersToFeet(input));
        System.out.println(UnitConvertor.convertFeetToMeters(input));

	sc.close();
    }
}