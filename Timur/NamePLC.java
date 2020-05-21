package StringMethods;

import java.util.Scanner;

public class NamePLC {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please print your name, location, company?");
	
	String sentence = input.nextLine();
	sentence = sentence.trim();
	
	int comaIndex = sentence.indexOf(',');
	System.out.println("So your name is: "+sentence.substring(0, comaIndex));
	
	
	String sentence2 = sentence.substring(comaIndex+1).trim();
	int comaIndex2 = sentence2.indexOf(',');
	System.out.println("You work as: "+sentence2.substring(0, comaIndex2));
		

	String sentence3 = sentence2.substring(comaIndex2+1).trim();
	int comaIndex3 = sentence3.indexOf(',');
	System.out.println("Your location is: "+sentence3.substring(0, comaIndex3));
	
	
	String sentence4 = sentence3.substring(comaIndex3+1).trim();
	int comaIndex4 = sentence4.indexOf(',');
	System.out.println("You work in kompany: "+sentence4.substring(0));
	
	

	
	
	
//	String answer2 = answer1.substring(comaIndex,comaIndex);
//	System.out.println(sentence2);
// Timur Dzh, QA, SF, Sale Force		
///	System.out.println("You work as: "+sentence.substring(comaIndex+1, comaIndex));
///	System.out.println("Your location is: "+sentence.substring(comaIndex+1, comaIndex));
///	System.out.println("You work for company: "+sentence.substring(comaIndex+1));
	
	
	
	
	
	
}
	
}
