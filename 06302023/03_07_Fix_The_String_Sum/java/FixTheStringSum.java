public class FixTheStringSum {
    public static void main(String[] args) {
        System.out.println(add("aa", "bb"));
    }

    public static int add(String stringOne, String stringTwo) {
        int stringOneSum = 0;
        int stringTwoSum = 0;

        for (int i = 0; i < stringOne.length(); i++) {
            stringOneSum += (int) stringOne.charAt(i);
        }
        for (int i = 0; i < stringTwo.length(); i++) {
            stringTwoSum += (int) stringTwo.charAt(i);
        }
        return stringOneSum + stringTwoSum;
    }
}
