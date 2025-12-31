/*16. Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements*/

public class DigitalWatch{
    public static void main(String[] args){
    
    for ( int hour =0; hour <= 23; hour++){
	boolean flag =  true;
	for( int minute = 0; minute<60;minute++){
	    
	    System.out.println("Time : " + hour + " : " + minute);
	    if( hour == 13 && minute == 0){
		 System.out.println("Power cut..."    );
		flag = false;
	        break;
	    }	
	}
	if ( !flag ) 
	    break;
    }

}
}