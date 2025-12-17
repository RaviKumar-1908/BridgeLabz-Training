//create a class IntOperation to perform various operations
import java.util.Scanner;
class IntOperation{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	//creating variables and taking input
	int a, b, c;
	a= sc.nextInt();
	b= sc.nextInt();
	c= sc.nextInt();	

	//Performing operations
	int result1 = a + b * c;
	int result2 = a * b + c;	
	int result3 = c + a / b;
	int result4 = a % b + c;

	System.out.println("Result 1: " + result1 +" Result 2: " + result2 +" Result 3: " + result3 +" Result 4: " + result4);
    }
}