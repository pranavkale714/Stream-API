import java.util.*;
import java.util.stream.*;

public class Stream_Skip_10 {
    public static void main(String[] args) {
        // Create a list of numbers
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70);

        System.out.println("Original List:");
        System.out.println(numbers);

        // Example 1: Skip the first 2 elements
        List<Integer> skippedList = numbers.stream()
                                           .skip(2)
                                           .collect(Collectors.toList());

        System.out.println("\nAfter skip(2):");
        System.out.println(skippedList);

        // Example 2: Skip more than the list size
        List<Integer> skipAll = numbers.stream()
                                       .skip(10)
                                       .collect(Collectors.toList());

        System.out.println("\nAfter skip(10) (more than size):");
        System.out.println(skipAll); // will print []

        // Example 3: Combine skip() with limit()
        List<Integer> skipAndLimit = numbers.stream()
                                            .skip(2)   // skip first 2
                                            .limit(3)  // take next 3
                                            .collect(Collectors.toList());

        System.out.println("\nAfter skip(2) and limit(3):");
        System.out.println(skipAndLimit);
    }
}
