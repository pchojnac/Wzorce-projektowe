package FactoryMethod;

// Klasa reprezentująca rosół, implementująca interfejs Zupa
public class Rosol implements Zupa{
    @Override
    public void gotuj() {
        System.out.println("Gotuję rosół");
    }
}
