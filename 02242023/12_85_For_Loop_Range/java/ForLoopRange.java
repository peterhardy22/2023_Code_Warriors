import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ForLoopRange {
    public static void main(String[] args) { 
        List[] numbers = IntStream.rangeClosed(10, 20).boxed().collect(Collectors.toList()); 
        int answer = 0; 
        
        for (int number = 0; number < numbers.length; number++) { 
            if (number % 3 == 0) { 
                answer += number; 
            } 
        } 
        System.out.println(answer); 
    }
}