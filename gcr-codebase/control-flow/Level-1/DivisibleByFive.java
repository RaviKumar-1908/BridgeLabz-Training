//creating a class DivisibleByFive to check whether a number is divisible by five or not
import java.util.Scanner;
class DivisibleByFive{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	//creating variable and taking user's input
	System.out.print("Enter a number: ");
	int number = sc.nextInt();

	//checking whether the number is divisible by five or not
	if (number % 5 ==0){
	    System.out.println("Is this number " + number + " divisible by 5? " + (number % 5 ==0));
	}
	//  if the number is not divisible
	else {
	System.out.println("Is this number " + number + " divisible by 5? " + (number % 5 ==0));
	}

	sc.close();

    }
}