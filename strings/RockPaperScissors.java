import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int playerWins = 0, computerWins = 0, draws = 0;
        String[] choices = {"rock", "paper", "scissors"};

        System.out.print("How many rounds do you want to play? ");
        int rounds = sc.nextInt();
        sc.nextLine();

        System.out.println("\n--- Rock-Paper-Scissors Game ---");

        for (int i = 1; i <= rounds; i++) {
            System.out.print("\nRound " + i + " - Enter your choice (rock, paper, scissors): ");
            String playerChoice = sc.nextLine().toLowerCase();

            String computerChoice = choices[rand.nextInt(3)];

            System.out.println("Computer chose: " + computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("Result: Draw");
                draws++;
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                       (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                       (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("Result: You Win!");
                playerWins++;
            } else {
                System.out.println("Result: Computer Wins!");
                computerWins++;
            }
        }

        System.out.println("\n--- Game Stats ---");
        System.out.println("Player Wins\tComputer Wins\tDraws");
        System.out.println(playerWins + "\t\t" + computerWins + "\t\t" + draws);

        double playerPercentage = (playerWins * 100.0) / rounds;
        double computerPercentage = (computerWins * 100.0) / rounds;

        System.out.println("\nWinning Percentage:");
        System.out.printf("Player: %.2f%%\n", playerPercentage);
        System.out.printf("Computer: %.2f%%\n", computerPercentage);

        sc.close();
    }
}
