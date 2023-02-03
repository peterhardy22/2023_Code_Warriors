// https://www.codewars.com/kata/5547929140907378f9000039
// Level 8 kyu

// Directions
// Create a function called shortcut to remove the lowercase vowels (a, e, i, o, u ) in a given string.

// Examples
// "hello"     -->  "hll"
// "codewars"  -->  "cdwrs"
// "goodbye"   -->  "gdby"
// "HELLO"     -->  "HELLO"
// don't worry about uppercase vowels
// y is not considered a vowel for this kata

// Function & Test Cases
import java.lang.StringBuilder;

public class VowelRemover {
    public static void main(String[] args) {
        shortcut("hello");
        shortcut("how are you today?");
        shortcut("complain");
        shortcut("never");
    }

    public static String shortcut(String input) {
        String vowels = "aeiou";
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < input.length(); i++) { 
            String letter = "" + input.charAt(i);
            if (vowels.contains(letter) == false) {
                builder.append(letter);
            }
        }
        
        String answer = builder.toString();
        System.out.println(answer);
        return answer;   
  }
}