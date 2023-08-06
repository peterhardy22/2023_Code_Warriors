import java.lang.StringBuilder;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("testing")); // False
        System.out.println(isPalindrome("tacocat")); // True 
        System.out.println(isPalindrome("hannah")); // True
        System.out.println(isPalindrome("robert")); // False
        System.out.println(isPalindrome("amanaplanacanalpanama")); // True
    }

    public static boolean isPalindrome(String word) {
        StringBuilder reversed = new StringBuilder(word).reverse();
        String result = reversed.toString();

        return word.equals(result);
    }
}
