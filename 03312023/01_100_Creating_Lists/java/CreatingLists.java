import java.util.Arrays;

public class CreatingLists {
    
    public static void main(String[] args) {
        // Define my_stuff 
        Object[] myStuff = {"something", "something else", "this", "that", 1, 2.0, 3.004};
        System.out.println(Arrays.toString(myStuff));

        // Define nums 
        int[] nums = new int[100];

        for (int index = 0; index < 100; index++) {
            nums[index] = index + 1;
        }
        System.out.println(Arrays.toString(nums));
    }

}
