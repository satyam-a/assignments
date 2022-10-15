
public class Umpire {
	private int guessedNum;
	private int player1Guess;
	private int player2Guess;
	private int player3Guess;
	private String winner;
	
	public void checkWinner() {
		if(guessedNum == player1Guess) {
			if(guessedNum != player2Guess && guessedNum != player3Guess) {
				this.winner = "player 1";
			}else {
				if(guessedNum == player2Guess && guessedNum != player3Guess) {
					this.winner += " " + "player 2";	
				}else if(guessedNum == player3Guess && guessedNum != player2Guess) {
					this.winner += " " + "player 3";
				}else {
					this.winner += " " + "player 2" + " " + "player 3";
				}
			}
		}else if(guessedNum == player2Guess) {
			if(guessedNum != player3Guess) {
				this.winner = "player 2";
			}else {
				this.winner += " " + "player 3" ;
			}
		}
		else if(guessedNum == player3Guess){
			this.winner = "player 3";
		}else {
			this.winner = null;
		}
		
		
		if(this.winner != null) {
			System.out.println("The winner is "+ this.winner);
		}else {
			System.out.println("There was no winner!");
		}
		
	}

	public int getGuessedNum() {
		return guessedNum;
	}

	public void setGuessedNum(int guessedNum) {
		this.guessedNum = guessedNum;
	}

	public int getPlayer1Guess() {
		return player1Guess;
	}

	public void setPlayer1Guess(int player1Guess) {
		this.player1Guess = player1Guess;
	}

	public int getPlayer2Guess() {
		return player2Guess;
	}

	public void setPlayer2Guess(int player2Guess) {
		this.player2Guess = player2Guess;
	}

	public int getPlayer3Guess() {
		return player3Guess;
	}

	public void setPlayer3Guess(int player3Guess) {
		this.player3Guess = player3Guess;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	
}
