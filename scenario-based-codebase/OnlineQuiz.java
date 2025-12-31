/*17. Online Quiz Application 🧠
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout. */

import java.util.Scanner;
public class OnlineQuiz{
	
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        String[] questions = { "Is the Vatican City the smallest country in the world?","Does the chemical symbol 'Au' stand for Silver?","Was Neil Armstrong the first person to walk on the moon?","Did the French Revolution begin in the year 1789?","Is Venus known as the 'Red Planet' in our solar system?"};
        String[] answers = {"yes","no","yes","yes", "no"};
        int totalScore = 0;
	String userInput ="";
	    System.out.println("\n============Online Quiz===========\n");
	    System.out.println(" Answer in yes or no ");
	
        for ( int i= 0;i<5;i++){
	    System.out.println("\nQ." + (i+1) + " : " + questions[i] + "  Your Answer: \n" );
	    userInput = sc.next();
	   String input = userInput.toLowerCase();
	 
	    switch( input ) {
   		case "yes" ->{
		    if ( answers[i].equals(input)){
			System.out.println("You answered it right..\n");
	 	 	totalScore++;
		    }
		    else{System.out.println("Wrong answer...\n");}
		}

		case "no" ->{
		    if ( answers[i].equals(input)){
			System.out.println(" You answered it right..\n");
	 	 	totalScore++;
		    }
		    
		    else{System.out.println("Wrong answer...\n");}
		}
		}
	   
	
        }
	System.out.println("\n ===== Total score: " + totalScore + " ====\n");


    }

}
