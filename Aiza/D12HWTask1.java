package HomeWork;

public class D12HWTask1 {
	public static void main(String[] args) {
		
		String sentence ="Hello world. Java is vary popular language. we are learning java on a daily"
				+ "basis. we will finish it soon. once we finish java we will start with selenium. "
				+ "after the course everybody will find dream job!";
				
		int count = 0;
		
		for (int i=0; i<sentence.length(); i++) {
			
			if (sentence.charAt(i)==' ') {
				count++;
				
			}
		}
		System.out.println("The number of space in our sentence are: "+count);
		int countA = 0;
		for(int i=0; i<sentence.length(); i++) {
		if (sentence.charAt(i)=='a') {
			countA++;
	
		}
		
		}
		System.out.println("There are "+countA +" 'a' in the sentence");
		int countB= 0;
		for(int i=0; i<sentence.length(); i++) {
		if (sentence.charAt(i)=='b') {
			countB++;
		}
		}
		System.out.println("There are "+countB +" 'b' in the sentence");
		int countC= 0;
		for(int i=0; i<sentence.length(); i++) {
		if (sentence.charAt(i)=='c') {
			countC++;
		}
		}
		System.out.println("There are "+countC +" 'c' in the sentence");
		int countD= 0;
		for(int i=0; i<sentence.length(); i++) {
		if (sentence.charAt(i)=='d') {
			countD++;
		}
		}
		System.out.println("There are "+countD +" 'd' in the sentence");
		int countE= 0;
		for(int i=0; i<sentence.length(); i++) {
		if (sentence.charAt(i)=='e') {
			countE++;
		}
		}
		System.out.println("There are "+countE +" 'e' in the sentence");
		int countF= 0;
		for(int i=0; i<sentence.length(); i++) {
		if (sentence.charAt(i)=='f') {
			countF++;
		}
		}
}
}
