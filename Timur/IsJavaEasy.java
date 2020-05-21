package StringMethods;

public class IsJavaEasy {
	
	public static void main(String[] args) {
		
		String sentence = " Is Java easy? ";
		
		int cmIndex = sentence.indexOf('?');
		
		String eLetter = sentence.substring(9, 10).toUpperCase();
		
		String word = sentence.substring(10, cmIndex).toLowerCase();
		
		System.out.println(eLetter+word);
		
		
		
		
		
		
		
		
		
		
		 
		 
		 
			
		
		
		
	}

}
