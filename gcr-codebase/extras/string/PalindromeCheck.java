import java.util.Scanner;
public class PalindromeCheck{

    //it reverse the string
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
	System.out.println(input + reversedString);
	System.out.println("Is it Palindrome: " + (reversedString.equals(input)));

	
	
 	sc.close();
    }
}