/*15. Rohan’s Library Reminder App 📚
Rohan wants a fine calculator:
● Input return date and due date.
● If returned late, calculate fine: ₹5/day.
● Repeat for 5 books using for-loop.
*/

import java.util.Scanner;

public class LibraryReminder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalFine = 0;

        System.out.println("=== Library Fine Calculator ===\n");

        for (int i = 1; i <= 5; i++) {

            System.out.println("Book " + i + ":");

            System.out.print("Enter due date (day number): ");
            int dueDate = sc.nextInt();

            System.out.print("Enter return date (day number): ");
            int returnDate = sc.nextInt();

            if (returnDate > dueDate) {
                int lateDays = returnDate - dueDate;
                int fine = lateDays * 5;
                totalFine += fine;
                System.out.println("Late by " + lateDays + " days. Fine: ₹" + fine);
            } else {
                System.out.println("Returned on time. No fine.");
            }

            System.out.println();
        }

        System.out.println("Total fine for all books: ₹" + totalFine);
        sc.close();
    }
}
