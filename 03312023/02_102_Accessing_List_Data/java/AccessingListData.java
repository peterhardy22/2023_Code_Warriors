import java.util.Arrays;

public class AccessingListData {
    
    public static void main(String[] args) {
        String[] people = {"Hanna", "Louisa", "Claudia", "Angela", "Geoffrey", "aparna"};
        System.out.println(Arrays.toString(people));
        // Change "Hanna" to "Hannah".
        people[0] = "Hannah";
        // Change "Geoffrey" to "Jeffrey".
        people[4] = "Jeffrey";
        // Change "aparna" to "Aparna" (capitalize it).
        people[people.length - 1] = "Aparna";
        System.out.println(Arrays.toString(people));
    }

}
