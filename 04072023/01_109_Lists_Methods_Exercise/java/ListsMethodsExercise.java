import java.util.Arrays;

public class ListsMethodsExercise {
    
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

        // Remove the last value in the list.
        // Remove the first value in the list.
        // Add the string "Done" to the beginning of the list.
        String[] edittedInstructors = new String[2];
        edittedInstructors[0] = "Done";
        edittedInstructors[1] = instructors[1];
        System.out.println(Arrays.toString(edittedInstructors));
    }

}
