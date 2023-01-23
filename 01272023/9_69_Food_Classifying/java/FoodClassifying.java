import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FoodClassifying {
    public static void main(String[] args) {
        List<String> foodList = new ArrayList<>();
        foodList.add("apple");
        foodList.add("grape");
        foodList.add("bacon");
        foodList.add("steak");
        foodList.add("worm");
        foodList.add("dirt");

        Random randomizer = new Random();

        String food = foodList.get(randomizer.nextInt(foodList.size()));
        System.out.println(food);
    
        if (food == "apple" || food == "grape") {
            System.out.println("fruit");
        } else if (food == "bacon" || food == "steak") {
            System.out.println("meat");
        } else if (food == "dirt" || food == "worm") {
            System.out.println("yuck");
        }
    }
}