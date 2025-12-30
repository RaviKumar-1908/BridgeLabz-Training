/*14. Movie Ticket Booking App 🎬
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
*/

import java.util.Scanner;

public class MovieTicketBooking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice = 'y';

        System.out.println("===== Movie Ticket Booking App =====\n");

        do {
            int ticketPrice = 0;
            int snackPrice = 0;

            System.out.print("Enter movie type (Action / Comedy / Drama): ");
            String movieType = sc.next();

            System.out.print("Enter seat type (Gold / Silver): ");
            String seatType = sc.next();

            System.out.print("Do you want snacks? (yes/no): ");
            String snacks = sc.next();

            switch (movieType.toLowerCase()) {
                case "action":
                    ticketPrice = 200;
                    break;
                case "comedy":
                    ticketPrice = 150;
                    break;
                case "drama":
                    ticketPrice = 180;
                    break;
                default:
                    System.out.println("Invalid movie type");
                    continue;
            }

            if (seatType.equalsIgnoreCase("gold")) {
                ticketPrice += 100;
            } else if (seatType.equalsIgnoreCase("silver")) {
                ticketPrice += 50;
            } else {
                System.out.println("Invalid seat type");
                continue;
            }

            if (snacks.equalsIgnoreCase("yes")) {
                snackPrice = 80;
            }

            int totalAmount = ticketPrice + snackPrice;

            System.out.println("\n----- Booking Summary -----");
            System.out.println("Movie Type: " + movieType);
            System.out.println("Seat Type: " + seatType);
            System.out.println("Snacks: " + snacks);
            System.out.println("Total Amount: ₹" + totalAmount);

            System.out.print("\nDo you want to book for another customer? (y/n): ");
            choice = sc.next().charAt(0);
            System.out.println();

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Thank you for using Movie Ticket Booking App 🎬");
        sc.close();
    }
}
