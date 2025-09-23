import java.util.*;
import java.util.stream.Collectors;

public class StreamSortingExample {

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() { return name; }
        public int getAge() { return age; }

        @Override
        public String toString() {
            return name + "(" + age + ")";
        }
    }

    public static void main(String[] args) {
        // 1. Sorting simple list of Strings (natural order)
        List<String> names = Arrays.asList("Charlie", "bob", "Alice");
        List<String> sortedNames = names.stream()
                                        .sorted()
                                        .collect(Collectors.toList());
        System.out.println("Natural order: " + sortedNames);

        // 2. Sorting Strings in reverse order
        List<String> sortedReverse = names.stream()
                                          .sorted(Comparator.reverseOrder())
                                          .collect(Collectors.toList());
        System.out.println("Reverse order: " + sortedReverse);

        // 3. Sorting Strings ignoring case
        List<String> sortedIgnoreCase = names.stream()
                                             .sorted(String.CASE_INSENSITIVE_ORDER)
                                             .collect(Collectors.toList());
        System.out.println("Case-insensitive order: " + sortedIgnoreCase);

        // 4. Sorting custom objects by age
        List<Person> people = Arrays.asList(
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35),
            new Person("Bob", 20)
        );

        List<Person> sortedByAge = people.stream()
                                         .sorted(Comparator.comparing(Person::getAge))
                                         .collect(Collectors.toList());
        System.out.println("Sorted by age: " + sortedByAge);

        // 5. Sorting custom objects by name descending
        List<Person> sortedByNameDesc = people.stream()
                                             .sorted(Comparator.comparing(Person::getName).reversed())
                                             .collect(Collectors.toList());
        System.out.println("Sorted by name descending: " + sortedByNameDesc);

        // 6. Sorting by multiple criteria: age ascending, then name ascending
        List<Person> sortedByAgeThenName = people.stream()
                                                 .sorted(Comparator.comparing(Person::getAge)
                                                                   .thenComparing(Person::getName))
                                                 .collect(Collectors.toList());
        System.out.println("Sorted by age then name: " + sortedByAgeThenName);
    }
}
