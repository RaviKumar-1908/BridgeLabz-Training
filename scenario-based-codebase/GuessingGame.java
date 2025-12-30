import java.util.Scanner;
	
public class GuessingGame{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
	int input = -1;
	int randomNumber = (int) (Math.random() * 100) + 1;
	
	int turn = 5;
	do{
	    if( turn == 0) {
		System.out.println("You Lost");
		break;
            }
	    System.out.print(" Guess the number ( 1 to 100) ");
	    input = sc.nextInt();
	    turn--;
	        if ( input == randomNumber ){
		    System.out.println("You guessed the number, the number was : " + randomNumber );
	       	    break;
	         }
	     else{
	         if( input > randomNumber ){
	              System.out.println(" Too high ");
			System.out.println("Try again!");
		}	
	         else {
		      System.out.println("Too low ");
	        	System.out.println("Try again!");
        }
}
}
	while ( input != randomNumber );
	
       sc.close();
    }
}