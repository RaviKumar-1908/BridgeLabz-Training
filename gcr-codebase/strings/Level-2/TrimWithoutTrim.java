import java.util.Scanner;

class TrimWithoutTrim {

    // Method to find start and end index after trimming spaces
    public static int[] findTrimIndexes(String text) {

        int start = 0;
        int end = 0;

        try {
            while (true) {
                text.charAt(end);
                end++;
            }
        } catch (Exception e) {
            end--; // last valid index
        }


        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }


        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    public static String customSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {

        int i = 0;

        try {
            while (true) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return false;
                }
                i++;
            }
        } catch (Exception e) {
        }

        // Check if both strings ended at same time
        try {
            s1.charAt(i);
            return false;
        } catch (Exception e) {
            try {
                s2.charAt(i);
                return false;
            } catch (Exception ex) {
                return true;
            }
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string with spaces: ");
        String input = sc.nextLine();


        int[] indexes = findTrimIndexes(input);
        String customTrimmed = customSubstring(input, indexes[0], indexes[1]);


        String builtInTrimmed = input.trim();

        // Compare both strings
        boolean isEqual = compareStrings(customTrimmed, builtInTrimmed);

        System.out.println("\nCustom Trimmed String: \"" + customTrimmed + "\"");
        System.out.println("Built-in Trimmed String: \"" + builtInTrimmed + "\"");
        System.out.println("Are both strings equal? " + isEqual);

        sc.close();
    }
}
