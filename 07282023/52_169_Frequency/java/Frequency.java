import java.util.List;

public class Frequency {
    
    public static void main(String[] args) {
        List<Object> firstCollection = List.of(1, 2, 3, 4, 4, 4);
        int firstValue = 4;
        System.out.println(frequency(firstCollection, firstValue));

        List<Object> secondCollection = List.of(true, false, true, true);
        boolean secondValue = false;
        System.out.println(frequency(secondCollection, secondValue));
    }

    public static <T> int frequency(List<T> collection, T value) {
        int count = 0;
        for (T element : collection) {
            if (element.equals(value)) {
                count++;
            }
        }
        return count;
    }

}
