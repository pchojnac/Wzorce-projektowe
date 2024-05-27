package FactoryMethod;

// Klasa KuchniaRosol, która implementuje metodę fabrykującą, tworząc rosół
public class KuchniaRosol extends Kuchnia {
    @Override
    public Zupa przygotujZupe() {
        return new Rosol();
    }
}
