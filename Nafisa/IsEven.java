package Operators;

import java.util.Scanner;

public class IsEven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please, eneter your Student ID number: ");
		int number = input.nextInt();
		
		boolean even = number % 2 == 0;
		

        System.out.println("Your id is even: "+even);
	}

}
