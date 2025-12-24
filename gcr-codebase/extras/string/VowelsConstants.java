import java.util.Scanner;
public class VowelsConstants{

    //it counts the number of consonant and vowels and return them into an array
    public static int[] calculateVolwelConsonant(String input){
	int countVowel = 0, countConsonant = 0;
	input = input.toLowerCase();
	for ( int i = 0; i <input.length(); i++){
	    if( input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u')
		countVowel++;
	    else 
		countConsonant++;
	}
	return new int[] {countVowel, countConsonant};
    }

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter an input text: ");
	String input = sc.next();
	int[] getVowelConsonant  = calculateVolwelConsonant(input);
	System.out.println("Vowel : " + getVowelConsonant[0]);
	System.out.println("Vowel : " + getVowelConsonant[1]);
	
	
 	sc.close();
    }
}