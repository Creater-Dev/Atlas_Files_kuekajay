// DIP Implementation Example

interface SwitchOnOff {
    void turnOn();
    void turnOff();
}

// LightBulb implements abstraction, not tied directly to Switch
class LEDLight implements SwitchOnOff {
    public void turnOn() {
        System.out.println("Light turned on");
    }

    public void turnOff() {
        System.out.println("Light is off");
    }
}

// Future devices can also implement SwitchOnOff without changing Switch class
class Fan implements SwitchOnOff {
    public void turnOn() {
        System.out.println("Fan started spinning");
    }

    public void turnOff() {
        System.out.println("Fan stopped");
    }
}

// Switch depends on abstraction, not on concrete class
class DeviceSwitch {
    private SwitchOnOff device;

    DeviceSwitch(SwitchOnOff device) { // constructor, not void method
        this.device = device;
    }

    void operate() {
        device.turnOn();
    }
}

public class Task08 {
    public static void main(String[] args) {
        // Using LightBulb
        SwitchOnOff bulb = new LEDLight();
        DeviceSwitch lightSwitch = new DeviceSwitch(bulb);
        lightSwitch.operate();

        // Using Fan (no modification in Switch class)
        SwitchOnOff fan = new Fan();
        DeviceSwitch fanSwitch = new DeviceSwitch(fan);
        fanSwitch.operate();
    }
}
