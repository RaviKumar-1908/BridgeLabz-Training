//creating a class FactorialUsingWhile to find the factorial of a positive number
import java.util.Scanner;
class FactorialUsingWhile {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	//creating a variable and taking user's input and one variable for storing factorial
	System.out.print("Enter a number "); 
	int input = sc.nextInt();
	int factorial = 1;

	//checking whether it is a positive number and If it is, finding its factorial
	if(input > 0 ){
	    while(input != 1){
	        factorial *= input;
		input--;	
	    }
	}

	System.out.println("Factorial : " + factorial);	
	sc.close();

    }
}