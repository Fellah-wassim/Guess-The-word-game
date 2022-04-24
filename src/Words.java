import java.util.Arrays;
import java.util.Random;

public class Words {
	private String[] randomWords = {"animals","happiness","study","indefinite","steady","birthday","extrem","rights","properties","ceremony",
			"independence","beneath","information","students","employee"};

	private String selectedWord;
	private Random random=new Random();
	private char[] letters;
	
	public Words() {
		selectedWord=randomWords[random.nextInt(randomWords.length)];
		letters=new char[selectedWord.length()];
	}
	@Override
	public String toString() {
		StringBuilder text=new StringBuilder();
		
		for(char letter:letters) {
			
			
//			text=letter=='\u0000'? text.append('-'):text.append(letter);
			text.append(letter=='\u0000'?'-':letter);
			text.append(' ');
		}
			
		return text.toString();
	}
	public boolean isGuessedRight() {
		for(char letter:letters) {
			if(letter=='\u0000') {
				return false;
			}
		}
		return true;
	}
	public boolean guess(char letter) {
		boolean guessedRight=false;
		
		for(int i=0;i<selectedWord.length();i++) {
			if(letter==selectedWord.charAt(i)) {
				letters[i]=letter;
				guessedRight=true;
			}
		}
		return guessedRight;
		
	}

}
