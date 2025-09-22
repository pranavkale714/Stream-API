import java.util.*;
import java.util.stream.Collectors;

public class MapExamples {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // 1. Convert names to uppercase
        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Uppercase: " + upperNames); // [ALICE, BOB, CHARLIE, DAVID]

        // 2. Get length of each name
        List<Integer> nameLengths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("Lengths: " + nameLengths); // [5, 3, 7, 5]

        // 3. Append " - user" to each name
        List<String> userLabels = names.stream()
                .map(name -> name + " - user")
                .collect(Collectors.toList());
        System.out.println("Labeled: " + userLabels); // [Alice - user, Bob - user, ...]

        // 4. Convert to initials (e.g., "Alice" -> "A.")
        List<String> initials = names.stream()
                .map(name -> name.charAt(0) + ".")
                .collect(Collectors.toList());
        System.out.println("Initials: " + initials); // [A., B., C., D.]

        // 5. Create custom objects from names
        List<User> users = names.stream()
                .map(User::new)
                .collect(Collectors.toList());
        System.out.println("User Objects: " + users);

        // 6. Chain multiple map operations
        List<String> reversedUpper = names.stream()
                .map(String::toUpperCase)
                .map(name -> new StringBuilder(name).reverse().toString())
                .collect(Collectors.toList());
        System.out.println("Reversed Uppercase: " + reversedUpper); // [ECILA, BOB, ...]

    }
}
