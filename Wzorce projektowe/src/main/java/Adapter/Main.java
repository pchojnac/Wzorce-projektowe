package Adapter;

// Klasa Main, która demonstruje użycie wzorca Adapter
public class Main {

    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        MicroUSBCharger ladowarkaMicroUSB = new MicroUSBCharger();

        AdapterLightningDoMicroUSB adapter = new AdapterLightningDoMicroUSB(ladowarkaMicroUSB);

        iphone.podlaczLightning();  // IPhone podłączony przez port Lightning
        adapter.podlaczLightning();  // Ładowanie przez port microUSB
    }
}

