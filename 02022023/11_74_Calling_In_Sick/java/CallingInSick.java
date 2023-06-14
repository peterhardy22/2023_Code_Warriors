import java.util.Random;

public class CallingInSick {
    public static void main(String[] args) {
        Random randomizer = new Random();

        boolean actuallySick = randomizer.nextBoolean();
        boolean kindaSick = randomizer.nextBoolean();
        boolean hateYourJob = randomizer.nextBoolean();
        int sickDays = randomizer.nextInt(10) + 1;

        if ((actuallySick && sickDays > 0) || (kindaSick && hateYourJob && sickDays > 0)) {
            boolean callingInSick = true;
            System.out.println("It is " + callingInSick + ", I will be calling in sick today!");
        } else {
            boolean callingInSick = false;
            System.out.println("It is " + callingInSick + ", I will not be calling in sick today!");
        };
    }
}