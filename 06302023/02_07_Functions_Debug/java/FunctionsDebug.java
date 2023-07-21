
public class FunctionsDebug {
    public static void main(String[] args) {
        int[] numbers = {8, 2, 5};
        System.out.println(multi(numbers));
        System.out.println(add(numbers));
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
}
