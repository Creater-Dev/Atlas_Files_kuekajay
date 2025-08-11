public class Mobile implements Gadget {
    private int storage;
    private int memory;

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public void showSpecs() {
        System.out.println("Mobile Specifications:");
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Memory: " + memory + " GB");
    }
}