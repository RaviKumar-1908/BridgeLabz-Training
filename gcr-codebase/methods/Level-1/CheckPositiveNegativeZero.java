//creating a CheckPositiveNegativeZero to check whether a number is positive, negative or zero 

import java.util.Scanner;
class  CheckPositiveNegativeZero{

    //checking whether a number is positive, negative or zero
    public static void checkNumber (int number){
	if ( number > 0 )
	    System.out.println("Positive Number ");
	else if ( number < 0 )
	    System.out.println("Negative Number ");
	else 
	    System.out.println("Zero");
    }

    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	    
	//creating variable and taking user's input
	System.out.print("Enter a number:" );
	int input = sc.nextInt();
	
	//calling function 
	checkNumber( input );
	
	
	
	  sc.close();  
    }
}