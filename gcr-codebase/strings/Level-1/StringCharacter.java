//create a class StringCharacter to print the characters of a strings
import java.util.Scanner;
class  StringCharacter{
	
    public static Boolean checkCharArray(char[] s1, char[] s2){
	for ( int i= 0; i < s1.length; i++) {
	    if( s1[i] != s2[i] )
		return false;
	}
	return true;
    }
    
   //return an array of character 
    public static char[] storeCharacterOfString (String s) {
	char[] charOfString = new char [s.length()];
	for ( int i = 0; i< s.length(); i++){
	    charOfString[i] = s.charAt(i);
	}
	return charOfString;
    }
	
    public static void main (){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a String ");
	String input= sc.next();

	char[] charOfString = storeCharacterOfString (input);
	char[] charArrayUsingMethod = input.toCharArray();

	Boolean isSame =checkCharArray(charOfString, charArrayUsingMethod) ;
	if ( isSame ) 
	    System.out.println("Both are same");	
	else
	    System.out.println("Both are not same");
		
	sc.close();
    }
}