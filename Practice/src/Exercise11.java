import java.util.Scanner;

public class Exercise11
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double originalPrice = 899.90;

        double finalPrice = originalPrice;

        System.out.println("Price calculator\n================\n");

        System.out.println("Are you a student? (yes/no)");
        String student = scanner.nextLine();
        System.out.println("Are you a member? (yes/no)");
        String member = scanner.nextLine();

        System.out.println("Original price: " + originalPrice);
        if (student.equals("yes") && (member.equals("yes")))
        {
            System.out.println("Discount: 15%");
            finalPrice = originalPrice * 0.85;
        }
        else if (student.equals("yes"))
        {
            System.out.println("Discount: 10%");
            finalPrice = originalPrice * 0.9;
        }
        else if (member.equals("yes"))
        {
            System.out.println("Discount: 5%");
            finalPrice = originalPrice * 0.95;
        }
        else
        {
            System.out.println("No discount");
        }

        System.out.println("Final price: " + finalPrice);
    }
}
