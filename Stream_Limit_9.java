import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_Limit_8 {
    public static void main(String[] args) {

        // 1. limit() on basic list
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60);
        List<Integer> limitedNumbers = numbers.stream()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("1. First 3 Numbers: " + limitedNumbers);

        // 2. limit() with sorted()
        List<Integer> sortedLimited = numbers.stream()
                .sorted()
                .limit(4)
                .collect(Collectors.toList());
        System.out.println("2. First 4 after sorting: " + sortedLimited);

        // 3. limit() with skip()
        List<Integer> skippedLimited = numbers.stream()
                .skip(2)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("3. Skip 2, then take 3: " + skippedLimited);

        // 4. limit() on infinite stream
        List<Integer> evenNumbers = Stream.iterate(2, n -> n + 2)
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("4. First 5 even numbers (infinite stream): " + evenNumbers);

        // 5. limit() with filter()
        List<Integer> filteredLimited = numbers.stream()
                .filter(n -> n > 25)
                .limit(2)
                .collect(Collectors.toList());
        System.out.println("5. First 2 numbers > 25: " + filteredLimited);

        // 6. limit() on strings
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        List<String> firstTwoNames = names.stream()
                .limit(2)
                .collect(Collectors.toList());
        System.out.println("6. First 2 names: " + firstTwoNames);

        // 7. limit() with map()
        List<String> upperLimited = names.stream()
                .map(String::toUpperCase)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("7. First 3 names in uppercase: " + upperLimited);

        // 8. limit() with random numbers
        List<Double> randoms = Stream.generate(Math::random)
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("8. 5 Random numbers: " + randoms);

        // 9. limit() and collect to set
        Set<Integer> limitedSet = IntStream.range(1, 10)
                .limit(5)
                .boxed()
                .collect(Collectors.toSet());
        System.out.println("9. Limit to 5 (Set): " + limitedSet);

        // 10. limit() with distinct()
        List<Integer> mixedNumbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6);
        List<Integer> limitedDistinct = mixedNumbers.stream()
                .distinct()
                .limit(4)
                .collect(Collectors.toList());
        System.out.println("10. First 4 distinct numbers: " + limitedDistinct);
    }
}
