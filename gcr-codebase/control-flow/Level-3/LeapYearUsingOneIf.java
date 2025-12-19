//creating a class LeapYearUsingOneIf to find whether an year is leap or not
import java.util.Scanner;
class LeapYearUsingOneIf{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	//creating a variable and taking input from the user
	System.out.print("Enter a number: ");
	int input = sc.nextInt();
	
	//checking whether an year is leap or not
	if (( input % 100 != 0 && input % 4 ==0) ||( input % 100 ==0 && input % 400 == 0))
	    System.out.println("It's a leap year");
	else 
	    System.out.println("It's not a leap year");
	    


	sc.close();
	}
    }