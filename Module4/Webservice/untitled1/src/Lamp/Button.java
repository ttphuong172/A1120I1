package Lamp;

public class Button {
    private boolean isSwitchOn;
    private SwitchableDevice switchableDevice;

    public void poll() {
        if (isSwitchOn) {
            switchableDevice.turnOn();
        } else {
            switchableDevice.turnOff();
        }
    }

    public Button(boolean isSwitchOn, SwitchableDevice switchableDevice) {
        this.isSwitchOn = isSwitchOn;
        this.switchableDevice = switchableDevice;
    }
}
