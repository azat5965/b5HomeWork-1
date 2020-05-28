package Conditions;

  import java.util.Scanner;

public class PracticeConditions {

// %7 Task 2	
//----------------------------------------------------
	
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please choose number of vehicle on the list: ");
		System.out.println("For Passenger Car enter: 1\nFor Bus enter: 2\nFor Truck enter: 3");
		
		int type = input.nextInt();
		
		if(type==1) {
			System.out.println("Passenger Car. Fee amount: $2.50");
		}else if(type==2) {
			System.out.println("Bus. Fee amount: $5");
		}else if(type==3) {
			System.out.println("Truck. Fee amount: $6.50");
		}else {
			System.out.println("Error 404");
		}
	}
	
	
	
//	%7 Task 3
//-------------------------------------------------------	
	
	
	
	
//	public String checkLetter(char letter) {	
//		
//		if(letter == 'a') 
//			System.out.println("Vowel");
//	    else if (letter == 'e')
//		    	System.out.println("Vowel");
//	    else if (letter == 'u')
//	    	System.out.println("Vowel");
//	    else if (letter == 'i')
//	    	System.out.println("Vowel");
//	    else if (letter == 'o')
//	    	System.out.println("Vowel");
//	    else if (letter == 'A')
//	    	System.out.println("Vowel");
//        else if (letter == 'E')
//         	System.out.println("Vowel");
//        else if (letter == 'U')
//        	System.out.println("Vowel");
//        else if (letter == 'I')
//         	System.out.println("Vowel");
//        else if (letter == 'O')
//         	System.out.println("Vowel");
//        else
//        	System.out.println("Consonant");
//		
//		String result = "";
//		return result;
//				
//		
//	}
//	
//	public static void main(String[] args) {
//		PracticeConditions pc = new PracticeConditions();
//		System.out.println(pc.checkLetter('u'));
//		System.out.println(pc.checkLetter('a'));
//		System.out.println(pc.checkLetter('E'));
//		System.out.println(pc.checkLetter('H'));
//		
//		
//	}
	
	
	
	
// 	%7 Task 1
// ----------------------------------------------------
	
//public boolean checkConditions(String sentence, String start, String end, String contain) {
//		
//	int firstIndexOfSpase = sentence.indexOf(' ');
//	String firstWordSentence = sentence.substring(0, firstIndexOfSpase);
//	
//	int lastIndexOfSpase = sentence.substring
//		
//		
//	}
	
	
	
	
}
