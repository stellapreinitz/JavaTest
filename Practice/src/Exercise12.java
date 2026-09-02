import java.util.Scanner;
//InputMismatchException is a built-in tool to prevent illegal inputs.
import java.util.InputMismatchException;

public class Exercise12
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //Variable delcared outside of loop to be used in the entire class
        int validNumber = 0;
        //Set to "false" to start loop
        boolean isNumberValid = false;

        System.out.println("Multiplication table");
        System.out.println("====================");
        System.out.println("Which table do you wish to see?");

        //Loops until valid input is given
        while (!isNumberValid)
        {
            System.out.println("Please input an integer: ");

            //Accepts integer as input and flips bool to true to escape loop
            try
            {
                validNumber = scanner.nextInt();
                isNumberValid = true;
            }
            //Catches any input that is not integer, loop continues
            catch (InputMismatchException Error)
            {
                System.out.println("Error: Not a valid integer.");
                //clear buffer
                scanner.next();
            }
        }

        System.out.println("Presenting multiplication table for " + validNumber);
        //Run loop from 1 to 10 to create standard table
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(validNumber * i);
        }
    }
}
