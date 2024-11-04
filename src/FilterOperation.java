import java.util.Arrays;
import java.util.List;

public class FilterOperation extends StreamOperation{

    class Person {
        String name;
        int age;
        String gender;
        // Constructor, getters, and setters

        public Person(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getGender() {
            return gender;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "{Person name='" + name + "', age=" + age + ", gender='" + gender + '}';
        }
    }

    public FilterOperation() {
        super();
        this.name = "filter()";
    }

    @Override
    public void usageExamples() {
        super.usageExamples();

        System.out.println("\nTask 1");

        List<Integer> numbers = Arrays.asList(1, -2, 3, -4, 5, -6, 7, -8, 9, -10);
        List<Integer> positiveNumbers = numbers.stream()
                .filter(n -> n > 0)
        .toList();

        System.out.println(positiveNumbers);

        System.out.println("\nTask 2");

        List<String> strings = Arrays.asList("hello", "world", "java", "streams", "lambda", "functional");
        List<String> longStrings = strings.stream()
                .filter(str -> str.length() > 5)
                .toList();

        System.out.println(longStrings);

        System.out.println("\nTask 3");

        List<Person> people = Arrays.asList(
                new Person("Alice", 25, "Female"),
                new Person("Bob", 17, "Male"),
                new Person("Charlie", 35, "Male"),
                new Person("Eve", 20, "Female")
        );

        List<Person> adultFemales = people.stream()
                .filter(p -> p.getAge() >= 18 && p.getGender().equals("Female"))
                .toList();

        System.out.println(adultFemales);

    }
}
