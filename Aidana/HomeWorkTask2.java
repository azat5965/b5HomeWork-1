package CondisionalStatemens;

import java.util.Scanner;

public class HomeWorkTask2 {
	  public String middleChars(String word) {
	    	if  (word.length()%2==0){
	    		 int firstPartlength = word.length()/2;
	    		 String fisrtPart = word.substring(0,firstPartlength);
	    		 String secondPart = word.substring(firstPartlength,-1);
	    		int secondePartlength = secondPart.length();
	    		String middleChars = " "+fisrtPart.charAt(firstPartlength-1)+secondPart.charAt(0);
	    		
	    		
	    		return  middleChars;
	    	}else { 
	    		int firstPartLength = word.length()/2;
	    		String firstPart = word.substring(0,firstPartLength);
	    		String secondPart = word.substring(firstPartLength-1);
	    		int secondPartLength = secondPart.length();
	    		String middleChars = " "+firstPart.charAt(firstPartLength);
	    		return middleChars;
	    	}
	    	}
	  

 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 System.out.println("Please enter the word to find middle characters");
	String word = input.next();
	HomeWorkTask2 task2 = new HomeWorkTask2();
System.out.println(task2.middleChars(word)); 
	
	
	
	
	 
 }
}
  