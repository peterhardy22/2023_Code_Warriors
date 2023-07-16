public class YellFunctionExercise {
    public static void main(String[] args) {
        String phrase = "go away";
        System.out.println(yell(phrase));

    }

    public static String yell(String phrase) {
        return phrase.toUpperCase() + "!";
    }
}
