import java.util.Arrays;

public class ListExerciseFive {
    
    public static void main(String[] args) {
        int[][] answer = listOfLists(3, 3);
        System.out.println(Arrays.deepToString(answer));
    }

    public static int[][] listOfLists(int rows, int columns) {
        int[][] list = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                list[i][j] = j;
            }
        }
        return list;
    }
}
