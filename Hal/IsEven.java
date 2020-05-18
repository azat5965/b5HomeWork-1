package Operators;

import java.util.Scanner;

public class IsEven {

	 public static void main(String[] args) {
		 
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("What is your Studemt ID number?");
			
			int id = input.nextInt();
			
		
			
			boolean result = (id % 2 == 0);
			
			
			System.out.println("Your ID is even:"+result);
			
		 
		 
	 }
	 
}
