import java.util.Scanner;

public class CheckLetter {

	
	public static void main(String[] args) {
		CheckLetter cl = new CheckLetter();
		
		System.out.println(cl.checkLetter('u'));
		System.out.println(cl.checkLetter('a'));
		System.out.println(cl.checkLetter('E'));
		System.out.println(cl.checkLetter('H'));

	}

	public String checkLetter(char letter) {
		String letters = "aeuioAEUIO";
		
		if(letters.contains(""+letter)){
			return "Vowel";
		} else {
			return "Conconant";
		}
	}
}
