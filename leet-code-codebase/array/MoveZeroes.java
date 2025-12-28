import java.util.Scanner;
import java.util.Arrays;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {

        int idx = 0;

        for (int x : nums) {
            if (x != 0) {
                nums[idx++] = x;
            }
        }

        while (idx < nums.length) {
            nums[idx++] = 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

        sc.close();
    }
}
