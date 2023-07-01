import java.util.HashMap;
import java.util.Map;

public class DictionaryDrillsUserContacts {
    
    public static void main(String[] args) {
        Object[][] data = {{"Grae Drake", 98110}, 
                        {"Bethany Kok", null},
                        {"Alex Nusbacher", 94101},
                        {"Darrell SIlver", 11201}};
        userContacts(data);
    }

    public static void userContacts(Object[][] data) {
        Map<String, Integer> contactsMap = new HashMap<>();
        
        for (Object[] row : data) {
            String key = (String) row[0];
            Integer value = (Integer) row[1];
            contactsMap.put(key, value);
        }

        for (Map.Entry<String, Integer> entry : contactsMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
