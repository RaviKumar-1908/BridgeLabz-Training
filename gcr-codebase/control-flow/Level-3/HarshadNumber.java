//create a class HarshadNumber to find whether the input is harshad number or not
import java.util.Scanner;
class HarshadNumber{
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	//creating variables and taking user's input
	System.out.print("Enter the number ");
	int input  = sc.nextInt();
	int originalNumber = input;
	

	//calculating sum of the input digit
	int sum = 0;
	while( originalNumber != 0){
	    int reminder = originalNumber % 10;
	    sum+=reminder;
	    originalNumber/=10;
	}
	
	//displaying the output 
	if ( input % sum == 0)
	    System.out.println("Harshad Number");
	else 
	    System.out.println("Not a Harshad Number");
	
	
	sc.close();
    }
}