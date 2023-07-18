import java.util.*;

public class SwapItemsInADictionary {
    public static Map<String, List<String>> switchDictionary(Map<String, String> beforeDict) {
        Map<String, List<String>> afterDict = new HashMap<>();

        for (Map.Entry<String, String> entry : beforeDict.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            if (!afterDict.containsKey(value)) {
                afterDict.put(value, new ArrayList<>());
            }
            afterDict.get(value).add(key);
        }

        return afterDict;
    }

    public static void main(String[] args) {
        // Test the function
        Map<String, String> beforeDict = new HashMap<>();
        beforeDict.put("Ice", "Cream");
        beforeDict.put("Age", "21");
        beforeDict.put("Light", "Cream");
        beforeDict.put("Double", "Cream");

        Map<String, List<String>> afterDict = switchDictionary(beforeDict);
        System.out.println(afterDict);
    }
}
