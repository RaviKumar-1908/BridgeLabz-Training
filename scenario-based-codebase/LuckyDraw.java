/*20. Festival Lucky Draw 🎉
At Diwali mela, each visitor draws a number.
● If the number is divisible by 3 and 5, they win a gift.
● Use if, modulus, and loop for multiple visitors.
● continue if input is invalid.*/

import java.util.Scanner;
public class LuckyDraw{

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
   	System.out.println("\n===== Welcome to Lucky Draw =====\n");
		
	while(true){
	    System.out.println("\n--Choose a Number [0 to exit]---\n");
	    int input = sc.nextInt();
	    if( input == 0) {
		System.out.println("\n ===Thank you ===");
		break;
	    }
	    if ( input % 15 == 0 && input > 0){
		System.out.println("\nYAY!!! you won a Diwali gift..");
	    }
	    else if( input < 0){
		System.out.println("Choose a valid number(>0) ");
	    }
	    else {
		System.out.println("\nBetter Luck Next Time");
	
	    }
     	}
	
	sc.close();
    }
}