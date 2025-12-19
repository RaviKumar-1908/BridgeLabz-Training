


//create a class CheckPositiveNegativeOrZero to check whether number is positive, negative, or zero
import java.util.Scanner;
class CheckPositiveNegativeOrZero{
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	//creating an array and taking input from user
	int[] arr = new int[5];
	for ( int i = 0; i < 5 ; i++)
	{
	    System.out.print("Enter the " + (i+1) + "st number ");
	    arr[i] = sc.nextInt();
	}
	
	// checking condition and printing output
	for ( int i = 0; i < 5 ; i++)
	{
	    if ( arr[i] > 0)
	        System.out.println("Positive");
	    else if ( arr[i] < 0 )
		System.out.println("Negative");
            else
		System.out.println("zero");
	}
	
	// checking whether the first and last number are same or not
	if ( arr[0] > arr[4])
	    System.out.println("Greater");
	else if ( arr[0] < arr[4])
            System.out.println("Lesser");
	else 
	    System.out.println("Equal");
	
	sc.close();
    }
}