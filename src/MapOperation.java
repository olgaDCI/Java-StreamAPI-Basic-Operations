import java.util.Arrays;
import java.util.List;

public class MapOperation extends StreamOperation{

   public MapOperation() {
        super();
        this.name = "map()";
      }

    @Override
    public void usageExamples(){
        super.usageExamples();

        System.out.println("\nTask 1");
        List<String> strings = Arrays.asList("hello", "world", "java", "streams");
        List<String> uppercaseStrings = strings
                .stream()
                .map(s -> s.toUpperCase() + " ").
                toList();

        System.out.println(uppercaseStrings);

        System.out.println("\nTask 2");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredNumbers = numbers
                .stream()
                .map(n -> n * n)
                .toList();

        System.out.println(squaredNumbers);

        System.out.println("\nTask 3");

        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35)
        );

        List<String> personStrings = people
                .stream().map(person -> "Name" + person.getName() + ", age:" + person.getAge())
                .toList();

        System.out.println(personStrings);
    }
}
