public class Leaf implements Component {
    private String brand;

    public Leaf(String brand) {
        this.brand = brand;
    }

    @Override
    public void brandName() {
        System.out.println("Brand: " + brand);
    }
}
