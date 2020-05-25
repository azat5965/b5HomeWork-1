
public class JavaEasy {

	public static void main (String [] args ) {
	String sentence = "Is Java easy?"; 
	//                 01234567
	
	String word = sentence.substring(8,12); 
	 
	 
    // word = word.trim();    (I wasn't able to use this method, as it didn't get rid of (?)
	// System.out.println(word);
	
	
	word = word.substring(0,1).toUpperCase()+word.substring(1); 
	System.out.println (word); 
	
	System.out.println(sentence.substring(8,12).substring(0,1).toUpperCase()+word.substring(1));
		
	
		
		
		
		
		
		
		
	}
	
	
	
	
}
