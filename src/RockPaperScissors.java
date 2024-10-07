import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        char player1 = 'Z';
        char player2 = 'Z';
        char playAgain = 'Z';
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
                playAgain = scan.next().toUpperCase().charAt(0);
                if (playAgain == 'Y') {
                    playAgainValid = true;
                    playAgainHasResponse = true;
                } else if (playAgain == 'N') {
                    System.out.println("Thanks for playing!");
                    System.exit(0);
                } else {
                    System.out.println("You have inputed an invalid response. Please try again.");
                }
            } while (!playAgainHasResponse);
        } while (playAgainValid = true);
    }


    public static char DetermineInput(char input) {

        Scanner scan = new Scanner(System.in);
        boolean validInput = false;

        do {
            if (scan.hasNextLine()) {
                input = scan.next().toUpperCase().charAt(0);
                if (input == 'R' || input == 'P' || input == 'S') {
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

    public static void DetermineWinner(Character input1, Character input2) {

        if (input1 == input2) {
            System.out.println("It's a tie!");
        } else if (input1 == 'R') {
            if (input2 == 'S') {
                System.out.println("Rock breaks scissors - " + input1 + " wins!");
            } else {
                System.out.println("Paper covers rock - " + input2 + " wins!");
            }
        } else if (input1 == 'S') {
            if (input2 == 'R') {
                System.out.println("Rock breaks scissors - " + input2 + " wins!");
            } else {
                System.out.println("Scissors cuts paper - " + input1 + " wins!");
            }
        } else if (input1 == 'P') {
            if (input2 == 'R') {
                System.out.println("Paper covers rock - " + input1 + " wins!");
            } else {
                System.out.println("Scissors cuts paper - " + input2 + " wins!");
            }

        }
    }
}
