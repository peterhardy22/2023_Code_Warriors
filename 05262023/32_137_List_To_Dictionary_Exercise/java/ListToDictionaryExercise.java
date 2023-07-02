import java.util.LinkedHashMap;
import java.util.Map;

public class ListToDictionaryExercise {
    public static void main(String[] args) {
        Object[][] list = new Object[3][2];
        
        list[0][0] = "name";
        list[0][1] = "Jared";
        list[1][0] = "job";
        list[1][1] = "Musician";
        list[2][0] = "city";
        list[2][1] = "Bern";

        Zipper(list);
    }

    public static void Zipper(Object[][] list) {
        LinkedHashMap<Object, Object> objectsMap = new LinkedHashMap<>();

        for (int index = 0; index < list.length; index++) {
            Object key = (Object) list[index][0];
            Object value = (Object) list[index][1];
            objectsMap.put(key, value);
        }

        for (Map.Entry<Object, Object> entry : objectsMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

