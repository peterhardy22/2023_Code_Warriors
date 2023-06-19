import java.util.List;
import java.util.stream.Collectors;

public class ListComprehensionExercises {

    public static void main(String[] args) {
        // Original list
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        String numbersArray = numbers.toString();
        System.out.println(numbersArray);

        // Create a new list using Java Stream API and lambda expression
        List<Integer> newList = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(newList);
    }
}