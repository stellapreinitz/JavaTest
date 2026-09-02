import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise20
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a sentence");
        String sentence = scanner.nextLine();

        int numberOfCharacters = sentence.length();
        int numberOfWords = 0;
        int numberOfVowels = 0;

        if (numberOfCharacters > 0)
        {
            numberOfWords = 1;
        }

        String lowerCaseSentence = sentence.toLowerCase();

        for (int i = 0; i < numberOfCharacters; i++)
        {
            char character = lowerCaseSentence.charAt(i);

            if (character == 'a' || character == 'e' || character == 'i' ||
                    character == 'o' || character == 'u' || character == 'y' ||
                    character == 'å' || character == 'ä' || character == 'ö')
            {
                numberOfVowels++;
            }

            if (character == ' ')
            {
                numberOfWords++;
            }
        }

        System.out.println("The number of characters in the sentence is: " + numberOfCharacters);
        System.out.println("The number of words is: " + numberOfWords);
        System.out.println("The number of vowels is: " + numberOfVowels);
        System.out.println("Here is the sentence in lower case: " + lowerCaseSentence);

        String upperCaseSentence = lowerCaseSentence.toUpperCase();

        System.out.println("Here is the sentence in upper case: " + upperCaseSentence);
    }
}