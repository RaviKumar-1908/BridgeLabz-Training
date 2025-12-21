//creating a SpringSeason to find whether the given month and day lies in spring season
import java.util.Scanner;
class SpringSeason {
    
    //this function calculate and return whether that day lies in spring season or not
    public static void findSpringSeason (int month, int day){
	if (month ==3) {
	    if (day >= 20)
	        System.out.println("Its  a Spring Season");
	    else
		System.out.println("Its not a Spring Season");
	}
	else if(month == 4 || month == 5)
	    System.out.println("Its a Spring Season");
	else if (month ==6){
	    if ( day <=20)
	        System.out.println("Its a Spring Season"); 
	    else
		System.out.println("Its not a Spring Season"); 
	}
	else System.out.println("Its not a Spring Season");
    }

    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	    
	//creating variable and taking user's input
	System.out.print("Enter month :");
	int month = sc.nextInt();
	System.out.print("Enter day :");
	int day= sc.nextInt();
	
	//calling function to 
	 findSpringSeason(month, day);
	
	//printing the output
	System.out.println( ); 
	
	  sc.close();  
    }
}

