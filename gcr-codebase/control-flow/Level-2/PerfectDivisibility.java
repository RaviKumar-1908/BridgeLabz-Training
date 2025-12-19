//create a class PerfectDivisibility to find the number which perfectly divide the input
import java.util.Scanner;
class PerfectDivisibility{
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	//creating a variable and taking user's input
	System.out.print("Enter a number: ");
	int input = sc.nextInt();
	

	//checking for factor from 1 to input and checking whether it is a factor or not
	for (int i = 1; i < input; i++){
	    if ( input % i ==0 )
		System.out.println(i);
	}
	
	sc.close();
    }
}