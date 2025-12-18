//creating a class SumOfNaturalNumbers to find the sum of the first natural, but only if it is a natural number
import java.util.Scanner;
class SumOfNaturalNumbers{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	//creating a variable and taking user's input
	System.out.print("Enter the number ");
	int number = sc.nextInt();

	//calculating the sum of a natural number if it is positive
	if(number > 0){
	    System.out.println("The sum of " + number + " natural number is " + ((number * (number+1))/2));
	}
	else{
	    System.out.println("The number " + " is not a natural number");
	}

	

	sc.close();
    }
}