//creating a class QuotientAndRemainder to find quotient and reminder
import java.util.Scanner;
class QuotientAndRemainder{
    public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	
	//creating two variable and taking user's input
	int number1 = sc.nextInt();
	int number2 = sc.nextInt();
	
	//Displaying output
	System.out.println("The Quotient is " + (number1/number2) + " and Reminder is " + (number1 % number2) + " of two number " + number1 + " and "+ number2);
    }
}