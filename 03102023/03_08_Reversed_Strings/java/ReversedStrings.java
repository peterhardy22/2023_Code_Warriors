// https://www.codewars.com/kata/5168bb5dfe9a00b126000018
// Level 8 kyu

// Directions:
// Complete the solution so that it reverses the string passed into it.
// 'world'  =>  'dlrow'
// 'word'   =>  'drow'

// Function
public class ReversedStrings {
    
    public static void main(String[] args) {
        
        System.out.println(stringReverser("Hello"));

    }

    public static String stringReverser(String word) {
        StringBuilder wordObject = new StringBuilder();
        wordObject.append(word);
        System.out.println(wordObject);
        return "Hey";
    }

}
