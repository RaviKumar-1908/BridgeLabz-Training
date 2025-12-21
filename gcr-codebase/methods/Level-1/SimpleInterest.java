//creating a classSimpleInteres to find the SI 

import java.util.Scanner;

class SimpleInterest {

    public static double calculateSI(double principal, double rate, double time){
	double siValue = (principal * rate * time)/100;
	return siValue;
    }


	
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	    
	//creating variable and taking user's input
	System.out.print("Enter Principal :" );
	double principal = sc.nextDouble();
	System.out.print("Enter Principal :" );
	double rate = sc.nextDouble();
	System.out.print("Enter Principal :" );
	double time= sc.nextDouble();

	//calling function to get simple interest
	double simpleInterest = calculateSI(principal, rate, time);
	
	//printing the output
	System.out.println("The Simple Interest is " + simpleInterest + " for principal " + principal + " Rate of interest " + rate + " and Time " + time); 
	
	 sc.close();   
    }
}