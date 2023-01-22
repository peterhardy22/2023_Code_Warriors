import java.util.Random;

public class NumberIsOdd {
    public static void main(String[] args) {
        Random randomGenerator=new Random();

        int number = randomGenerator.nextInt(1000) + 1;
        System.out.println(number);

        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
