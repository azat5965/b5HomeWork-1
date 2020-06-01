package Homework09;

import java.util.Scanner;

//Task3-->take N integer input form user and print out N number of random letters.
public class Task3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your number.");
		int N = input.nextInt();
		
		for(int i=0; i<=N; i++) {
			System.out.println("a");
		}

	}

}
