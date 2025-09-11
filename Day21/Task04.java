import java.util.*;

class Animal {
    void sound() {
        System.out.println(" sounds of different animals");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println(" Meow is the sound of cat");
    }
}

class Task04 {
    // Lower-bounded wildcard method: can add Cat or subclass into list of Cat or superclass
    static void addAcat(List<? super Cat> cats) {
        cats.add(new Cat());
    }

    public static void main(String[] args) {
        Animal obj = new Cat();
        obj.sound(); // Meow is the sound of cat

        // Use lower bounded wildcard with Animal list
        List<Animal> animals = new ArrayList<>();
        addAcat(animals); // Adds Cat to animals list

        // Verify contents
        for (Animal animal : animals) {
            animal.sound();  // Meow is the sound of cat
        }
    }
}
