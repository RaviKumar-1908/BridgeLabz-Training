import java.util.Scanner;

class ShortestAndLongestWord {

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
    public static String[][] createWordLengthArray(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int length = findLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(length);
        }

        return result;
    }

    // Method to find shortest and longest word indexes
    public static int[] findShortestAndLongest(String[][] wordLengthArray) {

        int shortestIndex = 0;
        int longestIndex = 0;

        int shortestLength = Integer.parseInt(wordLengthArray[0][1]);
        int longestLength = Integer.parseInt(wordLengthArray[0][1]);

        for (int i = 1; i < wordLengthArray.length; i++) {
            int currentLength = Integer.parseInt(wordLengthArray[i][1]);

            if (currentLength < shortestLength) {
                shortestLength = currentLength;
                shortestIndex = i;
            }

            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] wordLengthArray = createWordLengthArray(words);

        int[] resultIndexes = findShortestAndLongest(wordLengthArray);

        int shortestIndex = resultIndexes[0];
        int longestIndex = resultIndexes[1];

        System.out.println("\nShortest Word: " + wordLengthArray[shortestIndex][0] +
                " (Length: " + Integer.parseInt(wordLengthArray[shortestIndex][1]) + ")");

        System.out.println("Longest Word: " + wordLengthArray[longestIndex][0] +
                " (Length: " + Integer.parseInt(wordLengthArray[longestIndex][1]) + ")");

        sc.close();
    }
}
