import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char player1 = 'Z';
        char player2 = 'Z';

        System.out.println("Welcome to Rock, Paper, Scissors! Player 1, please input your choice: Rock, Paper, or Scissors? [R, P,S]");
        DetermineInput(player1);
        System.out.println("Player 2, please input your choice: Rock, Paper, or Scissors? [R, P,S]");
        DetermineInput(player2);

    }

    public static void DetermineInput(Character input) {

        Scanner scan = new Scanner(System.in);
        boolean validInput = false;

        do {
            if (scan.hasNextLine()) {
                input = scan.next().charAt(0);
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
    }

}


