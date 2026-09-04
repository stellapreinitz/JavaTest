import java.util.Scanner;

public class ArrayPractice2
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[6];
        boolean numberFound = false;

        for (int index = 0; index < numbers.length; index++)
        {
            System.out.println("Input integer value: ");
            numbers[index] = scanner.nextInt();
        }

        System.out.println("Enter value to search for: ");
        int searchedNumber = scanner.nextInt();

        for (int index = 0; index < numbers.length; index++)
        {
            if (numbers[index] == searchedNumber)
            {
                System.out.println("Value found at index: " + index);
                numberFound = true;
            }
        }

        if (!numberFound)
        {
            System.out.println("Value not found.");
        }
    }
}