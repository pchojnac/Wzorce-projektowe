package Observer;

// Klasa Main, która demonstruje użycie wzorca Observer
public class Main {
    public static void main(String[] args) {
        StacjaMeteo stacjaMeteo = new StacjaMeteo();

        Uzytkownik uzytkownik1 = new Uzytkownik("Jan");
        Uzytkownik uzytkownik2 = new Uzytkownik("Anna");

        stacjaMeteo.zarejestrujObserwatora(uzytkownik1);
        stacjaMeteo.zarejestrujObserwatora(uzytkownik2);

        stacjaMeteo.ustawWiadomosc("Pogoda jest słoneczna");
        stacjaMeteo.ustawWiadomosc("Zbliża się burza");

        stacjaMeteo.usunObserwatora(uzytkownik1);
        stacjaMeteo.ustawWiadomosc("Temperatura spadła do 15 stopni");
    }
}
