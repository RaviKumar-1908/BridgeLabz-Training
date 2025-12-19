//create a class CanVote to determine whether a student can vote or not
import java.util.Scanner;
class CanVote{
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	//creating an array and taking input from user
	int[] arr = new int[10];
	for ( int i = 0; i < arr.length ; i++)
	{
	    System.out.print("Enter the " + (i+1) + " student ");
	    arr[i] = sc.nextInt();
	}
	
	// checking condition and printing output
	for ( int i = 0; i < 10 ; i++)
	{
	    if ( arr[i] >= 18)
	        System.out.println("The student with the age " + arr[i] + " can vote");
	    else
		System.out.println("The student with the age " + arr[i] + " can't vote");
	}
	
	
	
	sc.close();
    }
}