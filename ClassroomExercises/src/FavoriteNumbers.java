public class FavoriteNumbers
{
    static void main(String[] args)
    {
        int[] favoriteNumbers = {13, 7, 15, 4, 9};
        int sum = addNumbers(favoriteNumbers);
        int largestNumber = findLargestNumber(favoriteNumbers);

        printNumbers(favoriteNumbers);

        System.out.println("Sum of favorite numbers: " + sum);
        System.out.println("Largest number: " + largestNumber);
    }

    public static void printNumbers(int[] numbersToPrint)
    {
        for (int index = 0; index < numbersToPrint.length; index++)
        {
            System.out.println(numbersToPrint[index]);
        }
    }

    public static int addNumbers(int[] numbersToAdd)
    {
        int localSum = 0;

        for (int index = 0; index < numbersToAdd.length; index++)
        {
            localSum += numbersToAdd[index];
        }

        return localSum;
    }

    public static int findLargestNumber(int[] numbersToCompare)
    {
        int localLargestNumber = 0;
        for (int index = 0; index < numbersToCompare.length; index++)
        {
            if (numbersToCompare[index] > localLargestNumber)
            {
                localLargestNumber = numbersToCompare[index];
            }
        }

        return localLargestNumber;
    }
}
