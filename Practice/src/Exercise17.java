import java.util.Scanner;

public class Exercise17
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        int[] temperature = new int[5];
        double averageTemperature = 0;
        int warmestDayIndex = 0;
        int coldestDayIndex = 0;

        for (int i = 0; i < week.length; i++)
        {
            System.out.println("Enter temperature for " + week[i] + " : ");
            int temperatureInput = scanner.nextInt();
            temperature[i] = temperatureInput;

            averageTemperature += temperature[i];

            if (temperature[i] > temperature[warmestDayIndex])
            {
                warmestDayIndex = i;
            }

            if (temperature[i] < temperature[coldestDayIndex])
            {
                coldestDayIndex = i;
            }
        }
        averageTemperature = averageTemperature / week.length;

        for (int i = 0; i < week.length; i++)
        {
            System.out.println(week[i] + " temperature: " + temperature[i]);
        }

        System.out.println("The average temperature of the week is: " + averageTemperature);
        System.out.println("The warmest day was " + week[warmestDayIndex]);
        System.out.println("The coldest day was " + week[coldestDayIndex]);

    }
}
