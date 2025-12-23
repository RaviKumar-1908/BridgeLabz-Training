import java.util.Scanner;

class WordLength2D {

    // Method to find length of a string without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    // Method to split text into words using charAt() without split()
    public static String[] splitText(String text) {

        int len = findLength(text);
        int wordCount = 1;

        // Count number of words by counting spaces
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int index = 0;
        String word = "";

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) != ' ') {
                word += text.charAt(i);
            } else {
                words[index++] = word;
                word = "";
            }
        }

        words[index] = word;

        return words;
    }

    // Method to create 2D array of word and its length
    public static String[][] wordLengthArray(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int length = findLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(length);
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] output = wordLengthArray(words);

        // Display result in tabular format
        System.out.println("\nWord\tLength");
        System.out.println("----------------");

        for (int i = 0; i < output.length; i++) {
            int length = Integer.parseInt(output[i][1]);
            System.out.println(output[i][0] + "\t" + length);
        }

        sc.close();
    }
}
