package Singleton;

// Klasa Main do demonstracji użycia Singleton
public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.pobierzInstancje();
        Singleton singleton2 = Singleton.pobierzInstancje();

        singleton1.wykonajOperacje();
        singleton2.wykonajOperacje();

        // Sprawdzenie, czy obie referencje wskazują na tę samą instancję
        if (singleton1 == singleton2) {
            System.out.println("Obie referencje wskazują na tę samą instancję Singletona.");
        } else {
            System.out.println("Referencje wskazują na różne instancje Singletona.");
        }
    }
}
