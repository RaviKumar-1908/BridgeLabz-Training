//creating a SumOfNaturalNumber to calculate sum upto first n natural number

import java.util.Scanner;
class calculateSumOfNatural {

    public static void calculateSumOfNatural (int number){
	if(number > 0){
	    System.out.println("The sum of " + number + " natural number is " + ((number * (number+1))/2));
	}
	else{
	    System.out.println("The number " + " is not a natural number");
	}

    }

    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	    
	//creating a variable and taking user's input
	System.out.print("Enter the number ");
	int number = sc.nextInt();

	
	//calling function to 
	 calculateSumOfNatural( number );
	
	
	  sc.close();  
    }
}



