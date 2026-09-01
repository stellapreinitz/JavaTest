import java.util.Scanner;

public class HotelBookingApp
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        int numberOfGuests = 0;
        int numberOfNights = 0;
        String customerName = "";
        boolean breakfastIncluded = false;
        String breakfastIncludedString = "no";

        while (choice != 4)
        {
            System.out.println("=== Hotel reservation ===");
            System.out.println("1. Create reservation");
            System.out.println("2. Show reservation");
            System.out.println("3. Show guests");
            System.out.println("4. Quit");

            System.out.println("Choose an option from the menu");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 1 ->
                {
                    breakfastIncluded = false;
                    breakfastIncludedString = "no";

                    System.out.println("Enter customer name: ");
                    customerName = scanner.nextLine();

                    do
                    {
                        System.out.println("Enter number of guests: ");
                        numberOfGuests = scanner.nextInt();
                        scanner.nextLine();

                        if (numberOfGuests <= 0)
                        {
                            System.out.println("Number of guests must be 1 or more.");
                        }
                        if (numberOfGuests >= 6)
                        {
                            System.out.println("Breakfast included");
                            breakfastIncluded = true;
                        }
                    }
                    while (numberOfGuests <= 0);

                    do
                    {
                        System.out.println("Enter number of nights: ");
                        numberOfNights = scanner.nextInt();
                        scanner.nextLine();

                        if (numberOfNights <= 0)
                        {
                            System.out.println("Number of nights must be 1 or more.");
                        }
                    }
                    while (numberOfNights <= 0);
                }

                case 2 ->
                {
                    breakfastIncludedString = breakfastIncluded ? "yes" : "no";

                    System.out.println("Showing reservation");
                    System.out.println("Customer name: " + customerName);
                    System.out.println("Number of guests: " + numberOfGuests);
                    System.out.println("Number of nights: " + numberOfNights);
                    System.out.println("Breakfast included: " + breakfastIncludedString);

                }

                case 3 ->
                {
                    System.out.println("Showing guests");
                    for (int i = 0; i < numberOfGuests; i++)
                    {
                        System.out.println("Guest number " + (i + 1) );
                    }
                }

                case 4 ->
                {
                    System.out.println("Thank you, closing service");
                }

                default ->
                {
                    System.out.println("Sorry, invalid choice, choose from the menu list");
                }
            }
        }
    }
}
