package StringMethods;

public class IsJavaEasy {

	public static void main(String[] args) {
		
	String sentence = " Is Java Easy? ";
				
			
	 String word3 = sentence.substring(sentence.length()-6,sentence.length());
				
				
      String word1 = word3.substring(0,1);
					
      word1 = word1.toUpperCase();
					
      String result = (" " +word1 + word3.substring(1,4));
				
			
      System.out.println(result);
				
		
	}

}
