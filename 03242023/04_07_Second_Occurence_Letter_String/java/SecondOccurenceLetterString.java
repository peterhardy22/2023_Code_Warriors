// https://www.codewars.com/kata/63f96036b15a210058300ca9
// Level 7 kyu

// Directions:
// In this kata, you need to write a function that takes a string and a letter as input, 
// then returns the index of the second occurrence of that letter in the string. 
// If there is no such letter in the string, then the function should return -1. 
// If the letter occurs only once in the string, then -1 should also be returned.

// Examples:
// second_symbol('Hello world!!!','l') --> 3
// second_symbol('Hello world!!!', 'A') --> -1

// Function
public class SecondOccurenceLetterString {

    public static void main(String[] args) {
        System.out.println(secondOccurence("Mississippi", 'i'));
    }

    public static int secondOccurence(String word, char letter) {
        if (word.indexOf(letter) == -1) {
            return -1;
        }
        
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

}