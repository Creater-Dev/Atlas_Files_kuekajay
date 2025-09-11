public class PrototypeMethodDemo {
    public static void main(String[] args) {
        CloneOfHuman.loadCache();

        HumanBeing cloned1 = CloneOfHuman.getSize("1");
        System.out.println("Name: " + cloned1.getName() + ", Type: " + cloned1.getType());
        cloned1.walk();
        cloned1.see();
        cloned1.talk();

        HumanBeing cloned2 = CloneOfHuman.getSize("2");
        System.out.println("Name: " + cloned2.getName() + ", Type: " + cloned2.getType());
        cloned2.walk();
        cloned2.see();
        cloned2.talk();

        HumanBeing cloned3 = CloneOfHuman.getSize("3");
        System.out.println("Name: " + cloned3.getName() + ", Type: " + cloned3.getType());
        cloned3.walk();
        cloned3.see();
        cloned3.talk();
    }
}