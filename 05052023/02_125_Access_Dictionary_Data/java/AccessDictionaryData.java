import java.util.HashMap;

public class AccessDictionaryData {
    public static void main(String[] args) {
        HashMap<String, String> artist = new HashMap<>();
        artist.put("first", "Neil");
        artist.put("last", "Young");

        String fullName = artist.get("first") + " " + artist.get("last");
        System.out.println(fullName);
    }
}