import java.util.Scanner;

public class Exercise10
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Username: ");
        String username = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();

        String registeredUsername = "admin";
        String registeredPassword = "password123";

        if (username.equals(registeredUsername) && (password.equals(registeredPassword)))
        {
            System.out.println("Welcome " + registeredUsername + "!");
        }
        else
        {
            System.out.println("Incorrect credentials");
        }
    }
}
