import java.util.Scanner;
import java.util.Arrays;

class LongestCommonPrefix0014 {

    //Method to find the longest common prefix 
    public static String longestCommonPrefix(String[] str) {
        if (str == null || str.length == 0) return "";

        Arrays.sort(str);
        String s1 = str[0];
        String s2 = str[str.length - 1];
        int count = 0;

        while (count < s1.length() && count < s2.length()) {
            if (s1.charAt(count) == s2.charAt(count)) {
                count++;
            } else {
                break;
            }
        }
        return s1.substring(0, count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] str = new String[n];

        for (int i = 0; i < str.length; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            str[i] = sc.nextLine();
        }

        String result = longestCommonPrefix(str);

        System.out.println("Longest Common Prefix: " + result);
    }
}