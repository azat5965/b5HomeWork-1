public class checkConditions {
	
	public boolean checkConditions(String sentence, String start, String end, String contains) {
		boolean starts = sentence.startsWith(start);
		boolean ends = sentence.endsWith(end);
		boolean contain = sentence.contains(contains);
		
		boolean result = starts && ends && contain;
		return result;
		
	}
		
	public static void main(String[] args) {
		checkConditions cc = new checkConditions();
		
		System.out.println(cc.checkConditions("Search in google - Java", "Search", "Java","-"));
		System.out.println(cc.checkConditions("I want to be a tester", "I", "test","be"));
		System.out.println(cc.checkConditions("I will finish my homework!", "homework!", "I","my"));
		System.out.println(cc.checkConditions("My name is John", "My", "John","name"));

		
	}

}
