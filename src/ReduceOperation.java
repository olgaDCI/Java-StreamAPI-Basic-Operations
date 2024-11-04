import java.util.Arrays;
import java.util.List;

public class ReduceOperation extends StreamOperation{

    class Product {
        String name;
        double price;
        // Constructor, getters, and setters

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }


    public ReduceOperation() {
        super();
        this.name = "reduce()";
    }

    @Override
    public void usageExamples() {
        super.usageExamples();

        System.out.println("\nTask 1");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers
                .stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum of numbers: " + sum);

        System.out.println("\nTask 2");

        List<String> strings = Arrays.asList("hello", "world", "java", "streams");

        String concatString = strings
                .stream()
                .reduce("", (a, b) -> a + b);

        System.out.println("Concatenated string: " + concatString);

        System.out.println("\nTask 3");

        List<Product> products = Arrays.asList(
                new Product("Product 1", 10.99),
                new Product("Product 2", 15.49),
                new Product("Product 3", 7.99)
        );

        double totalCost = products.stream()
                .map(Product::getPrice)
                .reduce(0.0, Double::sum);

        System.out.println("Total cost of all products: " + totalCost);

    }
}
