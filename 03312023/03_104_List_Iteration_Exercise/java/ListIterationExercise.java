
public class ListIterationExercise {
    
    public static void main(String[] args) {
        String[] sounds = {"super", "cali", "fragil", "istic", "expi", "ali", "docious"};
        String result = "";

        for (String string : sounds) {
            result += string.toUpperCase();
        }
        System.out.println(result);
    }

}
