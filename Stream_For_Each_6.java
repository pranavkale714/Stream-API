import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ForEachExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using forEach to print names
        names.forEach(System.out::println);
    }

    @Test
    public void allNamesStartWithCapitalLetter() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using forEach in JUnit test to check each name
        names.forEach(name -> assertTrue(Character.isUpperCase(name.charAt(0)),
                "Name should start with a capital letter: " + name));
    }
}
