package Adapter;

// Adapter, który pozwala na podłączenie ładowarki microUSB do portu Lightning
public class AdapterLightningDoMicroUSB implements LightingPort{
    private MicroUSBCharger ladowarkaMicroUSB;

    public AdapterLightningDoMicroUSB(MicroUSBCharger ladowarkaMicroUSB) {
        this.ladowarkaMicroUSB = ladowarkaMicroUSB;
    }
    @Override
    public void podlaczLightning() {
        ladowarkaMicroUSB.podlaczMicroUSB();
    }
}
