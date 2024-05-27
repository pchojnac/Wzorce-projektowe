package Adapter;

// Klasa reprezentująca telefon z portem Lightning
public class IPhone implements LightingPort{
    @Override
    public void podlaczLightning() {
        System.out.println("IPhone podłączony przez port Lightning");
    }
}
