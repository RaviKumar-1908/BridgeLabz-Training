//creating a class SumOfNaturalForLoop to find the sum of first natural 
import java.util.Scanner;
class  SumOfNaturalForLoop{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	//creating a variable and taking user's input and two variable to store the sum value
	System.out.print("Enter the number :");
	int number = sc.nextInt();
	int duplicateNumber = number; // to use the value of number later while finding sum using formula
	int sumUsingFor= 0;
	int sumUsingFormula = 0;
	
	//calculating sum of natural number using for loop
	for ( int i = number ; i > 0; i--){
	    sumUsingFor =  sumUsingFor + i;
	}
		
	

	//calculating sum of natural number using formula
	sumUsingFormula = (duplicateNumber *(duplicateNumber + 1))/2;

	//showing output
	System.out.println("The sum using for loop " + sumUsingFor);
	System.out.println("The sum using Formula " + sumUsingFormula);

	sc.close();

    }
}