public class ArrayBasics
{
    static void main(String[] args)
    {
        String[]studentNames = {"Stella", "Amanda", "Arthur", "Linus"};

        printNames(studentNames);
    }

    public static void printNames(String[] names)
    {
        for (int index = 0; index < names.length; index++)
        {
            System.out.println(names[index]);
        }
    }
}