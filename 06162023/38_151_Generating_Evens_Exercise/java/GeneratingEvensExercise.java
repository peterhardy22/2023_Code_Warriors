import java.util.ArrayList;

public class GeneratingEvensExercise {
    public static void main(String[] args) {
        int upperLimit = 50;
        ArrayList<Integer> evenNumbers = generateEvens(upperLimit);

        for (int number : evenNumbers) {
            System.out.println(number);
        }
    }

    public static ArrayList<Integer> generateEvens(int upperLimit) {
        ArrayList<Integer> numbers = new ArrayList<>();
    
        for (int i = 1; i < upperLimit; i++) {
            if (i % 2 == 0) {
                numbers.add(i);
            }
        }
    
        return numbers;
    }
}
