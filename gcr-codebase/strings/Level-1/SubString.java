//create a class SubString to make substring
import java.util.Scanner;
class SubString {

    // creating a function to make a substring manually
    public static String subString ( String input, int start, int end ) {
	String emptyString = "";
	for ( int i= start ; i < end; i++) {
	    emptyString = emptyString + input.charAt(i);
	}
	return emptyString;
    }
	
	
    // check whether the strings are same or not and return boolean value
    public static Boolean CheckingString (String s1, String s2) {
	Boolean isSameUsingCharAt = true;
	
	if ( s1.length() != s2.length()) {
	    isSameUsingCharAt = false;
	}
	else {
	    for ( int i = 0 ; i < s1.length() ; i++) {
 		if ( s1.charAt(i) != s2.charAt(i) ) {
		    isSameUsingCharAt = false;
		    break;
		}
		
	    } 
	}
        return isSameUsingCharAt;
    }

	
    public static void main (){
	Scanner sc = new Scanner(System.in);
	
	//taking user's input
	System.out.print("Enter a String ");
	String input = sc.next();
	System.out.print("Enter the start of the substring :");
	int start = sc.nextInt();
	System.out.print("Enter the end of the substring :");
	int end = sc.nextInt();
	
	String subStringManually = subString ( input, start, end);
	System.out.println("substring Manually :" + subStringManually);
	
	String subStringInBuilt  = input.substring(start,end);

	System.out.println("Sub string using in-built method: " + subStringInBuilt);
	
	Boolean isSame = CheckingString(subStringManually, subStringInBuilt);

	System.out.println(" Are both the subString Same :" + isSame);
	

	
	sc.close();
    }
}