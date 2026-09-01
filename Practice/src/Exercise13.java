import java.util.Scanner;

public class Exercise13
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int age = 0;

        while (age >= 120 || age <= 0)
        {
            System.out.println("Enter age: ");
            age = scanner.nextInt();

            if (age >= 120 || age <= 0)
                System.out.println("Invalid input, try again");
            else
                System.out.println("Thank you for your input");
        }
    }
}
