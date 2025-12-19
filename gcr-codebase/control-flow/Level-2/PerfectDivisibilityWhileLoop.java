//create a class PerfectDivisibilityWhileLoop to find the number which perfectly divide the input
import java.util.Scanner;
class PerfectDivisibilityWhileLoop{
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	//creating a variable and taking user's input
	System.out.print("Enter a number: ");
	int input = sc.nextInt();
	int counter = 1;
	

	//checking for factor from 1 to input and checking whether it is a factor or not
	while (counter < input){
	    if ( input % counter ==0 )
		System.out.println(counter);
		counter++;
	}
	
	sc.close();
    }
}