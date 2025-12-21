//creating a MaximumHandshakes to find the total number of handshakes among students 

import java.util.Scanner;
class MaximumHandshakes {

    public static int calculateHandshakes(int students){
	return (students *(students - 1 ))/2;
    }

    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	    
	//creating variable and taking user's input
	System.out.print("Enter total students :" );
	int students = sc.nextInt();
	
	//calling function to get maximum handshakes
	int totalHandshakes = calculateHandshakes(students);
	
	//printing the output
	System.out.println("total number of handshakes :"  +totalHandshakes ); 
	
	  sc.close();  
    }
}