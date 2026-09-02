import java.util.Scanner;
import java.util.Arrays;

public class Exercise18
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of point entries: ");
        int numberOfEntries = scanner.nextInt();
        scanner.nextLine();
        int[] scores = new int[numberOfEntries];
        int higherThanAverageScores = 0;
        int sum = 0;
        int highest = 0;
        int lowest = 0;

        System.out.println("Enter score: ");
        for (int i = 0; i < scores.length; i++)
        {
            scores[i] = scanner.nextInt();
        }

        System.out.println("The scores are as follows: ");
        System.out.println(Arrays.toString(scores));

        for (int num : scores)
        {
            sum += num;
        }

        System.out.println("The sum of all scores are: " + sum);

        double average = (double) sum / scores.length;
        System.out.println("The average score is: " + average);

        lowest = scores[0];

        for (int num : scores)
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
