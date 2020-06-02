import java.util.Scanner;

public class LoopsHomeworkTask2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your word: ");
		String word = input.next();
		String word2 = " ";
		
		for(int i = 0; i<word.length() ; i++) {
			word2 = word.substring(i,i+1)+" ";
				System.out.print(word2);
		}
		
		
	}

}
