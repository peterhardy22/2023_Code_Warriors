import java.util.Arrays;

public class ListsBasicsExercise {
    
    public static void main(String[] args) {
        // Initially create an empty list called instructors
        String[] instructors = new String[3];

        // Add the following strings to the instructors list 
            // "Colt"
            // "Blue"
            // "Lisa"
        instructors[0] = "Colt";
        instructors[1] = "Blue";
        instructors[2] = "Lisa";
        System.out.println(Arrays.toString(instructors));
    }

}
