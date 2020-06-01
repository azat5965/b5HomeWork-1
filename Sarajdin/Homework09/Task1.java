package Homework09;

//Task1--> Count number of spaces and number of every letter in the bellow String statement.
public class Task1 {

	public static void main(String[] args) {
		String sentence="hello world. Java is very popular language. we are learning java on a daily basis."
	+ " we will finish it soon. Once we finish java we will start with selenium. after the course "
	+ "everybody will find their dream job";
		
		int numOfSpaces=0;
		int numOfEveryLetter=0;
		
		for(int i=0; i<sentence.length();i++) {
			if(sentence.charAt(i) == ' ') {
				numOfSpaces++;
			}
			if(sentence.charAt(i) !=' ') {
				if(sentence.charAt(i) != '.') {
					numOfEveryLetter++;
					System.out.println(sentence.charAt(i)+" - "+numOfEveryLetter);
				}
			}
		}
		System.out.println("We have "+numOfSpaces+" spaces in our sentence.");
		
	}

}
