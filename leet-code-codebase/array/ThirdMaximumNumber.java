import java.util.Scanner;

public class ThirdMaximumNumber {

    public static int thirdMax(int[] nums) {

        Long first = null;
        Long second = null;
        Long third = null;

        for (int x : nums) {

            long val = x;

            if ((first != null && val == first) ||
                (second != null && val == second) ||
                (third != null && val == third)) {
                continue;
            }

            if (first == null || val > first) {
                third = second;
                second = first;
                first = val;
            } else if (second == null || val > second) {
                third = second;
                second = val;
            } else if (third == null || val > third) {
                third = val;
            }
        }

        return third == null ? first.intValue() : third.intValue();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(thirdMax(nums));
        sc.close();
    }
}
