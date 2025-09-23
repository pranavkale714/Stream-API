import java.util.*;
import java.util.stream.Collectors;

public class Stream_Filter{
    public static void main(String[] args) {
        // Example 1: Filter names starting with "A"
        List<String> names = Arrays.asList("Alice", "Bob", "Anna", "David");
        List<String> namesStartingWithA = names.stream()
            .filter(name -> name.startsWith("A"))
            .collect(Collectors.toList());
        System.out.println("Names starting with A: " + namesStartingWithA); // [Alice, Anna]

        // Example 2: Filter even numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = numbers.stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers); // [2, 4, 6]

        // Example 3: Filter strings longer than 3 characters
        List<String> words = Arrays.asList("cat", "elephant", "dog", "bird");
        List<String> longWords = words.stream()
            .filter(word -> word.length() > 3)
            .collect(Collectors.toList());
        System.out.println("Words longer than 3 characters: " + longWords); // [elephant, bird]

        // Example 4: Filter out null values
        List<String> items = Arrays.asList("apple", null, "banana", null, "cherry");
        List<String> nonNullItems = items.stream()
            .filter(Objects::nonNull)
            .collect(Collectors.toList());
        System.out.println("Non-null items: " + nonNullItems); // [apple, banana, cherry]
    }
}
