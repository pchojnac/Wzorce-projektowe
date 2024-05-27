package FactoryMethod;

// Abstrakcyjna klasa Kuchnia, która definiuje metodę fabrykującą przygotujZupe() i metodę zrobZupe()
public abstract class Kuchnia {

    public abstract Zupa przygotujZupe();

    public void zrobZupe() {
        Zupa zupa = przygotujZupe();
        zupa.gotuj();
    }
}