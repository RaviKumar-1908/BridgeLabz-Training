import java.util.Scanner;
public class StringReverse{

    //it reverses the string 
    public static String reverseString(String input){
	String reversedString = "";
	 for ( int i = input.length()-1; i>=0 ;i--){
	     reversedString+=input.charAt(i);
	}
	return reversedString;
    }

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter an input text: ");
	String input = sc.next();
	
	String reversedString = reverseString(input);
	System.out.println("The reverse String: " + reversedString);	
	
 	sc.close();
    }
}