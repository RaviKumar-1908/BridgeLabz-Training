//create a class GreatestFactorOutsideWhileLoop to find the largest number which perfectly divide the input
import java.util.Scanner;
class GreatestFactorOutsideWhileLoop{
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	//creating a variable and taking user's input
	System.out.print("Enter a number: ");
	int input = sc.nextInt();
	int greatestFactor = 1;
	int start =  input - 1; 
	

	//checking for factor from input-1 to 1 and checking whether it is a factor or not
	while ( start != 0 ){
	    if ( input % start ==0 ){
		greatestFactor = start;
		break;
		}
	    start--;
	}
	System.out.println(greatestFactor);
	
	sc.close();
    }
}