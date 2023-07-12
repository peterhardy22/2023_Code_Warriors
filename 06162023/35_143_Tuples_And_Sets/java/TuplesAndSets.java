import java.util.Arrays;

public class TuplesAndSets {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4};
        System.out.println(Arrays.toString(array));
        Tuple<Integer> tuple = Tuple.arrayToTuple(array);
        
        Integer[] elements = tuple.getElements();
        for (Integer element : elements) {
            System.out.print(element);
        }
    }
}