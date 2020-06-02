														
public class LoopsHomeWork {
	public static void main(String[] args) {
		
		String sentence =  "hello world.Java is very popular language.we are learning java in a daily basis. "
				+"we will finish it soon. Once we finish java we will start with selenium.after the course"
				+"everybody will find their dream job";
		int count = 0;
		for( int spaces = 0; spaces<sentence.length() ; spaces++) {
			if (sentence.charAt(spaces)==(' ')) {
				count++;
				}
			}
		System.out.println("Number of spaces in given string: "+count );
		
		int letterA=0;
		for(int i = 0; i<sentence.length();i++) {
			if(sentence.charAt(i)=='a'){
				letterA++;
				}
		       }
		 System.out.println("Number of letters 'a' in given string: "+letterA);
		 
		 int letterB = 0;
		 for(int i=0; i<sentence.length(); i++) {
			 if(sentence.charAt(i)=='b'){
			 letterB++;
			 }	
	}
	System.out.println("Number of letters 'b' in given string: "+letterB);
	
	
	}}


		 
	
	

		
		
		
		
		
		
		
		
		
		
		