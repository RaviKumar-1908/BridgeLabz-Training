import java.util.Scanner;
class LowerCaseString {

    //convert string into Lower case
    public static String convertLowerCase(String s){
	String temp = "";
	for ( int i = 0; i < s.length(); i++){
	    if ( (int)s.charAt(i) <= 97)
 	        temp +=  (char)((int) s.charAt(i) + 32);
	    else
		temp+=s.charAt(i);
        }
	return temp;
    }

    public static void main(){
	Scanner sc = new Scanner(System.in);
	String input  = sc.nextLine();
	
	String lowerCased =  convertLowerCase( input );
	System.out.println(lowerCased);
		
	String lowerCaseInBuilt = input.toLowerCase();	
	
	System.out.println("Is both are same : " + lowerCased.equals(lowerCaseInBuilt));
	
	sc.close();
    }
}