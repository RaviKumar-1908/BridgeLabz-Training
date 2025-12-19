//creating a class PrintMultiple  to print multiple upto 100
import java.util.Scanner;
class PrintMultiple{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	//creating a variable and taking input from the user
	System.out.print("Enter a number: ");
	int input = sc.nextInt();
	
	//priting the multiple upto 100
	if ( input > 0 && input < 100){
	    for(int i = 100; i>=1 ;i--){
		if ( i % input ==0 ) 
		    System.out.println(i);
	    }
	}
	else
	    System.out.println("Enter a positive number less than 100" );
	
	    


	sc.close();
	}
    }