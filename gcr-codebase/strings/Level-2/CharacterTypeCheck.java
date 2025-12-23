import java.util.Scanner;

class CharacterTypeCheck {

    // Method to check whether character is Vowel, Consonant or Not a Letter
    public static String checkCharacter(char ch) {

        // Convert uppercase to lowercase using ASCII values
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }


        if (ch >= 'a' && ch <= 'z') {

            // Check vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to find character type and return 2D array
    public static String[][] findCharacterTypes(String text) {

        int length = text.length();
        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacter(ch);
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayResult(String[][] data) {

        System.out.println("\nCharacter\tType");
        System.out.println("------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] result = findCharacterTypes(input);
        displayResult(result);

        sc.close();
    }
}
