import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's play Rock, Paper, Scissors!");
        System.out.println("When I say 'shoot!', choose: rock, paper, or scissors.");
        System.out.println("Are you ready? Write 'yes' if you are.");
        
        String ready = scan.nextLine();
        System.out.println("\nRock! Paper! Scissors! Shoot!");

        if (ready.equals("yes")) {
            String choice = scan.nextLine();
            String computerChoice = computerChoice();
            String result = result(choice, computerChoice);
            printResult(choice, computerChoice, result);
        } else {
            System.out.println("Darn, some other time...!");
        }

        scan.close();
    }

    public static String computerChoice () {
        double randomNumber = Math.random() * 3;
        int integer = (int)randomNumber;

        switch (integer) {
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            default: return "";
        }
    }

    public static String result(String yourChoice, String computerChoice) {
        String result = " ";

        if (yourChoice.equals("rock") && computerChoice.equals("scissors")) {
            result = "You win!";
        } else if (yourChoice.equals("rock") && computerChoice.equals("paper")) {
            result = "You lose!";
        } else if (yourChoice.equals("paper") && computerChoice.equals("rock")) {
            result = "You win!";
        } else if (yourChoice.equals("paper") && computerChoice.equals("scissors")) {
            result = "You lose!";
        } else if (yourChoice.equals("scissors") && computerChoice.equals("paper")) {
            result = "You win!";
        } else if (yourChoice.equals("scissors") && computerChoice.equals("rock")) {
            result = "You lose!";
        } else if (yourChoice.equals(computerChoice)) {
            result = "It's a tie!";
        } else {
            System.out.println("INVALID CHOICE");
            System.exit(0);
        }
        return result;
    }

    public static void printResult(String yourChoice, String computerChoice, String result) {
        System.out.println("\nYour choice was: " + yourChoice);
        System.out.println("Computer's choice was: " + computerChoice);
        System.out.println("\n" + result);
    }
}