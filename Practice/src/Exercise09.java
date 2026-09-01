import java.util.Scanner;

public class Exercise09
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What the outside temperature today in celcius?");
        double temperature = scanner.nextDouble();

        if (temperature <= 0)
        {
            System.out.println("Take your winter coat!");
        }
        else if (temperature <= 10)
        {
            System.out.println("Dress warm!");
        }
        else if (temperature <= 20)
        {
            System.out.println("Perfect weather for a hoodie!");
        }
        else
        {
            System.out.println("Shorts weather!");
        }
    }
}
