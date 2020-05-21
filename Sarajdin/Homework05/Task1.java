package Homework05;

public class Task1 {

	public static void main(String[] args) {
		
		// Initial String is declared and "Is Java easy" value is assigned to it.
		String sentence = "Is Java easy?";
		
		//last word of sentence is assigned to a String lastWord using sentence String and substring method.
		String lastWord = sentence.substring(sentence.length()-5,sentence.length()-1);
		
		
		//getting the first letter of the last word using substring method.
		String firstLetter = lastWord.substring(0,1);
		
		//changing first letter to upper case.
		firstLetter = firstLetter.toUpperCase();
		
		//Concatenating upper case first letter with last three letters of word easy using substring.
		String result = (""+firstLetter + lastWord.substring(1,4));
		
		
		//Printing the result.
		System.out.println(result);
		
	
	}

}
