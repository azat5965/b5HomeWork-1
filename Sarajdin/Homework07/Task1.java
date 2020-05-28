package Homework07;
import java.util.Scanner;

//Homework07_Task1
public class Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Task1 classObject = new Task1();//Object of our class to call the method.
		
		System.out.println("Please enter your sentence.");
		String firstString = input.nextLine();//taking the sentence from user and assigning it to a string variable.
		firstString = firstString.toLowerCase();//changing the input to lower case to makes checking more easy.
		//The above process has repeated in all the below statements.
		System.out.println("Please enter your second string. Only one word please.");
		String secondString = input.next();
		secondString = secondString.toLowerCase();
		System.out.println("Please enter your third string. Only one word please.");
		String thirdString = input.next();
		thirdString = thirdString.toLowerCase();
		System.out.println("Please enter your forth string. Only one word please.");
		String forthString = input.next();
		forthString = forthString.toLowerCase();
		boolean result = classObject.checkConditions(firstString, secondString, thirdString, forthString);
		System.out.println(result);
		
	}
	
	/*
	 * Method accepts four parameters of String and returns Boolean. 
	 */
	public boolean checkConditions(String sentence, String start, String end, String contain) {
		
	boolean firstWord = sentence.startsWith(start);
	boolean secondWord = sentence.endsWith(end);
	boolean containWord = sentence.contains(contain);
	
	if(firstWord && secondWord) {
		if(containWord) {
			return true;
		}else return false;
	}else return false;
		
		
	
	}
	
	
	
	
	
	
	
	
	

}
