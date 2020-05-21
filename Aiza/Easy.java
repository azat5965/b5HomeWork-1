package HomeWork;

public class Easy {
	
	public static void main(String[] args) {
		 
		String sentence = "Is Java easy?";
		
		sentence = sentence.substring(8);
		
		String firstLetter = sentence.substring(0,1).toUpperCase();
		
		System.out.println(firstLetter+(sentence.substring(1,4)));
		 
		
	}

}
