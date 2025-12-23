import java.util.Scanner;

class SplitTextWithoutSplit {

    // Method to find length without using length()
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

    // Method to split text into words without using split()
    public static String[] customSplit(String text) {

        int length = findLength(text);
        int wordCount = 1;

        // Count words by counting spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store space indexes
        int[] spaceIndex = new int[wordCount - 1];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[index++] = i;
            }
        }

        // Store words
        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < wordCount; i++) {
            int end = (i < wordCount - 1) ? spaceIndex[i] : length;
            String word = "";

            for (int j = start; j < end; j++) {
                word += text.charAt(j);
            }

            words[i] = word;
            start = end + 1;
        }

        return words;
    }

    // Method to compare two String arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // User-defined split
        String[] customWords = customSplit(text);

        // Built-in split
        String[] builtInWords = text.split(" ");

        // Display words
        System.out.println("\nWords using custom split:");
        for (String word : customWords) {
            System.out.println(word);
        }

        System.out.println("\nWords using built-in split:");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        // Compare both results
        boolean result = compareArrays(customWords, builtInWords);

        System.out.println("Are both results equal? " + result);

        sc.close();
    }
}
