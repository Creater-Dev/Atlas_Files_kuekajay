public class HomeTask01_ViolatingSRP {
    public static void main(String[] args) {
        BookDetails book = new BookDetails("Clean Code", "Kadiyala Ajay Kumar", 15500.0);

        BookFormatter formatter = new BookFormatter();
        PriceCalculator calculator = new PriceCalculator();

        System.out.println(formatter.formatTitle(book.getTitle()));
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Original Price: " + book.getPrice());

        double discountedPrice = calculator.calculateDiscountedPrice(book.getPrice(), 0.10);
        System.out.println("Discounted Price: " + discountedPrice);
    }
}

class BookDetails {
    private String title;
    private String author;
    private double price;

    public BookDetails(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}

class BookFormatter {
    public String formatTitle(String title) {
        return "Title: " + title.toUpperCase();
    }
}

class PriceCalculator {
    public double calculateDiscountedPrice(double originalPrice, double discountPercentage) {
        return originalPrice * (1 - discountPercentage);
    }
}