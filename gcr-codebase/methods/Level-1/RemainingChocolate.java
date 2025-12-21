//creating a FindRemainingChocolate to find distribution among students and remaining one
import java.util.Scanner;
class RemainingChocolate{

    // this function return an array containing each chocolate and reminder
    public static int[] calculateQuotientReminder(int N, int M){
	int[] arr =  new int[2];
	arr[0]  = N / M;
	arr[1]  = N % M;
	return arr;
    }

    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	    
	//creating variable and taking user's input
	System.out.print("Enter N :" );
	int N = sc.nextInt();
	System.out.print("Enter M :" );
	int M = sc.nextInt();
	
	//calling function to get quotient and reminder
	int[] arr = calculateQuotientReminder (N, M);
	
	//printing the output
	System.out.println("Each child gets: " + arr[0] );
	System.out.println("Reminder chocolate: " + arr[1] ); 
	
	  sc.close();  
    }
}