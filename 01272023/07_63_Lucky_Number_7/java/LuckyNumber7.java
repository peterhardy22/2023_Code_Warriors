import java.util.Random;

public class LuckyNumber7 {
    public static void main(String[] args) {
        Random randomGenerator=new Random();

        int choice = randomGenerator.nextInt(10) + 1;
        System.out.println(choice);

        if (choice == 7) {
            System.out.println("lucky");
        } else {
            System.out.println("unlucky");
        }
    }
}
