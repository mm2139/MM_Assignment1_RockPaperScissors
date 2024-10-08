import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        String player1 = "Z";
        String player2 = "Z";
        String playAgain = "Z";
        boolean playAgainValid = false;

        do {
            Scanner scan = new Scanner(System.in);

            System.out.println("Welcome to Rock, Paper, Scissors! Player 1, please input your choice: Rock, Paper, or Scissors? [R, P, S]");
            player1 = DetermineInput(player1);
            System.out.println("Player 2, please input your choice: Rock, Paper, or Scissors? [R, P, S]");
            player2 = DetermineInput(player2);

            DetermineWinner(player1, player2);

            boolean playAgainHasResponse = false;

            do {
                System.out.println("Play again? [Y/N]");
                playAgain = scan.next();
                if (playAgain.equalsIgnoreCase("Y")) {
                    playAgainValid = true;
                    playAgainHasResponse = true;
                } else if (playAgain.equalsIgnoreCase("N")) {
                    System.out.println("Thanks for playing!");
                    System.exit(0);
                } else {
                    System.out.println("You have inputed an invalid response. Please try again.");
                }
            } while (!playAgainHasResponse);
        } while (playAgainValid = true);
    }


    public static String DetermineInput(String input) {

        Scanner scan = new Scanner(System.in);
        boolean validInput = false;

        do {
            if (scan.hasNextLine()) {
                input = scan.next();
                if (input.equalsIgnoreCase("R") || input.equalsIgnoreCase("P") || input.equalsIgnoreCase("S")) {
                    validInput = true;
                } else {
                    System.out.println("You have inputted an invalid response. Please try again.");
                    scan.nextLine();
                }
            } else {
                System.out.println("You have inputted an invalid response. Please try again.");
                scan.nextLine();
            }
        } while (!validInput);
        return input;
    }

    public static void DetermineWinner(String input1, String input2) {

        if (input1.equalsIgnoreCase(input2)) {
            System.out.println("It's a tie!");
        } else if (input1.equalsIgnoreCase("R")) {
            if (input2.equalsIgnoreCase("S")) {
                System.out.println("Rock breaks scissors - Player 1 wins!");
            } else {
                System.out.println("Paper covers rock - Player 2 wins!");
            }
        } else if (input1.equalsIgnoreCase("S")) {
            if (input2.equalsIgnoreCase("R")) {
                System.out.println("Rock breaks scissors - Player 2 wins!");
            } else {
                System.out.println("Scissors cuts paper - Player 1 wins!");
            }
        } else if (input1.equalsIgnoreCase("P")) {
            if (input2.equalsIgnoreCase("R")) {
                System.out.println("Paper covers rock - Player 1 wins!");
            } else {
                System.out.println("Scissors cuts paper - Player 2 wins!");
            }

        }
    }
}
