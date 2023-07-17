
public class FixThisFunction {
    public static void main(String[] args) {
        String saying = "$uper $ize"; //2
        System.out.println(countDollarSigns(saying));
    }

    public static int countDollarSigns(String word) {
        int counter = 0;

        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            if (character == '$') {
                counter+=1;
            }
        }

        return counter;
    }
}
