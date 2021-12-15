public class portal {
    public static void main(String[] args) {
        Auction auction1 = new Auction();
        auction1.tittle = "Xbox One";
        auction1.description = "konsola dla wymagających graczy";
        auction1.price = 123.99;
        auction1.seller1.firstName = "Jan";
        auction1.seller1.lastName = "Kowalski";
        auction1.seller1.adress1.city = "Wrocław";
        auction1.seller1.adress1.postalCode = "50-500";
        auction1.seller1.adress1.street = "kościuszki";
        auction1.seller1.adress1.homeNo = 24;
        auction1.seller1.adress1.flatNo = 21;

        Auction auction2 = new Auction();
        auction2.tittle = "Samsung S20";
        auction2.description = "Niesamowity telefon z trzema obiektywami";
        auction2.price = 3999;
        auction2.seller1.firstName = "Justyna";
        auction2.seller1.lastName = "Adamczyk";

        System.out.println( "Aukcja pierwsza dotyczy: ");
        System.out.println( "Przedmiot : " + auction1.tittle);
        System.out.println("opis : " + auction1.description);
        System.out.println("cena to: " + auction1.price + " zł");
        System.out.println("sprzedający : " + auction1.seller1.firstName + " " + auction1.seller1.lastName);

        System.out.println( "Aukcja druga dotyczy: ");
        System.out.println( "Przedmiot : " + auction2.tittle);
        System.out.println("opis : " + auction2.description);
        System.out.println("cena to: " + auction2.price + " zł");
        System.out.println("sprzedający : " + auction2.seller1.firstName + " " + auction2.seller1.lastName);
    }
}
