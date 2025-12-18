//creating a class SumOfNaturalWhileLoop to find the sum of first natural 
import java.util.Scanner;
class  SumOfNaturalWhileLoop{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	//creating a variable and taking user's input and two variable to store the sum value
	System.out.print("Enter the number :");
	int number = sc.nextInt();
	int duplicateNumber = number; // to use the value of number later while finding sum using formula
	int sumUsingWhile = 0;
	int sumUsingFormula = 0;
	
	//calculating sum of natural number using while loop
	while (number!=0){
	    sumUsingWhile+=number;
	    number--;
	}

	//calculating sum of natural number using formula
	sumUsingFormula = (duplicateNumber *(duplicateNumber + 1))/2;

	//showing output
	System.out.println("The sum using while loop " + sumUsingWhile);
	System.out.println("The sum using Formula " + sumUsingFormula);

	sc.close();

    }
}