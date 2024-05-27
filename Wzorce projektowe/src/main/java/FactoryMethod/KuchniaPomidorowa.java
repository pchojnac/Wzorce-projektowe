package FactoryMethod;

// Klasa KuchniaPomidorowa, która implementuje metodę fabrykującą, tworząc zupę pomidorową
public class KuchniaPomidorowa extends Kuchnia {
    @Override
    public Zupa przygotujZupe() {
        return new Pomidorowa();
    }
}
