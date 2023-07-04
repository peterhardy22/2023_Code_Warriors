import java.util.LinkedHashMap;
import java.util.Map;

public class ASCIICodesDictionary {
    public static void main(String[] args) {
        int[] numbers = makeASCIINumbers(args);
        Character[] alphabet = makeAlphabet(args);

        asciiZipper(numbers, alphabet);
    }

    public static void asciiZipper(int[] numbers, Character[] alphabet) {
        LinkedHashMap<Integer, Character> asciiMap = new LinkedHashMap<>();

        for (int index = 0; index < numbers.length; index++) {
            Integer key = (int) numbers[index];
            Character value = (char) alphabet[index];
            asciiMap.put(key, value);
        }

        for (Map.Entry<Integer, Character> entry : asciiMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Character[] makeAlphabet(String[] args) {
        Character[] alphabet = new Character[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        return alphabet;
    }

    public static int[] makeASCIINumbers(String[] args) {
        int[] numbers = new int[26];
        for (int i = 0; i < 26; i++) {
            numbers[i] = 65 + i;
        }
        return numbers;
    }
}
