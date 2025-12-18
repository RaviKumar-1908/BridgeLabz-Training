//creating a class RocketLauch to run a countdown for a rocket launch
import java.util.Scanner;
class RocketLauch {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	//creating a variable and taking input
	System.out.print("Enter countdown time");
	int counter = sc.nextInt();
	
	//running a while loop from number to 1
	while(counter>=1){
	    System.out.println(counter--);    
	}
	
	sc.close();

    }
}