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

class Task02 {
    // Utility method to print any list
    static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Animal obj = new Cat();
        obj.sound(); // Meow is the sound of cat

        List<Cat> clist = new ArrayList<>();
        clist.add(new Cat());

        printList(clist); // Will print something like: Cat@15db9742
    }
}
