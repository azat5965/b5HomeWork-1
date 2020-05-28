
public class CheckConditions {


public static boolean checkConditions(String sentence,String start, String end, String contain) {
	
	
	if (sentence.startsWith(start)) {
		if(sentence.endsWith(end)) {
			if(sentence.contains(contain)) {
				return true;
			}
		}
	}else {
		return false;
			
}
	
}	
	
}
		
		public static void main(String[] args) {

	
	System.out.println(checkConditions("Search in google -Java", "Search", "Java", "-"));
	

		}
}



