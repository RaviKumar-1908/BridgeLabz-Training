//creating a class CanVote to check whether a person can vote or not
import java.util.Scanner;
class CanVote {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	//creating variable and taking user's input
	System.out.print("Enter the age: ");
	int age = sc.nextInt();
	
	//displaying result
	if(age >= 18){
	    System.out.println("The person's age is " + age + " and can vote.");	
	}
	else{
	    System.out.println("The person's age is " + age + " and can't vote.");
	}


	sc.close();

    }
}