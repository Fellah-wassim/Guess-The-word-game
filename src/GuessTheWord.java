import java.util.Scanner;

public class GuessTheWord {

	private boolean play = true;
	private int rounds = 10;
	private Words randomWord = new Words();
	Scanner scanner = new Scanner(System.in);
	private char lastRound;

	public void start() {
		do {
			ShowWord();
			GetInput();
			CheckInput();

		} while (play);

	}

	void ShowWord() {
		System.out.println("You have "+rounds+" tries left");
		System.out.println(randomWord);
	}

	void GetInput() {

		System.out.printf("Enter a letter to guess the word: ");
		String userGuess = scanner.nextLine();
		lastRound = userGuess.charAt(0);

	}

	void CheckInput() {
		boolean isGuessedRight = randomWord.guess(lastRound);
		if (isGuessedRight) {

			if (randomWord.isGuessedRight()) {
				System.out.println("Congrat, You Won!");
				System.out.println("The word is: " + randomWord);
				play = false;
			}
		}else {
			rounds--;
			
			if(rounds==0) {
				System.out.println("Game over, better luck next time!");
				play=false;
			}
		}
	}

	public void end() {
		CheckInput();
		scanner.close();
	}

}
