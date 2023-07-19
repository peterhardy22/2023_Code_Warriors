public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(getSumOfDigits(123)); // 6  
    }

    public static int getSumOfDigits(int number) {
        // Converts integer number into a string.
        String strNumber = String.valueOf(number);
        // Counter for storing sum of digits in strNumber.
        int sum = 0;
        // Loop through strNumber.
        for (int i = 0; i < strNumber.length(); i++) {
            // Store each digit as a character
            char digit = strNumber.charAt(i);
            // Convert character to integer and add to sum.
            sum += Character.getNumericValue(digit);
        }

        return sum;
    }
}
