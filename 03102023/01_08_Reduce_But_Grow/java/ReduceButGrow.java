// https://www.codewars.com/kata/57f780909f7e8e3183000078
// Level 8 kyu

// Directions:
// Given a non-empty array of integers, return the result of multiplying the values together in order. Example:
// [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24

// Function
public class ReduceButGrow {

    public static void main(String[] args) {
        int[] integers = {1, 2, 3, 4};
        System.out.println(multiplyIntegers(integers));
    }

    public static int multiplyIntegers(int[] integers) {
        int answer = 1;
        for (int i : integers) {
            answer *= i;
        }
        return answer;
    }

}