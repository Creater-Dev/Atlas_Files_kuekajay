public class Main {
    public static void main(String[] args) {
        // Leaf objects
        Leaf leaf1 = new Leaf("Sony");
        Leaf leaf2 = new Leaf("Samsung");
        Leaf leaf3 = new Leaf("LG");

        // Composite group 1
        Composite electronicsGroup = new Composite("Electronics Brands");
        electronicsGroup.add(leaf1);
        electronicsGroup.add(leaf2);

        // Composite group 2
        Composite homeApplianceGroup = new Composite("Home Appliance Brands");
        homeApplianceGroup.add(leaf3);

        // Master Composite
        Composite allBrands = new Composite("All Brands");
        allBrands.add(electronicsGroup);
        allBrands.add(homeApplianceGroup);

        // Call the method on master composite
        allBrands.brandName();
    }
}
