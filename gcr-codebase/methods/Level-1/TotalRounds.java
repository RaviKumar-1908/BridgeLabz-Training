//creating a TotalRounds to find the number of rounds to complete 5kms

import java.util.Scanner;
class TotalRounds {

    public static int calculateRounds (int sumSide){
	if ( (5000  % sumSide == 0))
	   return (int) 5000 / sumSide;
	else 
	    return (int) ((5000/sumSide)+1);
    }

    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	    
	//creating variable and taking user's input
	System.out.print("Enter size of the side1 :" );
	int side1 = sc.nextInt();
	System.out.print("Enter size of the side2 :" );
	int side2 = sc.nextInt();
	System.out.print("Enter size of the side3 :" );
	int side3 = sc.nextInt();
	int sumSide = side1 + side2 + side3;
	//calling function to get maximum handshakes
	int numberOfRounds = calculateRounds( sumSide );
	
	//printing the output
	System.out.println( "total numbers of rounds " +numberOfRounds); 
	
	  sc.close();  
    }
}