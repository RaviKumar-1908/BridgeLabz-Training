//create a class MultipleOfNumber to find the multiple of a number from 6 to 9
import java.util.Scanner;
class MultipleOfNumber{
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	//creating a variable and taking user's input
	System.out.print("Enter a Number: ");
	int input = sc.nextInt();
	
	//printing its multiple from 6 to 9
	for(int i = 6; i <= 9; i++){
	    System.out.println(input + " * " + i +  " = " + (input * i));
	sc.close();
	}
    }
}