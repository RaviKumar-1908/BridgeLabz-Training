//create a class DoubleOpt to perform various operations
import java.util.Scanner;
class DoubleOpt {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	//creating variables and taking input
	double a, b, c;
	a= sc.nextDouble();
	b= sc.nextDouble();
	c= sc.nextDouble();	

	//Performing operations
	double result1 = a + b * c;
	double result2 = a * b + c;	
	double result3 = c + a / b;
	double result4 = a % b + c;

	System.out.println("Result 1: " + result1 +" Result 2: " + result2 +" Result 3: " + result3 +" Result 4: " + result4);
    }
}