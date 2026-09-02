import java.util.Scanner;
import java.util.Arrays;

public class Exercise21
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean validWord = false;
        String word = " ";

        while (!validWord)
        {
            System.out.println("Please enter a word: ");
            word = scanner.nextLine();

            validWord = true;

            for (int i = 0; i < word.length(); i++)
            {
                char character = word.charAt(i);

                if (character == ' ')
                {
                    System.out.println("You typed more than one word, please try again.");
                    validWord = false;
                    break;
                }
            }
        }
        //Make word lower case, eliminates case sensitivity
        word = word.toLowerCase();
        //Transforms string to char array
        char[] charArray = word.toCharArray();
        //Creates a new empty array with same size
        char[] reversedArray = new char[charArray.length];
        //Loop creates a new array that is a mirror of the original array
        for (int i = 0; i < charArray.length; i++)
        {
            reversedArray[charArray.length - 1 - i] = charArray[i];
        }
        //Checks if 2 arrays are identical
        if (Arrays.equals(charArray, reversedArray))
        {
            System.out.println("The word is a palindrome!");
        }
        else
        {
            System.out.println("The word is not a palindrome.");
        }
    }
}