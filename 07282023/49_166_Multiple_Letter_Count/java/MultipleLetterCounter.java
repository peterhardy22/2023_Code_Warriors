import java.util.LinkedHashMap;

public class MultipleLetterCounter {
    public static void main(String[] args) {
        LinkedHashMap<Character, Integer> answer = multipleLetterCount("awesome");
        System.out.println(toPythonDictionary(answer));
    }

    public static LinkedHashMap<Character, Integer> multipleLetterCount(String word) {
        LinkedHashMap<Character, Integer> letterCounter = new LinkedHashMap<>();
        
        for (int i = 0; i < word.length(); i++) {
            Character wordCharacter = word.charAt(i);

            if (letterCounter.containsKey(wordCharacter)) {
                Integer currentCount = letterCounter.get(wordCharacter);
                letterCounter.replace(wordCharacter, currentCount, (currentCount + 1));
            } else {
                letterCounter.put(wordCharacter, 1);
            }
        }

        return letterCounter;
    }

    public static String toPythonDictionary(LinkedHashMap<Character, Integer> LinkedHashMap) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");

        boolean isFirst = true;
        for (Character key : LinkedHashMap.keySet()) {
            if (!isFirst) {
                sb.append(", ");
            }
            sb.append("'").append(key).append("': ").append(LinkedHashMap.get(key));
            isFirst = false;
        }

        sb.append("}");
        return sb.toString();
    }
}
