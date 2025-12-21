//creating a  class FindWindChill to determine the windchill temperature

import java.util.Scanner;
class  WindChill{
    
    //this function return the windchill temperature
    public static double caculateWindChill (double temp, double windSpeed){
	double windChillValue = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75 ) * Math.pow(windSpeed, 0.16);
	return windChillValue;
    }

    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	    
	//creating variable and taking user's input
	System.out.print("Enter temperature :" );
	double temp = sc.nextInt();
	System.out.print("Enter Wind Speed:" );
	double windSpeed = sc.nextDouble();
	
	//calling function to get maximum handshakes
	double windChill = caculateWindChill (temp, windSpeed);
	
	//printing the output
	System.out.println("wind speed: " + windChill ); 
	
	  sc.close();  
    }
}