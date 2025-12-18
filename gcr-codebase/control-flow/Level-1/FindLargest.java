//creating a class FindLargest to find the largest among three numbers
import java.util.Scanner;
class  FindLargest{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	//creating variable and taking user's input
	System.out.print("Enter the first number: ");
	int number1 = sc.nextInt();
	System.out.print("Enter the second number: ");
	int number2 = sc.nextInt();
	System.out.print("Enter the third number: ");
	int number3 = sc.nextInt();

	//storing result in a result variable for all three numbers
	Boolean result1, result2, result3;
	if(number1 > number2 && number1 > number3){
	    result1 = true;
	}
	else result1 = false;
	if(number2 > number1 && number2 > number3){
	    result2 = true;
	}
	else result2 = false;
	if(number3 > number1 && number3 > number2){
	    result3 = true;
	}
	else result3 = false;

	//Displaying result
	System.out.println("Is the first number the largest? " + result1);
	System.out.println("Is the second number the largest? " + result2);
	System.out.println("Is the third number the largest? " + result3);


	sc.close();

    }
}