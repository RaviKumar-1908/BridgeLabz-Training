import java.util.Scanner;
import java.util.Arrays;

public class ThreeSum {

    public static int[] threeSum(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {

                    if (nums[i] + nums[j] + nums[k] == 0) {
                        return new int[]{nums[i], nums[j], nums[k]};
                    }
                }
            }
        }

        return new int[0];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = threeSum(nums);

        if (result.length == 0) {
            System.out.println("No triplet found");
        } else {
            System.out.println(Arrays.toString(result));
        }

        sc.close();
    }
}
