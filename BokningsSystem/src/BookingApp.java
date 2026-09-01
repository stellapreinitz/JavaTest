public class BookingApp
{
    public static void main(String[] args)
    {
        String customerName = "Amina";
        int numberOfGuests = 4;
        int numberOfStudents = 0;
        double pricePerGuest = 249.99;
        double studentDiscount = 50d;
        double pricePerStudent = pricePerGuest - studentDiscount;
        boolean hasStudentDiscount = false;
        boolean bookingConfirmed = true;
        char bookingCode = 'A';
        int totalNumberOfGuests = numberOfGuests + numberOfStudents;
        double totalPrice = totalNumberOfGuests * pricePerGuest;
        double totalPriceDiscounted = (numberOfGuests * pricePerGuest) + (numberOfStudents * pricePerStudent);
        if (numberOfStudents != 0)
        {
            hasStudentDiscount = true;
        }
        if (hasStudentDiscount == true)
        {
            System.out.println("Kund: " + customerName);
            System.out.println("Antal gäster: " + numberOfGuests);
            System.out.println("Antal gäster med studentrabatt: " + numberOfStudents);
            System.out.println("Pris per gäst: " + pricePerGuest + "kr");
            System.out.println("Pris per gäst med studentrabatt: " + pricePerStudent + "kr");
            System.out.println("Bekräftad: " + bookingConfirmed);
            System.out.println("Bokningskod: " + bookingCode);
            System.out.println("Pris total: " + totalPrice);
            System.out.println("Pris total med rabatt: " + totalPriceDiscounted + "kr");
        }
        else
        {
            System.out.println("Kund: " + customerName);
            System.out.println("Antal gäster: " + numberOfGuests);
            System.out.println("Pris per gäst: " + pricePerGuest + "kr");
            System.out.println("Bekräftad: " + bookingConfirmed);
            System.out.println("Bokningskod: " + bookingCode);
            System.out.println("Pris total: " + totalPrice + "kr");
        }
    }
}
