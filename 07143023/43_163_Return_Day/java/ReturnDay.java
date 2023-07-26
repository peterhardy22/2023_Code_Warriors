import java.util.HashMap;

public class ReturnDay {
    public static void main(String[] args) {
        System.out.println(returnDay(1));
        System.out.println(returnDay(2));
        System.out.println(returnDay(3));
        System.out.println(returnDay(4));
        System.out.println(returnDay(5));
        System.out.println(returnDay(6));
        System.out.println(returnDay(7));
        System.out.println(returnDay(41));
    }

    public static String returnDay(int number) {
        HashMap<Integer, String> days = new HashMap<>();

        days.put(1, "Sunday");
        days.put(2, "Monday");
        days.put(3, "Tuesday");
        days.put(4, "Wednesday");
        days.put(5, "Thursday");
        days.put(6, "Friday");
        days.put(7, "Saturday");

        if (number <= 7 && number >= 1) {
            String answer = days.get(number);
            return answer;
        } else {
            return "Please pick a number between 1 and 7.";
        }
    }
}
