import java.util.Scanner;

public class ParkingLot006{
     // total initial parking lot
    static int totalLot = 10;

    public static int park(String input){
	if( totalLot <=0 ) {

	 System.out.println ("No Lots available: ");
	 return -1;
         }
	else{
   	    System.out.println("Your car is Parked..");
	    totalLot--;
	}
	return 0;
    }


    public static void exit(String input){
	if ( (10-totalLot) == 0 ){
	     System.out.println("No Vehicle present..");
	
	     
	}
	else {
   	    System.out.println("Car out...Visit again");
	    totalLot++;
	}
	
    }

    public static void showOccupancy(String input){
	System.out.println(" Total Seats Available : " + totalLot );
 	System.out.println(" Total Seats Occupied : " + (10 - totalLot));
    }
    
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
        String input =""; 
	int redFlag  = 0;
	while (true){

		
	    System.out.print("Enter your options (park, exit, show, and stop to exit:" );
	     input = sc.nextLine();
		if ( input.equals("stop"))
		   break;
		
	    switch( input ){
		case "park" :
		   redFlag=  park (input);
		    break;
		case "exit" :
		    exit (input);
		    break;
		case "show" :
		    showOccupancy(input);
		    break;
		}
	     if ( redFlag == -1 ){
		
	 	break;
	    }
	}
	sc.close();
    }

}