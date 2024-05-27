package Observer;

import java.util.ArrayList;
import java.util.List;

// Klasa StacjaMeteo implementująca Podmiot
public class StacjaMeteo implements Podmiot {
    private List<Obserwator> obserwatorzy;
    private String wiadomosc;

    public StacjaMeteo() {
        obserwatorzy = new ArrayList<>();
    }

    @Override
    public void zarejestrujObserwatora(Obserwator o) {
        obserwatorzy.add(o);
    }

    @Override
    public void usunObserwatora(Obserwator o) {
        obserwatorzy.remove(o);
    }

    @Override
    public void powiadomObserwatorow() {
        for (Obserwator obserwator : obserwatorzy) {
            obserwator.aktualizacja(wiadomosc);
        }
    }

    public void ustawWiadomosc(String wiadomosc) {
        this.wiadomosc = wiadomosc;
        powiadomObserwatorow();
    }
}
