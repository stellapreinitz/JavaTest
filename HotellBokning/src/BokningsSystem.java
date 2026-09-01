public class BokningsSystem
{
    static void main(String[] args)
    {
        String guestName = "Fatima";
        int guestAge = 36;
        int numberOfNights = 3;
        double pricePerNight = 849.50;
        boolean breakfastIncluded = true;
        char roomCategory = 'D';
        double serviceFee = 49.0;
        double price = numberOfNights * pricePerNight;
        double totalPrice = numberOfNights * pricePerNight + serviceFee;

        System.out.println("=== HotellBokning ===\n");
        System.out.println("Gäst: " + guestName);
        System.out.println("Ålder: "+ guestAge);
        System.out.println("Rumskategori: " + roomCategory);
        System.out.println("Antal nätter: " + numberOfNights);
        System.out.println("Pris per natt: " + pricePerNight);
        System.out.println("Frukost ingår: " + breakfastIncluded + "\n\n");
        System.out.println("Total kostnad: " + price + "\n");
        System.out.println("Total kostnad inkl serviceavgift: " + totalPrice);
    }
}
