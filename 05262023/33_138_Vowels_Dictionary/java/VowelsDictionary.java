import java.util.LinkedHashMap;
import java.util.Map;

public class VowelsDictionary {
    public static void main(String[] args) {
        char[] list = {'a', 'e', 'i', 'o', 'u'};

        vowelDictMaker(list);
    }

    public static void vowelDictMaker(char[] vowelsList) {
        LinkedHashMap<Character, Integer> objectsMap = new LinkedHashMap<>();

        for (int index = 0; index < vowelsList.length; index++) {
            char key = (char) vowelsList[index];
            int value = (int) 0;
            objectsMap.put(key, value);
        }

        for (Map.Entry<Character, Integer> entry : objectsMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

