import java.util.Scanner;

public class BookingApp3
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 3)
        {
            System.out.println("=== Reservation service ===");
            System.out.println("1. Create reservation");
            System.out.println("2. Example reservation");
            System.out.println("3. Quit");

            System.out.println("Choose an option from the menu");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 1 ->
                {
                    int numberOfGuests = 0;
                    System.out.println("Enter customer name: ");
                    String customerName = scanner.nextLine();

                    while (numberOfGuests < 1)
                    {
                        System.out.println("Enter number of guests: ");
                        numberOfGuests = scanner.nextInt();
                        scanner.nextLine();
                        if (numberOfGuests < 1)
                        {
                            System.out.println("Number of guests can not be 0 or negative.");
                        }
                    }

                    System.out.println("\nReservation created for " + customerName + ".");

                    if (numberOfGuests >= 10)
                    {
                        System.out.println("Party reservation: discount is valid.");
                    }
                    else if (numberOfGuests >= 5)
                    {
                        System.out.println("Group reservation: discount is valid");
                    }
                    else
                    {
                        System.out.println("Regular price applies.");
                    }

                }
                case 2 ->
                {
                    System.out.println("Example reservation: ");
                    System.out.println("Customer: Amina");
                    System.out.println("Number of guests: 4");
                }
                case 3 -> System.out.println("Thank you, closing service");
                default -> System.out.println("Sorry, invalid input, enter valid menu option");
            }
        }
    }
}
