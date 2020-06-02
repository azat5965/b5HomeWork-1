package HomeWork;

import java.util.Scanner;

public class D12HWTask2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your word:");
		String word = input.next();
		System.out.println(word.replace(""," "));
	}

}
