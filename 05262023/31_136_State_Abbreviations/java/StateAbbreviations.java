import java.util.LinkedHashMap;
import java.util.Map;

public class StateAbbreviations {
    public static void main(String[] args) {
        String[] list1 = {"CA", "NJ", "RI"};
        String[] list2 = {"California", "New Jersey", "Rhode Island"};

        Zipper(list1, list2);
    }

    public static void Zipper(String[] list1, String[] list2) {
        LinkedHashMap<String, String> statesMap = new LinkedHashMap<>();

        for (int index = 0; index < list1.length; index++) {
            String key = (String) list1[index];
            String value = (String) list2[index];
            statesMap.put(key, value);
        }

        for (Map.Entry<String, String> entry : statesMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
