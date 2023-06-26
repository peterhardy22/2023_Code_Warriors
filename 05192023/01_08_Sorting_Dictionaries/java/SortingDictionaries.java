import java.util.HashMap;
import java.util.Map;

public class SortingDictionaries {
    
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(3, 1);
        hashMap.put(2, 2);
        hashMap.put(1, 3);

        System.out.println(hashMap);
        HashMapToTwoDArray(hashMap);
    }

    public static void HashMapToTwoDArray(HashMap<Integer, Integer> dict) {
        int[][] array = new int[dict.size()][2];

        int rowIndex = 0;
        for (Map.Entry<Integer, Integer> entry : dict.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            array[rowIndex][0] = key.hashCode();
            array[rowIndex][1] = value;

            rowIndex++;
        }
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
