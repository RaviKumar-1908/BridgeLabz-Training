//create a class IsPrimeNumber to check whether a number is prime or not
import java.util.Scanner;
class IsPrimeNumber{
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	//creating a variable and taking user's input
	System.out.print("Enter a number: ");
	int input = sc.nextInt();
	Boolean isPrime  = true;  //this variable is update to false when we find a factor of input
	
	//checking the number whether it is a prime or not
	for ( int i =2 ;i< input; i++){
	    if ( input % i == 0){
		isPrime  = false;
		break;
	    }
	}
	
	//displaying output on the basis of isPrime variable
	if ( isPrime  )
	    System.out.println("It is a prime number");
	else 	
	    System.out.println("It is not a prime number");

	
	sc.close();
    }
}