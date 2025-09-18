import java.util.*;
import java.util.stream.*;

public class StreamExample {
    public static void main(String[] args) {
        // From a list
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Stream<String> stream = names.stream();

        // From an array
        int[] numbers = {1, 2, 3, 4};
        IntStream numStream = Arrays.stream(numbers);

        // From values
        Stream<String> stream2 = Stream.of("A", "B", "C");
    }
}
