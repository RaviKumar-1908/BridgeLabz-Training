//create a class FizzBuzz to print Fizz, Buzz and FizzBuzz depending on given conditions
import java.util.Scanner;
class FizzBuzz{
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	//creating a variable and taking user's input	
	System.out.print("Enter a Number :");
	int input = sc.nextInt();
	
	//printing result : if 1 to input, if the number is divisible by 3 -> "Fizz", if divisible by 5 -> "Buzz" and if both -> "FizzBuzz" or else the number
	if ( input > 0 ){
	    for ( int i = 1; i <= input; i++){
		if ( i % 3 == 0)
		     if ( i % 5 == 0)
		        System.out.println("FizzBuzz");
		     else
			 System.out.println("Fizz");
		else if ( i % 5== 0)
		    System.out.println("Buzz");
		else 
		    System.out.println(i);
	    }
	}
	
	
	sc.close();
    }
}