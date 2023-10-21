public class Lamp {
    private boolean isOn;

    public Lamp() {
        isOn = false;
    }

    public void TurnOn() {
        isOn = true;
    }

    public void TurnOff() {
        isOn = false;
    }

    public void displayLampInfo() {
        System.out.println("Lamp is " + (isOn ? "on" : "off"));
    }

    public static void main(String[] args) {
        Lamp a = new Lamp();
        Lamp b = new Lamp();

        a.TurnOn();
        b.TurnOff();

        a.displayLampInfo();
        b.displayLampInfo();
    }
}