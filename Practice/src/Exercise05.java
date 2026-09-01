import java.util.Scanner;

public class Exercise05
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome, use only integers or decimals for input.");
        System.out.println("Enter a number: ");
        double number1 = scanner.nextDouble();
        System.out.println("Enter one more number: ");
        double number2 = scanner.nextDouble();

        double sum = number1 + number2;
        double product = number1 * number2;
        double average = (number1 + number2) / 2;

        System.out.println("The sum of your numbers are: " + sum + ".");
        System.out.println("The product of your numbers are: " + product + ".");
        System.out.println("The average of your numbers are: " + average + ".");
    }
}
