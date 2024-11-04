import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Author {
    String name;
    // Constructor, getters, and setters

    public String getName() {
        return name;
    }

    public Author(String name) {
        this.name = name;
    }
}

class Book {
    String title;
    List<Author> authors;
    // Constructor, getters, and setters

    public Book(String title, List<Author> authors) {
        this.title = title;
        this.authors = authors;
    }

    public List<Author> getAuthors() {
        return authors;
    }
}

public class FlatMapOperation extends StreamOperation{
    public FlatMapOperation() {
        super();
        this.name = "flatMap()";
    }

    @Override
    public void usageExamples() {
        super.usageExamples();
        System.out.println("\nTask 1");

        List<String> strings = Arrays.asList("hello", "world", "java", "streams");
        List<String> charactersList = strings.stream()
            .flatMap(s -> Arrays.stream(s.split("")))
            .toList();

        System.out.println(charactersList );

        System.out.println("\nTask 2");

        List<List<Integer>> lists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );

        List<Integer> integerList = lists.stream()
                .flatMap(List::stream)
                .toList();

        System.out.println(integerList);

        System.out.println("\nTask 3");

        List<Book> books = Arrays.asList(
                new Book("Book 1", Arrays.asList(new Author("Author 1"), new Author("Author 2"))),
                new Book("Book 2", Arrays.asList(new Author("Author 3"))),
                new Book("Book 3", Arrays.asList(new Author("Author 2"), new Author("Author 4")))
        );

        List<String> namesList = books.stream()
                .flatMap(book -> book.getAuthors().stream())
                .map(Author::getName)
                .toList();

        System.out.println(namesList);
    }


}
