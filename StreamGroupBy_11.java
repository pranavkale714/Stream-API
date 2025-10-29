import java.util.*;

import java.util.stream.*;
 
public class StreamGroupBy {

    public static void main(String[] args) {
 
        // Sample list of names

        List<String> names = Arrays.asList(

            "Alice", "Bob", "Charlie", "David", "Alex", "Brian", "Daniel", "Catherine"

        );
 
        System.out.println("Original List:");

        System.out.println(names);
 
        // Example 1: Group names by their first letter

        Map<Character, List<String>> groupedByFirstLetter = names.stream()

                .collect(Collectors.groupingBy(name -> name.charAt(0)));
 
        System.out.println("\nGrouped by First Letter:");

        groupedByFirstLetter.forEach((letter, group) ->

                System.out.println(letter + " -> " + group));
 
        // Example 2: Group names by their length

        Map<Integer, List<String>> groupedByLength = names.stream()

                .collect(Collectors.groupingBy(String::length));
 
        System.out.println("\nGrouped by Length:");

        groupedByLength.forEach((length, group) ->

                System.out.println(length + " -> " + group));
 
        // Example 3: Group and count how many names per first letter

        Map<Character, Long> countByFirstLetter = names.stream()

                .collect(Collectors.groupingBy(name -> name.charAt(0), Collectors.counting()));
 
        System.out.println("\nCount of Names by First Letter:");

        countByFirstLetter.forEach((letter, count) ->

                System.out.println(letter + " -> " + count));

    }

}

 
