package HomeWork;

import java.util.Scanner;

public class IsEven {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter student ID number: " );
		
		int number = input.nextInt();
		
		
		
		boolean studentID= number%2 == 0;
		
		
		
		System.out.println("Your ID is even: " + studentID);
		System.out.println("Your ID is odd: "+ !studentID);
		
		
	}

}
