package ConditionalStms;

import java.util.Scanner;

public class UtilityMethods {

	
	public boolean firstLastChars(String word) {
		word = word.toLowerCase();
		
		String firstLetter = ""+word.charAt(0);
		if(word.endsWith(firstLetter)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("please enter you word:");
		String word = input.next();
		UtilityMethods sameChars = new UtilityMethods();
		sameChars.firstLastChars(word);
		boolean result = sameChars.firstLastChars(word);
		System.out.println(result);
	}
}
