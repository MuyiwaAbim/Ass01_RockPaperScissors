package checkInputIsInt;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String[] rps = {"r", "p", "s"};

            String playerA;
            String playerB;

            while (true) {
                System.out.println("Please enter your move player 1 (r, p, or s)");
                playerA = scanner.nextLine();
                if (playerA.equals("r") || playerA.equals("p") || playerA.equals("s")) {
                    System.out.println("Please enter your move player 2 (r, p, or s)");
                    playerB = scanner.nextLine();
                    if (playerB.equals("r") || playerB.equals("p") || playerB.equals("s")) {
                        break;
                    } else {
                        System.out.println(playerB + " is not a valid move.");
                    }
                } else {
                    System.out.println(playerA + " is not a valid move.");

                }












            }

            if (playerA.equals(playerB)) {
                System.out.println("The game was a tie!");
            }
            else if (playerA.equals("r")) {
                if (playerB.equals("p")) {
                    System.out.println("Player 2 Wins! Paper beats rock!");

                } else if (playerB.equals("s")) {
                    System.out.println("Player 1 Wins! Rock beats scissors!");
                }

            }

            else if (playerA.equals("p")) {
                if (playerB.equals("r")) {
                    System.out.println("Player 1 Wins! Paper beats rock!");

                } else if (playerB.equals("s")) {
                    System.out.println("Player 2 Wins! Scissors beats paper!");
                }
            }

            else if (playerA.equals("s")) {
                if (playerB.equals("p")) {
                    System.out.println("Player 1 wins! Scissors beats paper!");

                } else if (playerB.equals("r")) {
                    System.out.println("Player 2 Wins! Rock beats scissors!");
                }
            }

            System.out.println("Play again? (y/n)");
            String playAgain = scanner.nextLine();

            if (!playAgain.equals("y")) {
                break;
            }
        }
        scanner.close();
    }
}
;