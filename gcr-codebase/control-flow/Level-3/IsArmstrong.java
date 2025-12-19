//create a class IsArmstrong to check whether a number is Armstrong or not
import java.util.Scanner;
class IsArmstrong{
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	//creating a variable and taking user's input
	System.out.print("Enter a number: ");
	int input = sc.nextInt();
	int sum = 0;
	int originalNumber = input;
	

	//checking the total digit of that number and putting the input back to originalNumber
	int digitCount = 0;
	while(originalNumber!=0){
	    digitCount++;
	    originalNumber/=10;
	}
	originalNumber = input;
	
	// while loop to find the sum of cube of individual digits 
	while (originalNumber != 0){
	    int reminder = originalNumber % 10;
	    sum  += (Math.pow(reminder, digitCount));
	    originalNumber/=10;
	}
	
	//comparing and printing result
	if ( sum == input )
	    System.out.println( "Armstrong Number ");
	else 
	    System.out.println(" Not Armstrong");
	
	
	sc.close();
    }
}