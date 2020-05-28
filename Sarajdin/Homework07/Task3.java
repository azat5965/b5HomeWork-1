package Homework07;

import java.util.Scanner;

//Homework07_Task3
public class Task3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Task3 classCopy = new Task3();
		System.out.println("Please enter your letter to check if it is vowel or consonant.");
		String yourLetter = input.next();
		
		//Below condition checks if the user enters only one letter and calls for our checkLetter method.
		if(yourLetter.length()>1) {
			System.out.println("Please enter only one letter.");
		}else {
			String result = classCopy.checkLetter(yourLetter.charAt(0));
			System.out.println(result);
		}		
	}
	

	// Method checks if user entered letter is vowel or consonant. and returns string value.
	public String checkLetter(char letter) {
		String vowel = "Vowel";
		String consonant = "Consonant";
		if (letter == 'a' || letter =='e' || letter=='i' || letter=='o' || letter=='u') {
			
			return vowel;
		}else if(letter == 'A' || letter =='E' || letter=='I' || letter=='O' || letter=='U') {
			return vowel;
		}else {return consonant;
	}
		
	}
}
