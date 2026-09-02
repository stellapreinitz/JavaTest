import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercise19
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean validNumber = false;
        String[] names = null;
        boolean search = false;

        while (!validNumber)
        {
            System.out.println("How many names do you want to enter?");
            try
            {
                int numberOfNames = scanner.nextInt();
                scanner.nextLine();
                names = new String[numberOfNames];
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
        System.out.println("Do you want to search for a name? (yes/no)");
        String searchReply = scanner.nextLine();
        if (searchReply.equals("yes") || searchReply.equals("Yes"))
        {
            search = true;
        }
        while (search)
        {
            {
                System.out.println("Enter a name to search for: ");
                String searchedName = scanner.nextLine();

                boolean foundName = false;

                for (int i = 0; i < names.length; i++)
                {
                    if (names[i].equals(searchedName))
                    {
                        foundName = true;
                    }
                }
                if (foundName)
                {
                    System.out.println(searchedName + " found!");
                }
                else
                {
                    System.out.println(searchedName + " not found.");
                }
            }

            {
                System.out.println("Search again?");
                searchReply = scanner.nextLine();
                if (!searchReply.equals("yes") && !searchReply.equals("Yes"))
                {
                    search = false;
                }
            }
        }
    }
}