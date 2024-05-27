package FactoryMethod;

// Klasa reprezentująca zupę pomidorową, implementująca interfejs Zupa
public class Pomidorowa implements Zupa {

    @Override
    public void gotuj() {
        System.out.println("Gotuję zupę pomidorową");
    }
}