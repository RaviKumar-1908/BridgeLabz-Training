/*13. Sandeep’s Fitness Challenge Tracker 🏋️
♂Each day Sandeep completes a number of push-ups.
● Store counts for a week.
● Use for-each to calculate total and average.
● Use continue to skip rest days.*/

import java.util.Scanner;

public class FitnessChallenge{
    public static void main(){
	Scanner sc = new Scanner(System.in);
	int [] pushCounts = new int[7];
	int total = 0;
	String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	
	System.out.println("===== Fitness Tracker=====\n");

	for ( int i= 0; i<7 ;i++){
	    System.out.print(" Enter the number of push-ups ( 0 for Rest) on  " + daysOfWeek[i]+": ");
	    pushCounts[i] = sc.nextInt();
	    total+=pushCounts[i];
	}

	System.out.println("\n===== Summary of the Week =====\n");

	int daysCnt = 0;
	for ( int i= 0; i<7 ;i++){
	    if( pushCounts[i] > 0 ){
		System.out.println("You did " + pushCounts[i] + " Push-ups" + " on " + daysOfWeek[i] +":");
		daysCnt++;
	    }
	    else
		System.out.println("It's your rest day, champs!!");
	}

	System.out.println(" Total push-ups: " + total);
	System.out.println("Average push-ups: "+ (total/daysCnt));
		
	
	sc.close();
    }
}