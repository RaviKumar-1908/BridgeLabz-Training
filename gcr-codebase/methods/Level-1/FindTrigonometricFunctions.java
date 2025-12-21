//creating a --- to find the total number of handshakes among students 

import java.util.Scanner;
class FindTrigonometricFunctions {

    //this function calculates the trignometric functions and return an array of the result
    public static double[] calculateTrigonometricFunctions(double angle){
    	double[] arr = new double[3];
	arr[0] = Math.sin(angle);
	arr[1] = Math.cos(angle);
	arr[2] = Math.tan(angle);
	return arr;
    }

    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	    
	//creating variable and taking user's input
	System.out.print("Enter number:" );
	int number = sc.nextInt();
	
	double angle = number * 3.14 / 1800;

	//calling function
	double[]arr  =calculateTrigonometricFunctions(angle);
	

	System.out.println("sine :" +  arr[0]); 
	System.out.println("cosine :" + arr[1] );
	System.out.println("tnaget :" + arr[2] );
	
	  sc.close();  
    }
}