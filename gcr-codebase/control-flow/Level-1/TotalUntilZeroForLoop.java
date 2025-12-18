//creating a class TotalUntilZeroForLoop to find the sum of the numbers until the user don't input zero
import java.util.Scanner;
class TotalUntilZeroForLoop {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	//creating total variable and assigning zero and number to 1 so that we can take the first value	
	double total  = 0.0;
	double number=1;


	//running while loop until user input zero or negative number, if not adding that value t the total variable
	while(true){
	    System.out.print("Enter a number");
	    number = sc.nextDouble();
	    if ( number < 0)
		break;
	    total+=number;
	}
	
	//Displaying the output
	System.out.println(total);
	
	sc.close();

    }
}