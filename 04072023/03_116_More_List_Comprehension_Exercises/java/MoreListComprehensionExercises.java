import java.util.List;
import java.util.stream.Collectors;

public class MoreListComprehensionExercises {
 
    public static void main(String[] args) {
        // Original list
        List<Integer> numbers = List.of(1, 2, 3, 4);
        List<Integer> numbersCompared = List.of(3, 4, 5, 6);
        String numbersArray = numbers.toString();
        System.out.println(numbersArray);

        // Create a new list using Java Stream API and lambda expression
        List<Integer> newList = numbers.stream()
                .filter(numbersCompared::contains)
                .collect(Collectors.toList());

        System.out.println(newList);

        
        List<String> names = List.of("Elie", "Tim", "Matt");
        String namesArray = names.toString();
        System.out.println(namesArray);

        List<String> newNamesList = names.stream()
                .map(name -> new StringBuilder(name).reverse().toString().toLowerCase())
                .collect(Collectors.toList());
        
        System.out.println(newNamesList);
    }
    
}
