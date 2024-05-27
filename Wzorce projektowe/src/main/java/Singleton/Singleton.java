package Singleton;

public class Singleton {
    private static Singleton instancja;

    // Prywatny konstruktor zapobiega tworzeniu instancji z zewnątrz
    private Singleton() {}

    // Metoda do pobierania jedynej instancji Singleton
    public static Singleton pobierzInstancje() {
        if (instancja == null) {
            instancja = new Singleton();
        }
        return instancja;
    }

    // Przykładowa metoda
    public void wykonajOperacje() {
        System.out.println("Singleton wykonuje operację.");
    }
}
