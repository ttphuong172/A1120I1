package Lamp;

public class Lamp implements SwitchableDevice {


    @Override
    public void turnOn() {
        System.out.println("Den da bat");
    }

    @Override
    public void turnOff() {
        System.out.println("Den da tat");
    }
}
