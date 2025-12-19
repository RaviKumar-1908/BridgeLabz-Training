//creating a class FindingPowerWhileLoop to find the power of a number given by user
import java.util.Scanner;
class FindingPowerWhileLoop{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	//creating three variable and taking input from the user
	System.out.print("Enter a number: ");
	int number = sc.nextInt();
	System.out.print("Enter a power: ");
	int power = sc.nextInt();
	int result = 1;
	int temp  = 0;

	// finding power using for loop
	while(temp!=power){
	    result *= number;
       	    temp++;
	}	


	//displaying the output
	System.out.println("the result for the input is: " + result);
	


	sc.close();
	}
    }