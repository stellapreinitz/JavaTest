import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Hello, I'm Stella!");
        System.out.println("I'm starting out with Java today!");
        System.out.println("I already write C# so some of it is familiar.");
        System.out.println("What is your name?");

        String userName = inputReader.nextLine();
        System.out.println("Hello " + userName);

        System.out.println("What programming languages do you like?");

        String preferedLanguage = inputReader.nextLine();
        if (preferedLanguage.equalsIgnoreCase("C#"))
        {
            System.out.println("Ah, the best language! You're gonna go far " + userName + "!");
        } else if (preferedLanguage.equalsIgnoreCase("Java"))
        {
            System.out.println("Uh huh " + userName + ", teachers pet eh?");
        } else
        {
            System.out.println("Oh, good for you " + userName + "...");
        }
    }
}