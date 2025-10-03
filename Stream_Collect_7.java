import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Collect_7 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Bob", "Charlie", "David", "Eve", "Frank");

        // 1. Collect to List
        List<String> nameList = names.stream()
                .collect(Collectors.toList());
        System.out.println("List: " + nameList);

        // 2. Collect to Set
        Set<String> nameSet = names.stream()
                .collect(Collectors.toSet());
        System.out.println("Set: " + nameSet);

        // 3. Collect to Map (key = length, value = name)
        Map<Integer, String> nameMap = names.stream()
                .collect(Collectors.toMap(
                        String::length,
                        Function.identity(),
                        (existing, replacement) -> existing)); // handle duplicate keys
        System.out.println("Map: " + nameMap);

        // 4. Joining by ","
        String joined = names.stream()
                .collect(Collectors.joining(", "));
        System.out.println("Joined: " + joined);

        // 5. length
        long count = names.stream()
                .collect(Collectors.counting());
        System.out.println("Count: " + count);

        // 6. Sum of string lengths
        int totalLength = names.stream()
                .collect(Collectors.summingInt(String::length));
        System.out.println("Total Length: " + totalLength);

        // 7. Averaging string lengths
        double averageLength = names.stream()
                .collect(Collectors.averagingInt(String::length));
        System.out.println("Average Length: " + averageLength);

        // 8. Grouping by string length
        Map<Integer, List<String>> groupedByLength = names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("Grouped by Length: " + groupedByLength);

        // 9. Partitioning by length > 4
        Map<Boolean, List<String>> partitioned = names.stream()
                .collect(Collectors.partitioningBy(name -> name.length() > 4));
        System.out.println("Partitioned (length > 4): " + partitioned);

        // 10. Mapping names to their lengths into a List
        List<Integer> lengths = names.stream()
                .collect(Collectors.mapping(String::length, Collectors.toList()));
        System.out.println("Mapped Lengths: " + lengths);

        // 11. Reducing to the longest name
        Optional<String> longestName = names.stream()
                .collect(Collectors.reducing((s1, s2) -> s1.length() > s2.length() ? s1 : s2));
        System.out.println("Longest Name: " + longestName.orElse("None"));

        // 12. Custom Collector: Join names using StringJoiner
        String customJoined = names.stream().collect(
                Collector.of(
                        () -> new StringJoiner(" | "),
                        StringJoiner::add,
                        StringJoiner::merge,
                        StringJoiner::toString
                ));
        System.out.println("Custom Joined: " + customJoined);
    }
}
