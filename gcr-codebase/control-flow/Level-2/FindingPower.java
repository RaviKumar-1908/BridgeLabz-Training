//creating a class FindingPower to find the power of a number given by user
import java.util.Scanner;
class FindingPower{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	//creating three variable and taking input from the user
	System.out.print("Enter a number: ");
	int number = sc.nextInt();
	System.out.print("Enter a power: ");
	int power = sc.nextInt();
	int result = 1;

	// finding power using for loop
	for ( int i=1 ; i<=power ;i++){
	     result *= number;
	}
	
	//displaying the output
	System.out.println("the result for the input is: " + result);
	


	sc.close();
	}
    }