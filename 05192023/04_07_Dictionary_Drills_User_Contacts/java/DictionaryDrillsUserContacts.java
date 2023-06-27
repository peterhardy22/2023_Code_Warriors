import java.util.HashMap;

public class DictionaryDrillsUserContacts {
    
    public static void main(String[] args) {
        Object[][] data = {{"Grae Drake", 98110}, 
                        {"Bethany Kok", null},
                        {"Alex Nusbacher", 94101},
                        {"Darrell SIlver", 11201}};
        userContacts(data);
    }

    public static HashMap<String, Object> userContacts(Object[][] data) {
        HashMap<String, Object> contactsMap = new HashMap<>(data.length, 2);
        
        for (Object[] row : data) {
            Object key = row[0];
            int value = Integer.parseInt(row[1]);
            contactsMap.put(key, value);
        }
    }
}
