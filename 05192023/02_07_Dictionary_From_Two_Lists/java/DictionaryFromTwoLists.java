import java.util.HashMap;

public class DictionaryFromTwoLists {
    public static void main(String[] args) {
        char[] keys = {'a', 'b', 'c', 'd'};
        int[] values = {1, 2, 3};
        ArraysToDict(keys, values);
    }

    public static void ArraysToDict(char[] keys, int[] values) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < keys.length; i++) {
            if (i < values.length) {
                hashMap.put(keys[i], values[i]);
            } else {
                hashMap.put(keys[i], null);
            }
        }

        for (HashMap.Entry<Character, Integer> entry : hashMap.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}
