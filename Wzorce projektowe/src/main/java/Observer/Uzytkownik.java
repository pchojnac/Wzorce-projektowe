package Observer;

// Klasa Uzytkownik implementująca Obserwator
public class Uzytkownik implements Obserwator{
    private String nazwa;

    public Uzytkownik(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public void aktualizacja(String wiadomosc) {
        System.out.println("Użytkownik " + nazwa + " otrzymał wiadomość: " + wiadomosc);
    }
    }

