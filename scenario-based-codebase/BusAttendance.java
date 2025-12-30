/*9. School Bus Attendance System 🚍
Track 10 students' presence.
● Use for-each loop on names.
● Ask "Present or Absent?"
● Print total present and absent counts.*/


import java.util.Scanner;
public class BusAttendance{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
	String[] studentsNames = {"Arjun", "Ishaan", "Aavya", "Vihaan", "Saanvi", "Aditya", "Ananya", "Sai", "Reyansh", "Diya"};
	int[] presentList = new int[10];	
	System.out.println("Enter 1 - for present and 0 for absent. "); 
	for ( int i=0; i<10; i++){
	    System.out.print("Is " +  studentsNames[i] + " present? (0/1) : ");	
	    presentList[i]= sc.nextInt();
	}
	int totalPresent = 0;
	for( int i=0; i<10;i++){
	    totalPresent+=presentList[i];
	}
	System.out.println("Total present student " + totalPresent);
	System.out.println("Total absent student " + (10-totalPresent));

    sc.close();
   }

}