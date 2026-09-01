import java.util.Scanner;
import java.util.Arrays;

public class Exercise16
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of point entries: ");
        int numberOfEntries = scanner.nextInt();
        scanner.nextLine();
        int[] SCORES = new int[numberOfEntries];
        int higherThanAverageScores = 0;
        int sum = 0;
        int highest = 0;
        int lowest = 0;

        System.out.println("Enter score: ");
        for (int i = 0; i < SCORES.length; i++)
        {
            SCORES[i] = scanner.nextInt();
        }

        System.out.println("The scores are as follows: ");
        System.out.println(Arrays.toString(SCORES));

        for (int num : SCORES)
        {
            sum += num;
        }

        System.out.println("The sum of all scores are: " + sum);

        double average = (double) sum / SCORES.length;
        System.out.println("The average score is: " + average);

        lowest = SCORES[0];

        for (int num : SCORES)
        {
            if (num > highest)
            {
                highest = num;
            }

            if (num < lowest)
            {
                lowest = num;
            }

            if (num > average)
            {
                higherThanAverageScores++;
            }
        }

        System.out.println("The highest score is: " + highest);
        System.out.println("The lowest score is: " + lowest);
        System.out.println("Number of scores above average: "+ higherThanAverageScores);
    }
}
