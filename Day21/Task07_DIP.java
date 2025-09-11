// DIP Violating Example

class LightBulb {
    void turnOn() {
        System.out.println("Light turned on");
    }

    void turnOff() {
        System.out.println("Light is off");
    }
}

class Switch {  // Switch class directly depends on the LightBulb class (DIP violation)
    LightBulb lbulbobj;

    Switch(LightBulb lbulbobj) {
        this.lbulbobj = lbulbobj;
    }

    void operate() {
        lbulbobj.turnOn();  // tightly coupled to LightBulb
    }

    public static void main(String[] args) {
        LightBulb lbulbobj = new LightBulb();
        Switch switchObj = new Switch(lbulbobj);
        switchObj.operate();
    }
}
