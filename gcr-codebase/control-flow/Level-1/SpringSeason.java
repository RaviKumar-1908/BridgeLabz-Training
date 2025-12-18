//creating a class SpringSeason to check whether a day lies in spring season or not
import java.util.Scanner;
class  SpringSeason{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	//creating two variable and assigning user's input
	System.out.print("Enter month");
	int month = sc.nextInt();
	System.out.print("Enter day");
	int day= sc.nextInt();

	//checking conditions and printing result
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
	
	sc.close();

    }
}