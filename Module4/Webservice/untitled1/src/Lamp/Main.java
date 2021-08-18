package Lamp;

public class Main {
    public static void main(String[] args) {
        SwitchableDevice switchableDevice = new Lamp();
        Button button = new Button(true, switchableDevice);
        button.poll();


    }
}
