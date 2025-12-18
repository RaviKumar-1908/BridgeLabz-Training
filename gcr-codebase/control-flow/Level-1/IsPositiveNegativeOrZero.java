//creating a class IsPositiveNegativeOrZero to find whether a number is positive, negative, or zero
import java.util.Scanner;
class IsPositiveNegativeOrZero {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	//creating a variable and taking user's input
	System.out.print("Enter a number: ");
	int number = sc.nextInt();

	//checking number and displaying result
	if(number > 0) 
	    System.out.println("Positive");
	else if (number < 0)
	    System.out.println("Negative");
	else 
 	    System.out.println("Zero");

	sc.close();

    }
}