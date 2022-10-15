import java.util.Random;

public class Guesser {

	
	public int guessNum() {
		Random random = new Random();
		return random.nextInt(10);
	}
}
