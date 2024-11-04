import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    String name;
    int age;
    double salary;
    // Constructor, getters, and setters

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{Employee name='" + name + ", salary=" + salary +
                '}';
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}

public class SortedOperation extends StreamOperation{
    public SortedOperation() {
        super();
        this.name = "sorted()";
    }

    @Override
    public void usageExamples() {
        super.usageExamples();

        System.out.println("\nTask 1");

        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 7);
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .toList();
        System.out.println(sortedNumbers);

        System.out.println("\nTask 2");

        List<String> strings = Arrays.asList("hello", "World", "java", "Streams", "Apple");
        List<String> sortedStrings = strings.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .toList();

        System.out.println(sortedStrings);

        System.out.println("\nTask 3");

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 25, 50000),
                new Employee("Bob", 30, 60000),
                new Employee("Charlie", 35, 55000)
        );

        List<Employee> sortedEmployees = employees.stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .toList();

        System.out.println(sortedEmployees);

    }
}
