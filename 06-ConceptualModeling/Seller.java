import java.util.ArrayList;

class Sklep {
    private ArrayList<Produkt> sprzedaneProdukty;

    public Sklep() {
        this.sprzedaneProdukty = new ArrayList<>();
    }

    public void sprzedajProdukt(String nazwaProduktu, double cena, int ilosc) {
        Produkt produkt = new Produkt(nazwaProduktu, cena, ilosc);
        sprzedaneProdukty.add(produkt);
        System.out.println("Sprzedano " + nazwaProduktu + " za $" + cena + " każdy");
    }

    public ArrayList<Produkt> getSprzedaneProdukty() {
        return sprzedaneProdukty;
    }
}

class Klient {
    private ArrayList<Produkt> zakupioneProdukty;

    public Klient() {
        this.zakupioneProdukty = new ArrayList<>();
    }

    public void kupProdukt(String nazwaProduktu, double cena, int ilosc) {
        Produkt zakupionyProdukt = new Produkt(nazwaProduktu, cena, ilosc);
        zakupioneProdukty.add(zakupionyProdukt);
        System.out.println("Kupiono " + nazwaProduktu + " za $" + cena + " każdy");
    }

    public ArrayList<Produkt> getZakupioneProdukty() {
        return zakupioneProdukty;
    }
}

class Produkt {
    private String nazwa;
    private double cena;
    private int ilosc;

    public Produkt(String nazwa, double cena, int ilosc) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.ilosc = ilosc;
    }

    public double getKosztCalkowity() {
        return cena * ilosc;
    }
}

public class SystemSprzedazy {
    public static void main(String[] args) {
        Sklep sklep = new Sklep();

        Klient dziecko = new Klient();

        sklep.sprzedajProdukt("Samochodzik", 10.0, 2);
        sklep.sprzedajProdukt("Lalka", 8.0, 1);

        dziecko.kupProdukt("Samochodzik", 10.0, 1);

        // Wyświetlanie zakupionych produktów
        System.out.println("\nProdukty sprzedane przez ZabawkiDlaDzieci:");
        for (Produkt produkt : sklep.getSprzedaneProdukty()) {
            System.out.println("Koszt: $" + produkt.getKosztCalkowity());
        }

        System.out.println("\nProdukty zakupione przez Dziecko:");
        for (Produkt produkt : dziecko.getZakupioneProdukty()) {
            System.out.println("Koszt: $" + produkt.getKosztCalkowity());
        }
    }
}