package Operators;

import java.util.Scanner;

public class GroceryStore {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the prive of orange?");
		
		float oPrice = input.nextFloat();
		
		System.out.println("Enter amound of pounds that you want: ");
		
		float aPound = input.nextFloat();
		
		System.out.println("What is your account balance?");
		
		float aBalance = input.nextFloat();
		
		boolean result = aBalance>=oPrice*aPound ;
		
		System.out.println("You can make a purchase: "+result);
		System.out.println("You can't make a purchase: "+!result);
		
		// Timur
		
				
		
		
		
		
		
		
		
		
		
		
		}
}
