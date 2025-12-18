//creating a class RocketLauchForLoop to run a countdown for a rocket launch
import java.util.Scanner;
class RocketLauchForLoop {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	//creating a variable and taking input
	System.out.print("Enter countdown time");
	int counter = sc.nextInt();
	
	//running a while loop from number to 1
	for(int i = counter; i>=1; i--){
	    System.out.println(i);   
	}
	
	sc.close();

    }
}