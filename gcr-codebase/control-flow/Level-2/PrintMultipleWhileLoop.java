//creating a class PrintMultipleWhileLoop  to print multiple upto 100
import java.util.Scanner;
class PrintMultipleWhileLoop{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	//creating a variable and taking input from the user
	System.out.print("Enter a number: ");
	int input = sc.nextInt();
	int counter = 100;
	
	//priting the multiple upto 100
	if ( input > 0 && input < 100){
	    while ( counter >= 1){
	       if( counter % input == 0){
		    System.out.println(counter);

	       }
	    counter--;

	   }
	}
	else
	    System.out.println("Enter a positive number less than 100" );
	
	    

	sc.close();
	}
    }