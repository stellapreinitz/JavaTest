import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercise13
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = 33;
        int validNumber = 0;
        boolean isNumberValid = false;
        int numberOfGuesses = 0;

        System.out.println("There is a secret number between 1 and 100\nGuess what it is!");

        while (!isNumberValid)
        {
            System.out.println("Input your guess");

            try
            {
                validNumber = scanner.nextInt();
            }
            catch (InputMismatchException Error)
            {
                System.out.println("Not a valid guess, please use integers");
                scanner.next();
            }

            if (validNumber == 33)
            {
                isNumberValid = true;
                numberOfGuesses++;
            }
            else if (validNumber > 33)
            {
                System.out.println("The secret number is lower than your guess, try again");
                numberOfGuesses++;
            }
            else
            {
                System.out.println("The secret number is higher than your guess, try again");
                numberOfGuesses++;
            }
        }
        System.out.println("You guessed " + numberOfGuesses + " times");
        System.out.println("For those who come after...");

    }
}
