//create a class GreatestFactorOutsideLoop to find the largest number which perfectly divide the input
import java.util.Scanner;
class GreatestFactorOutsideLoop{
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	//creating a variable and taking user's input
	System.out.print("Enter a number: ");
	int input = sc.nextInt();
	int greatestFactor = 1;
	

	//checking for factor from input-1 to 1 and checking whether it is a factor or not
	for (int i = input-1; i >= 1; i--){
	    if ( input % i ==0 ){
		greatestFactor = i;
		break;
		}
	}
	System.out.println(greatestFactor);
	
	sc.close();
    }
}