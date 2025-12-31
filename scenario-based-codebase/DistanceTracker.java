/*19. Bus Route Distance Tracker 🚌
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation.*/


import java.util.Scanner;
public class DistanceTracker{

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
   	System.out.println("\n===== Welcome to Distance Tracker =====\n");
		
	System.out.println("Enter 1.exit  2.continue..\n");
	int totalDistance = 5;
	
	while(true){
	    int input = sc.nextInt();
	    if ( input ==1 ){
		System.out.println("\n==========================================\n");
		System.out.printf("Exited: You travelled +%d km", totalDistance);	
		break;
	    }
   	    else{	
		System.out.println("Journey continues...(travelled 5 kms)\n");
		totalDistance+=5;
	    }		
	}
	

	sc.close();
    }
}