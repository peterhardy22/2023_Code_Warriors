import java.util.ArrayList;
import java.util.List;


public class ListExerciseFour {
    public static void main(String[] args) {
        String word = "amazing";
        List<Character> wordListNoVowels = new ArrayList<>();

        for (char letter : word.toCharArray()) {
            if (!isVowel(letter)) {
                wordListNoVowels.add(letter);
            }
        }

    }

    private static boolean isVowel(char letter) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char vowel : vowels) {
            if (vowel == Character.toLowerCase(letter)) {
                return true;
            }
        }
        return false;
    }
}
