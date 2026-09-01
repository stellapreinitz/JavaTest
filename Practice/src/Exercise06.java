import java.util.Scanner;

public class Exercise06
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to currecny converter, use only integers or decimals.");
        System.out.println("Please enter amount in SEK: ");
        double sek = scanner.nextDouble();

        double usd = sek * 0.1041;
        double eur = sek * 0.0899;

        System.out.println("At the time of publishing, " + sek + " SEK exchanges for following amount in other currencies: ");
        System.out.println("USD: " + usd);
        System.out.println("EUR: " + eur);

    }
}
