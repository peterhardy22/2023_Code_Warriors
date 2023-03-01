import java.util.Random;

public class WhileLoop {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int minimumNumber = 0;
        int maximumNumber = 11;
        int number = randomNumber.nextInt(maximumNumber - minimumNumber) + minimumNumber;
        
        while (number != 5) {
            System.out.println(number);
            number = randomNumber.nextInt(maximumNumber - minimumNumber) + minimumNumber;
        }

        System.out.println(number);
    }
}
