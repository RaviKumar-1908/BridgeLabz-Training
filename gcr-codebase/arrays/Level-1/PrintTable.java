//create a class PrintTable to store table as an array and printing it
import java.util.Scanner;
class PrintTable{
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	//creating a variable to store user input and an array
	System.out.print("Enter a number: ");
	int input = sc.nextInt();
	int[] table = new int[10];
	
	
	//storing  each value in form of table
	for ( int i= 0 ; i < 10; i++){
	    table[i] = input * (i+1);    
	}


	//printing output
	for ( int i= 0 ; i < 10; i++){
	    System.out.println( input + " * " + (i+1) +" = "+table[i]);   
	}

	
	sc.close();
    }
}