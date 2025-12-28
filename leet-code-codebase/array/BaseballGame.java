import java.util.ArrayList;
import java.util.Scanner;

public class BaseballGameNoStack {

    public static int calPoints(String[] operations) {

        ArrayList<Integer> record = new ArrayList<>();

        for (String op : operations) {

            if (op.equals("C")) {
                record.remove(record.size() - 1);
            }
            else if (op.equals("D")) {
                int last = record.get(record.size() - 1);
                record.add(2 * last);
            }
            else if (op.equals("+")) {
                int last = record.get(record.size() - 1);
                int secondLast = record.get(record.size() - 2);
                record.add(last + secondLast);
            }
            else {
                record.add(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int x : record) {
            sum += x;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of operations: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] ops = new String[n];
        System.out.println("Enter operations:");
        for (int i = 0; i < n; i++) {
            ops[i] = sc.nextLine();
        }

        System.out.println("Total score: " + calPoints(ops));
        sc.close();
    }
}
