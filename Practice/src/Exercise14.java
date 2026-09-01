import java.util.Scanner;

public class Exercise14
{
    static void main(String[] args)
    {
        int[] favoriteNumbers = {4, 8, 999, 300, 9};
        int sum = 0;
        int largestNumber = favoriteNumbers[0];
        int smallestNumber = favoriteNumbers[0];

        System.out.println("Favorite numbers: ");

        for (int i = 0; i < favoriteNumbers.length; i++)
        {
            System.out.println(favoriteNumbers[i]);

            sum += favoriteNumbers[i];

            if (favoriteNumbers[i] > largestNumber)
            {
                largestNumber = favoriteNumbers[i];
            }

            if (favoriteNumbers[i] < smallestNumber)
            {
                smallestNumber = favoriteNumbers[i];
            }
        }
        System.out.println("Sum of favorite numbers: " + sum);
        System.out.println("Largest favorite number: " + largestNumber);
        System.out.println("Smallest favorite number: " + smallestNumber);
    }
}
