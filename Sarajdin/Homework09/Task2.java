package Homework09;

import java.util.Scanner;

//Task2-->separate the user input by space and print it out on same line.
public class Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your word.");
		String userWord=input.next();
		

			for(int i =0; i<userWord.length(); i++) {
				System.out.print(" "+userWord.charAt(i));
			}

	}

}
