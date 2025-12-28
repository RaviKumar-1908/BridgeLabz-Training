import java.util.Scanner;

public class TwoSumSorted {

    public static int[] twoSum(int[] numbers, int target) {

        int low = 0;
        int high = numbers.length - 1;

        while (low < high) {
            int sum = numbers[low] + numbers[high];

            if (sum == target) {
                return new int[]{low + 1, high + 1};
            } else if (sum > target) {
                high--;
            } else {
                low++;
            }
        }

        return new int[0];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int[] ans = twoSum(numbers, target);

        if (ans.length == 0) {
            System.out.println("No solution");
        } else {
            System.out.println(ans[0] + " " + ans[1]);
        }

        sc.close();
    }
}
