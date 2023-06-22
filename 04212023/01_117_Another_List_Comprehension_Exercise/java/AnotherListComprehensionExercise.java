import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class AnotherListComprehensionExercise {

    public static void main(String[] args) {
        List<Integer> numbersList = IntStream.rangeClosed(1, 100)
                    .filter(number -> number % 12 == 0)
                    .boxed()
                    .collect(Collectors.toList());
        
        System.out.println(numbersList.toString());
    }
    

}
