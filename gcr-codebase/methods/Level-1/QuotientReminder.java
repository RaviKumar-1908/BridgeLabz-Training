//creating a FindQuotientReminder to find quotient and reminder of two number
import java.util.Scanner;
class QuotientReminder {

    // this function
    public static int[] calculateQuotientReminder(int number, int divisor){
	int[] arr =  new int[2];
	arr[0]  = number / divisor;
	arr[1]  = number % divisor;
	return arr;
    }

    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	    
	//creating variable and taking user's input
	System.out.print("Enter number :" );
	int number = sc.nextInt();
	System.out.print("Enter divisor :" );
	int divisor = sc.nextInt();
	
	//calling function to get quotient and reminder
	int[] arr = calculateQuotientReminder (number, divisor);
	
	//printing the output
	System.out.println("Quotient: " + arr[0] );
	System.out.println("Reminder: " + arr[1] ); 
	
	  sc.close();  
    }
}