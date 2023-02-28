import java.util.Random;

public class WhileLoop {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int minimumNumber = 0;
        int maximumNumber = 10;
        int number = randomNumber.nextInt(maximumNumber - minimumNumber) + minimumNumber;
        int item = 0;
        
        while (number != 5) {
            item = randomNumber.nextInt(maximumNumber - minimumNumber) + minimumNumber;
            number += 1;
        }
    }
}
