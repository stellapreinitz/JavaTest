import java.util.Scanner;

public class Exercise04
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, I hope you are doing ok, please use only valid input types :).");

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Where do you live?");
        String placeOfResidence = scanner.nextLine();

        System.out.println("Great to meet you " + name + "!");
        System.out.println(age + " is such a good age, good for you.");
        System.out.println("I bet " + placeOfResidence + " is a nice place to live.");
    }
}
