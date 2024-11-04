import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctOperation extends StreamOperation{
    public DistinctOperation() {
        super();
        this.name = "distinct()";
    }

    @Override
    public void usageExamples(){
        super.usageExamples();

        System.out.println("\nTask 1");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 1, 5);
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctNumbers);

        System.out.println("\nTask 2");

        List<String> strings = Arrays.asList("hello", "WORLD", "java", "HELLO", "streams");
        List<String> distinctStrings = strings.stream()
                .map(String::toLowerCase)
                .distinct()
                .toList();

        System.out.println(distinctStrings);

        System.out.println("\nTask 3");

        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35),
                new Person("Alice", 25)
        );

        List<Person> distinctPeople = people.stream()
                .distinct()
                .toList();

        System.out.println(distinctPeople);

    }
}
