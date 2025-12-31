/*18. Currency Exchange Kiosk 💱
Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while)*/

import java.util.Scanner;
public class CurrencyExchange{

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
   	System.out.println("\n===== Welcome to Currency Exchange =====\n");
		
	
	
	
	do{
	    System.out.print("\n Enter the Amount in INR [0 to exit]: ");
	    double inrAmount = sc.nextDouble();
	    if(  inrAmount== 0) break;
	    System.out.print("\n Choose TO currency (USD, EUR, AUD, GBP): ");
	    String inputString= sc.next();
	    String  userInput = inputString.toLowerCase();
		
	    switch ( userInput ){
 		case "usd" -> { 
		    System.out.println("\nINR " + inrAmount + "in USD is :" + (inrAmount/90.0));
		 }
		case "eur" -> { 
		    System.out.println("\nINR " + inrAmount + "in EUR is :" + (inrAmount/105.0));
		 }
		case "gbp" -> { 
		    System.out.println("\nINR " + inrAmount + "in GBP is :" + (inrAmount/116.0));
		 }
		case "aud" -> { 
		    System.out.println("\nINR " + inrAmount + "in AUD is :" + (inrAmount/58.0));
		 }
		
	    }
		
            
	}
	while(true);	

	sc.close();
    }
}