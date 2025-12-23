import java.util.Scanner;
class UpperCaseString {

    //convert string into Upper case
    public static String convertUpperCase(String s){
	String temp = "";
	for ( int i = 0; i < s.length(); i++){
	    if ( (int)s.charAt(i) >= 97)
 	        temp +=  (char)((int) s.charAt(i) - 32);
	    else
		temp+=s.charAt(i);
        }
	return temp;
    }

    public static void main(){
	Scanner sc = new Scanner(System.in);
	String input  = sc.nextLine();
	
	String upperCased =  convertUpperCase( input );
	System.out.println(upperCased);
		
	String upperCaseInBuilt = input.toUpperCase();	
	
	System.out.println("Is both are same : " + upperCased.equals(upperCaseInBuilt));
	
	sc.close();
    }
}