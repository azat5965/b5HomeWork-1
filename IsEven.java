package Operators;

import java.util.Scanner;

public class IsEven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your Student Id ?");
		int idNumber = input.nextInt();
		
	   boolean result = idNumber%2 ==0;
		
		System.out.println(" Your entered Id is even: "+result);
		System.out.println(" Your entered Id is odd; "+!result);
		
		
	}

}
