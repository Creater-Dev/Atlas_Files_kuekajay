public class BridgePatternDemo {
    public static void main(String[] args) {
        RemoteControl tvRemote = new BasicRemote(new TV());
        tvRemote.turnOn();
        tvRemote.setVolume(10);
        tvRemote.turnOff();

        System.out.println("------------------");

        RemoteControl radioRemote = new BasicRemote(new Radio());
        radioRemote.turnOn();
        radioRemote.setVolume(5);
        radioRemote.turnOff();
    }
}
