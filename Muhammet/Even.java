package Operators;

import java.util.Scanner;

public class Even {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please ent student ID");
		
		int IDN = input.nextInt();
		
		boolean idEven = IDN%2 == 0;
		boolean idOdd = IDN%2 !=0;
		
		System.out.println("Your ID is even: "+idEven);
		System.out.println("Your ID is odd: "+idOdd);
		
		
	}

}
