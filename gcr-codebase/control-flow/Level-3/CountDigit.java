//create a class CountDigit to count the number of digit present in an integer
import java.util.Scanner;
class CountDigit{
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	//creating a variable and taking user's input
	System.out.print("Enter a number: ");
	int input = sc.nextInt();


        //checking the total digit of that number 
	int digitCount = 0;
	while(input!=0){
	    digitCount++;
	    input/=10;
	}
	
	//printing the output
	System.out.println(digitCount);
	
	
	sc.close();
    }
}