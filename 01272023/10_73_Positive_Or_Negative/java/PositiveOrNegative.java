import java.util.Random;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Random randomGenerator = new Random();

        int x = randomGenerator.nextInt(200) + -100;
        int y = randomGenerator.nextInt(200) + -100;
        System.out.println("x: " + x);
        System.out.println("y: " + y);

        if (x > 0 && y > 0) {
            System.out.println("both positive");
        } else if (x < 0 && y < 0) {
            System.out.println("both negative");
        } else if (x > 0 && y < 0) {
            System.out.println("x is positive and y is negative");
        } else {
            System.out.println("y is positive and x is negative");
        }
    }
}
