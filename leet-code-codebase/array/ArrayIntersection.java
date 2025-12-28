import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArrayIntersection {

    public static Set<Integer> findIntersection(int[] nums1, int[] nums2) {

        Set<Integer> result = new HashSet<>();

        for (int num1 : nums1) {
            for (int num2 : nums2) {
                if (num1 == num2) {
                    result.add(num1);
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        int[] nums1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        int[] nums2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        Set<Integer> result = findIntersection(nums1, nums2);

        System.out.println("Intersection elements:");
        for (int x : result) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
