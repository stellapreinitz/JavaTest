import java.util.Scanner;

public class BookingApp2
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String customerName = scanner.nextLine();

        System.out.println("Welcome " + customerName);

        System.out.println("Enter number of guests: ");
        int numberOfGuests = scanner.nextInt();
        scanner.nextLine();

        System.out.println("You have selected reservation for " + numberOfGuests + " guests.");

        boolean studentGroup = true;

        if (numberOfGuests >= 10 && studentGroup)
        {
            System.out.println("Party reservation discount applies.");
        }
        else if (numberOfGuests >= 5)
        {
            System.out.println("Group reservation discount applies.");
        }
        else
        {
            System.out.println("Standard price applies.");
        }
        System.out.println("Thank you for your reservation!");
    }
}