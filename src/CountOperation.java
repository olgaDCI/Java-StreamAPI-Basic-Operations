import java.util.Arrays;
import java.util.List;



public class CountOperation extends StreamOperation{

    class Book {
        String title;
        String author;
        int pages;
        // Constructor, getters, and setters

        public Book(String title, String author, int pages) {
            this.title = title;
            this.author = author;
            this.pages = pages;
        }

        public int getPages() {
            return pages;
        }
    }
    public CountOperation() {
        super();
        this.name = "count()";
    }

    @Override
    public void usageExamples() {
        super.usageExamples();

        System.out.println("\nTask 1");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        long evenCount = numbers.stream()
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println("Even numbers count: " + evenCount);

        System.out.println("\nTask 2");

        List<String> strings = Arrays.asList("hello", "world", "java", "apple", "streams", "ink");
        long vowelsCount = strings.stream()
                .filter(str -> str.matches("^[aeiou].*"))
                .count();

        System.out.println("Vowels count: " + vowelsCount);

        System.out.println("\nTask 3");

        List<Book> books = Arrays.asList(
                new Book("Book 1", "Author 1", 300),
                new Book("Book 2", "Author 2", 600),
                new Book("Book 3", "Author 3", 450),
                new Book("Book 4", "Author 4", 550)
        );

        long booksCount = books.stream()
                .filter(book -> book.getPages() > 500)
                .count();

        System.out.println("Books with more than 500 pages count: " + booksCount);
    }
}
