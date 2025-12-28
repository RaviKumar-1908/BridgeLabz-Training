import java.util.Scanner;

public class MissingNumberSum {

    public static int missingNumber(int[] nums) {

        int n = nums.length;
        int requiredSum = n * (n + 1) / 2;

        int sum = 0;
        for (int x : nums) {
            sum += x;
        }

        return requiredSum - sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements (0 to n):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = missingNumber(nums);
        System.out.println("Missing number: " + result);

        sc.close();
    }
}
