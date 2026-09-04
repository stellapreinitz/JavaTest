import java.util.Scanner;

public class ArrayPractice1
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int[] scores = new int[5];
        int scoreTotal = 0;
        int scoreHighest = Integer.MIN_VALUE;
        int scoreLowest = Integer.MAX_VALUE;

        for (int index = 0; index < scores.length; index++)
        {
            System.out.println("Input score: ");
            scores[index] = scanner.nextInt();
            scoreTotal += scores[index];
            if (scores[index] > scoreHighest)
            {
                scoreHighest = scores[index];
            }
            if (scores[index] < scoreLowest)
            {
                scoreLowest = scores[index];
            }
        }

        for (int index = 0; index < scores.length; index++)
        {
            System.out.println("Score " + (index + 1) + ": " + scores[index]);
        }

        double scoreAverage = (double) scoreTotal / scores.length;
        System.out.println("Score average: " + scoreAverage);
        System.out.println("Highest score: " + scoreHighest);
        System.out.println("Lowest score: " + scoreLowest);
    }
}