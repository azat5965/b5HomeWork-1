package CondisionalStatemens;

import java.util.Scanner;

public class UtilityMethods {
	public boolean firstlastChars(String word) {
		
	String firstChar = ""+word.charAt(0);
	
	if (word.endsWith(firstChar)) {
		return true;}
	else { return false;}
	   
   }

 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.println("Please enter your word :");
 String word = input.next();
 UtilityMethods um = new UtilityMethods();
 System.out.println(""+um.firstlastChars(word));
 
 }
 
 }