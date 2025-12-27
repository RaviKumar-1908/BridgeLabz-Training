import java.util.Scanner;
public class BoothManager{
	
    //this method record the total votes
    public static int countVote(int age){
	if ( age >= 18 ) 
	    return 1;
	else
	    return 0;	
    }
	
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    	int age = 0;
	int totalVote = 0;
	while( age != -1){
	    System.out.print("Enter the voter's age:(-1 to exit) " );
	    age = sc.nextInt();
	    totalVote += countVote(age);
	}
	
	//printing result
	System.out.println("Total Votes counted = " + totalVote);

	
	sc.close();
    }

}