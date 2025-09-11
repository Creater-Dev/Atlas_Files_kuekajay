import java.util.*;

// Base class
class Animal {
    void sound() {
        System.out.println("sounds of different animals");
    }
}

// Derived class
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow is the sound of cat");
    }
}

public class Task03 {

    // Method that accepts List of Animal or any of its subclasses
    public static void animalSound(List<? extends Animal> animalList) {
        for (Animal element : animalList) {
            element.sound();
        }
    }

    public static void main(String[] args) {
        // Create list of Cats
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());

        // Call method with upper bounded wildcard
        animalSound(cats);  // Output: Meow is the sound of cat
    }
}
