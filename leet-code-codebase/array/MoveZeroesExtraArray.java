import java.util.Scanner;
import java.util.Arrays;

public class MoveZeroesExtraArray {

    public static int[] moveZeroes(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];
        int idx = 0;

        for (int x : nums) {
            if (x != 0) {
                result[idx++] = x;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] ans = moveZeroes(nums);
        System.out.println(Arrays.toString(ans));

        sc.close();
    }
}
