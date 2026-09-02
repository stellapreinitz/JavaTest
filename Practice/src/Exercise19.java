import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercise19
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean validNumber = false;

        while (!validNumber)
        {
            System.out.println("How many names do you want to enter?");
            try
            {
                int numberOfNames = scanner.nextInt();
                scanner.nextLine();
                String[] names = new String[numberOfNames];
                validNumber = true;

                for (int i = 0; i < names.length; i++)
                {
                    System.out.println("Enter name " + (i + 1));
                    names[i] = scanner.nextLine();
                }

                Arrays.sort(names);
                for (int i = 0; i < names.length; i++)
                {
                    System.out.println(names[i]);
                }
            }
            catch (InputMismatchException Error)
            {
                System.out.println("Invalid input, please enter an integer");
                scanner.next();
            }
        }
    }
}
// Skapa ett program som:
// 1. Frågar hur många namn användaren vill mata in
// 2. Skapar en String-array av rätt storlek
// 3. Låter användaren mata in alla namn
// 4. Skriver ut alla namn i alfabetisk ordning (använd Arrays.sort())
// 5. Låter användaren söka efter ett namn
