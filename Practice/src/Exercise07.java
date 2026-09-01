import java.util.Scanner;

public class Exercise07
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18)
        {
            System.out.println("You are allowed to drive.");
        }
        if (age >= 20)
        {
            System.out.println("You are allowed to buy alcohol and make purchases at Systembolaget.");
        }
        if (age >= 65)
        {
            System.out.println("You qualify as a senior.");
        }
    }
}
