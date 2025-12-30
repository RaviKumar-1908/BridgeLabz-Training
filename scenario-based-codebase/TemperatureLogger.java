/*11. Temperature Logger 🌡️
Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks. */


import java.util.Scanner;
public class TemperatureLogger{
     public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	double sum = 0;
        double maxTemp = Double.NEGATIVE_INFINITY; 
   	double [] temperatureArray = new double[7];	
	for ( int i=0;i<7;i++){
	    System.out.print("Enter temperature of " + (i+1) + " days: ");
	    temperatureArray[i] = sc.nextDouble();
	    sum += temperatureArray[i];
	    if ( maxTemp <= temperatureArray[i]){
		maxTemp = temperatureArray[i];
	    }
	        
	}

	System.out.println("============= Output ==========");
	System.out.println("Average Temperature: " + (sum/7.0));
	System.out.println("Maximum Temperature: " + maxTemp);
	sc.close();
     }
}