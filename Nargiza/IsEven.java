package Operators;

import java.util.Scanner;

public class IsEven {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("-Please enter your student id number:");
		
		int studentId = input.nextInt();
		
		boolean idEven = studentId % 2 == 0;
		
		System.out.println("Your id is even " + idEven);
		
	}

}
