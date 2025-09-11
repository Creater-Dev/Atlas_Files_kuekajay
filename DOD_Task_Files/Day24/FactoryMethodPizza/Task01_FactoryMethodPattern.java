public class Task01_FactoryMethodPattern {
    public static void main(String[] args) {
        PizzaFactory factory;

        // Create Cheezy Pizza
        factory = new CheezyPizzaFactory();
        Pizza cheezyPizza = factory.createPizza();
        cheezyPizza.prepare();
        cheezyPizza.bake();
        cheezyPizza.cut();
        cheezyPizza.box();

        System.out.println("-------------");

        // Create Pepperoni Pizza
        factory = new PepperoniPizzaFactory();
        Pizza pepperoniPizza = factory.createPizza();
        pepperoniPizza.prepare();
        pepperoniPizza.bake();
        pepperoniPizza.cut();
        pepperoniPizza.box();
    }
}