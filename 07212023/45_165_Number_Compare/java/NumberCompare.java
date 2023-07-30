public class NumberCompare {
    public static void main(String[] args) {
        System.out.println(numberCompare(1, 1));
        System.out.println(numberCompare(1, 0));
        System.out.println(numberCompare(2, 4));
    }

    public static String numberCompare(int a, int b) {
        if (a == b) {
            return "Numbers are equal";
        } else if (a > b) {
            return "First is greater";
        }

        return "Second is greater";
    }
}
