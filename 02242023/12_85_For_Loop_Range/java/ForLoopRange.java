import java.util.*;

public class ForLoopRange {
    public static void main(String[] args) { 
        List<Integer> result = new ArrayList<>();
        for (int i = 10; i < 21; i++) {
            result.add(i);
        }
        int answer = 0; 
        
        for (int number = 0; number < result.size(); number++) { 
            if (number % 3 == 0) { 
                answer += number; 
            } 
        } 
        System.out.println(answer);
    }
}