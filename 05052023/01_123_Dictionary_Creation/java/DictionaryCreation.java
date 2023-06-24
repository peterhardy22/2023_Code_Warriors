import java.util.HashMap;

public class DictionaryCreation {
    
    public static void main(String[] args) {
        HashMap<String, Object> userInfo = new HashMap<>();
        userInfo.put("name", "Peter");
        userInfo.put("height", 70);
        userInfo.put("eyeColor", "blue");

        System.out.println(userInfo);
    }
    
}
