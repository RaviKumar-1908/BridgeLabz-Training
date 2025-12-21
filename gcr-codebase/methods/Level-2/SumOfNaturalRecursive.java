//creating a SumOfNaturalRecursive to find the sum of the natural numbers
import java.util.Scanner;
class SumOfNaturalRecursive {

    public static int sumOfNatural ( int number, int sum){
	if( number ==0 ) return sum;
	sum+=number;
	return sumOfNatural(number -1, sum);
    }
   
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	    
	System.out.print("Enter number :");
	int number = sc.nextInt();
	
	int sum = sumOfNatural(number,0);
	
	//printing output	
	System.out.println("The sum using recusive function :" + sum);
	System.out.println("The sum using recusive function :" + number*(number + 1)/2);
	
	  sc.close();  
    }
}