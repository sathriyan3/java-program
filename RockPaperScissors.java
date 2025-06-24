import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] choices = {"rock", "paper", "scissors"};
        String userChoice, computerChoice;
        int wins = 0, losses = 0, draws = 0;

        System.out.println("🎮 Welcome to Rock, Paper, Scissors!");
        System.out.println("Type rock, paper, or scissors. Type exit to quit.");

        while (true) {
            System.out.print("\nYour move: ");
            userChoice = sc.next().toLowerCase();

            if (userChoice.equals("exit")) {
                System.out.println("\nThanks for playing!");
                System.out.println("Wins: " + wins + " | Losses: " + losses + " | Draws: " + draws);
                break;
            }

            // Validate input
            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid input! Try again.");
                continue;
            }

            // Computer's move
            computerChoice = choices[rand.nextInt(3)];
            System.out.println("Computer chose: " + computerChoice);

            // Determine winner
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a draw!");
                draws++;
            } else if (
                (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper"))
            ) {
                System.out.println("You win!");
                wins++;
            } else {
                System.out.println("You lose!");
                losses++;
            }
        }

        sc.close();
    }
}
