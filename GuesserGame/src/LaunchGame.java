import java.util.Scanner;

public class LaunchGame {

	public static void main(String[] args) {
		
		Umpire umpire = new Umpire();
		
		Guesser guesser = new Guesser();
		umpire.setGuessedNum(guesser.guessNum());
		
		/* User is player 1, guess the number from 0-10 */
		System.out.println("Player 1 guess the number in the range 0-10: ");
		Scanner scan = new Scanner(System.in);
		umpire.setPlayer1Guess(scan.nextInt());
		
		/* setting player 2 input as opponent value, player 2 is opponent */
		umpire.setPlayer2Guess(guesser.guessNum());
		/* setting player 3 input as opponent value, player 3 is opponent */
		umpire.setPlayer3Guess(guesser.guessNum());
		
		umpire.checkWinner();
		System.out.println("Actual Num : " + umpire.getGuessedNum());
		System.out.println("Player 1 Guess : " + umpire.getPlayer1Guess());
		System.out.println("Player 2 Guess : " + umpire.getPlayer2Guess());
		System.out.println("Player 3 Guess : " + umpire.getPlayer3Guess());
		if(umpire.getWinner() == "player 1") {
			System.out.println("\n \nHURRAH! You are the winner");
		}
	}

}
