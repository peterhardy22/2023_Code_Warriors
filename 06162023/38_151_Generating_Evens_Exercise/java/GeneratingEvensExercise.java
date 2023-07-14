public class GeneratingEvensExercise {
    public static void main(String[] args) {
        int upperLimit = 50; // Example upper limit
        int[] evenNumbers = generateEvens(upperLimit);

        // Access and use the even numbers array as needed
        for (int number : evenNumbers) {
            System.out.println(number);
        }
    }

    public static int[] generateEvens(int upperLimit) {
        int arraySize = (upperLimit / 2) - 1;
        int[] numbers = new int[arraySize];
        int index = 0;
    
        for (int i = 1; i < upperLimit; i++) {
            if (i % 2 == 0) {
                numbers[index] = i;
                index++;
            }
        }
    
        return numbers;
    }
}
