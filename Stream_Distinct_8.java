import java.util.*; 
import java.util.function.Function; 
import java.util.stream.Collector; 
import java.util.stream.Collectors; 
import java.util.stream.Stream; 

public class Stream_Distinct_8 {
public static void main(String[] args) {

        // 1. distinct() on basic types
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 4, 5);
        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("1. Unique Numbers: " + uniqueNumbers);

        // 2. distinct() on custom objects (equals/hashCode)
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Alice", 30),  // duplicate
                new Person("Bob", 26),    // same name, different age
                new Person("Charlie", 35)
        );
        List<Person> uniquePeople = people.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("2. Unique People (by object): " + uniquePeople);

        // 3. distinct by field (e.g., name only)
        List<Person> uniqueByName = people.stream()
                .filter(distinctByKey(Person::getName))
                .collect(Collectors.toList());
        System.out.println("3. Unique People (by name): " + uniqueByName);

        // 4. distinct() after map()
        List<String> names = Arrays.asList("Anna", "Bob", "Anna", "Charlie", "Bob");
        List<String> upperUnique = names.stream()
                .map(String::toUpperCase)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("4. Uppercase Distinct Names: " + upperUnique);

        // 5. distinct() with filter()
        List<String> filteredUnique = names.stream()
                .filter(name -> name.length() > 3)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("5. Filtered & Distinct (length > 3): " + filteredUnique);

        // 6. distinct() with sorted()
        List<String> sortedDistinct = names.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("6. Sorted Distinct Names: " + sortedDistinct);

        // 7. Custom distinct using TreeSet (by field)
        List<Person> uniqueByTreeSet = people.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Person::getName))),
                        ArrayList::new));
        System.out.println("7. Distinct People (TreeSet by name): " + uniqueByTreeSet);

        // 8. distinct() with limit() and skip()
        List<String> limitedDistinct = names.stream()
                .distinct()
                .skip(1)
                .limit(2)
                .collect(Collectors.toList());
        System.out.println("8. Distinct with skip(1) & limit(2): " + limitedDistinct);
    }
}
