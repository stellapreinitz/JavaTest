import java.util.Scanner;

public class Exercise14
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int choice;

        do
        {
            System.out.println("========\nMenu\n========\n");
            System.out.println("1. Calculate area of rectangle");
            System.out.println("2. Calculate area of circle");
            System.out.println("3. Quit");
            System.out.println("Enter choice: ");

            choice = scanner.nextInt();

            switch (choice)
            {
                case 1:

                    System.out.println("Enter length of rectangle:");
                    double length = scanner.nextDouble();
                    System.out.println("Enter height of rectangle:");
                    double height = scanner.nextDouble();

                    double rectangelArea = length * height;

                    System.out.println("Rectangle area: " + rectangelArea);

                    break;

                case 2:

                    System.out.println("Enter radius: ");
                    double radius = scanner.nextDouble();

                    double circleArea = radius * radius * Math.PI;

                    System.out.println("Circle area: " + circleArea);

                    break;
            }
        }
        while (choice != 3);
    }
}
