// https://www.codewars.com/kata/57a0e5c372292dd76d000d7e
// Level 8kyu

// Directions
// Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated exactly n times.

// Examples (input -> output)
// 6, "I"     -> "IIIIII"
// 5, "Hello" -> "HelloHelloHelloHelloHello"

// Function & Test Cases
public class StringRepeat {
    public static void main(String[] args) {
        repeat(4, "a");
        repeat(3, "Hello");
        repeat(5, "");
        repeat(6, "kata");
    }

    public static String repeat (int repeat, String string) {
        return string.repeat(repeat);
    }
}
