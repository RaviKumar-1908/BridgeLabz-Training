import java.util.Scanner;
public class StringDuplicate{
    // it gives a string in return with unique character
    public static String removeDuplicate(String input){
	String temp = "";
	for ( int i = 0; i < input.length(); i++){
	    Boolean flag = false;
	    for ( int j = i+1; j < input.length(); j++){
		if( input.charAt(i) == input.charAt(j) )
		    break;
		else{
 			flag = true;
			break;
		    }
		    
	    }
	if(flag)
	    temp+=input.charAt(i);
	}
	temp+=input.charAt(input.length()-1);	
	return temp;
    }

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter an input text: ");
	String input = sc.next();
	
	
	String result = removeDuplicate(input);
	System.out.print(result);
	
 	sc.close();
    }
}