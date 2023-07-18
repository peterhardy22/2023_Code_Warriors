public class DefaultParameterExercise {
    public static void main(String[] args) {
        System.out.println(speak("pig"));
        System.out.println(speak("duck"));
        System.out.println(speak("cat"));
        System.out.println(speak("boobear"));
    }

    public static String speak(String animal) {
        if (animal == "pig") {
            return "oink";
        } else if (animal == "duck") {
            return "quack";
        } else if (animal == "cat") {
            return "meow";
        } else {
            return "?";
        }
    }
}
