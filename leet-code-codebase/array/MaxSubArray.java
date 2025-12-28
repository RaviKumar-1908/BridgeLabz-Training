import java.util.Scanner;

public class MaxSubArray {

    public static int maxSubArray(int[] nums) {

        int currentSum = 0;
        int maxSum = 0;

        for (int x : nums) {
            currentSum += x;
            if (currentSum < 0)
                currentSum = 0;
            if (currentSum > maxSum)
                maxSum = currentSum;
        }

        return maxSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(maxSubArray(nums));
        sc.close();
    }
}
