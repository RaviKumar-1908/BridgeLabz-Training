import java.util.Scanner;

public class TeemoAttacking {

    public static int findPoisonedDuration(int[] timeSeries, int duration) {

        if (timeSeries.length == 0) return 0;

        int total = 0;

        for (int i = 0; i < timeSeries.length - 1; i++) {
            int gap = timeSeries[i + 1] - timeSeries[i];
            total += Math.min(gap, duration);
        }

        total += duration;
        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] timeSeries = new int[n];

        for (int i = 0; i < n; i++) {
            timeSeries[i] = sc.nextInt();
        }

        int duration = sc.nextInt();

        System.out.println(findPoisonedDuration(timeSeries, duration));

        sc.close();
    }
}
