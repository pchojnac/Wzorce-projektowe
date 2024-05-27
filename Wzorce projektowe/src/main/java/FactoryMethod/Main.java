package FactoryMethod;

// Klasa Main, która demonstruje użycie wzorca Factory Method
public class Main {
    public static void main(String[] args) {
        Kuchnia kuchniaPomidorowa = new KuchniaPomidorowa();
        kuchniaPomidorowa.zrobZupe(); //Gotuję zupę pomidorową

        Kuchnia kuchniaRosol = new KuchniaRosol();
        kuchniaRosol.zrobZupe(); //Gotuję rosół
    }
}
