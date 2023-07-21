import java.lang.StringBuilder;

public class FunctionsDebug {
    public static void main(String[] args) {
        int[] numbers = {8, 2, 5};
        String word = "Hello World";
        System.out.println(multi(numbers));
        System.out.println(add(numbers));
        System.out.println(reverse(word));
    }

    public static int multi(int[] numbersList) {
        if (numbersList.length == 0) {
            return 0;
        }
        int total = 1;
        for (int i = 0; i < numbersList.length; i++) {
            total  *= numbersList[i];
        }
        return total;
    }

    public static int add(int[] numbersList) {
        int total = 0;
        for (int num : numbersList) {
            total += num;
        }
        return total;
    }

    public static String reverse(String inputString) {
        return new StringBuilder(inputString).reverse().toString();
    }
}
