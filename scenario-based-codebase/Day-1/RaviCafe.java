/*Problem 1: The Coffee Counter Chronicles

Ravi runs a café where customers order different types of coffee with specific quantities.

Write a Java program that asks the user for the coffee type using switch, accepts quantity, calculates the total bill using price multiplied by quantity, adds GST using arithmetic operators, and continues serving customers using a while loop. The program should stop when the user types “exit”.*/


import java.util.*;
public class RaviCafe{

    public static int generateBill(String input, Scanner sc){
	
	String[] items = {"Tea", "Coffee", "Chocolate"};
	int[] prices = {10, 20, 15};
	int total = 0;
	switch(input){
	    case "Tea":
		System.out.print("enter quantities: ");
		int quantity = sc.nextInt();
		total = quantity * prices[0];
		System.out.println(input + "----"+ quantity + " =" + (prices[0]*quantity));
		
		break;
	    case "Coffee":
		System.out.print("enter quantities: ");
		 quantity = sc.nextInt();
		total = quantity * prices[1];
		System.out.println(input + "----"+ quantity + " =" + (prices[1]*quantity));
		
		break;

                case "Chocolate":
		System.out.print("enter quantities: ");
		 quantity = sc.nextInt();
		total = quantity * prices[2];
		System.out.println(input + "----"+ quantity + " =" + (prices[2]*quantity));
		
		break;
	}

	return total;
	}


    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int total = 0;
	while ( true ){
	    System.out.print("Enter Tea, Coffee, Chocolate :");
             String input = sc.next();
		if( input.equals("exit"))
		  break;
	     total = total + generateBill(input, sc);
	}
	double totalAfterGst =  total * 1.05; 
System.out.println("Grand Total After GST ( 5% ) ----:" + totalAfterGst);
    sc.close();
    }	
}