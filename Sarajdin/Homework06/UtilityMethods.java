package Homework06;

import java.util.Scanner;

// Task 3
public class UtilityMethods {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		UtilityMethods classCopy = new UtilityMethods();
		
		System.out.println("Please enter your word to check if first and last letter is same.");
		System.out.println("Please enter a word without space. It will only read until the first space.");
		String yourWord = input.next();
		
		boolean result = classCopy.firstLastChars(yourWord);
		System.out.println(result);
	}
	
	
	//Method checks if first and last letter is same.	
	public boolean firstLastChars(String word) {
		word = word.toLowerCase();
	
		String firstChar = ""+word.charAt(0);
		if(word.endsWith(firstChar)) {
			return true;
		}else {return false;}
	
	
	}	
	

	
}
