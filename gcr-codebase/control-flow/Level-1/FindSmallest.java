//creating a class FindSmallest to find the smallest among three numbers
import java.util.Scanner;
class  FindSmallest{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	//creating variable and taking user's input
	System.out.print("Enter the first number: ");
	int number1 = sc.nextInt();
	System.out.print("Enter the second number: ");
	int number2 = sc.nextInt();
	System.out.print("Enter the third number: ");
	int number3 = sc.nextInt();

	//storing result in a result variable
	Boolean result;
	if(number1 < number2 && number1 < number3){
	    result = true;
	}
	else result = false;

	//Displaying result
	System.out.println("Is the first number the smallest? " + result);
	


	sc.close();

    }
}