//creating a  LeapYear to find the leap year
import java.util.Scanner;
class LeapYear {

    //checking whether an year is leap or not
    public static void findLeapYear (int input){
	if ( input % 100 != 0 && input % 4 ==0)
	    System.out.println("It's a leap year");
	else if ( input % 100 ==0 && input % 400 == 0)
	    System.out.println("It's a leap year");
	else 
	    System.out.println("It's not a leap year");

    }

    public static int sumOfNatural ( int number, int sum){
	if( number ==0 ) return sum;
	sum+=number;
	return sumOfNatural(number -1, sum);
    }
   
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	    
	System.out.print("Enter year :");
	int input = sc.nextInt();

	if ( input >= 1582 )
	    findLeapYear(input);
	else 
	    System.out.println("Enter after 1582 ");
	
	
	  sc.close();  
    }
}


