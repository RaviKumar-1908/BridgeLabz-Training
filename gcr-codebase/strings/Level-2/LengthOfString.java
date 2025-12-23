import java.util.Scanner;

class LengthOfString {

    // Method to find string length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        }
        catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input using next()
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Calling method
        int customLength = findLength(text);

        // Calling built-in length() method
        int builtInLength = text.length();

        // Displaying results
        System.out.println("Length without using length() method: " + customLength);
        System.out.println("Length using built-in length() method: " + builtInLength);

        sc.close();
    }
}
