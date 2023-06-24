import java.util.Arrays;

public class HeadTailInitLast {
    
    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5};
        System.out.println(head(test));
        System.out.println(tail(test));
        System.out.println(init(test));
        System.out.println(last(test));
    }

    public static int head(int[] array) {
        int theHead = array[0];
        return theHead;
    }

    public static String tail(int[] array) {
        int[] tailArray = new int[array.length - 1];
        for (int i = 1; i < array.length; i++) {
            tailArray[i - 1] = array[i];
        }
        return Arrays.toString(tailArray);
    }

    public static String init(int[] array) {
        int[] initArray = new int[array.length - 1];
        for (int i = 0; i < initArray.length; i++) {
            initArray[i] = array[i];
        }
        return Arrays.toString(initArray);
    }

    public static int last(int[] array) {
        int theLast = array[array.length - 1];
        return theLast;
    }
}
