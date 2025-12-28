import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {

    public static int majorityElement(int[] nums) {

        int size = nums.length;
        int occurrence = size / 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) > occurrence) {
                return key;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(majorityElement(nums));

        sc.close();
    }
}
