package Operators;

import java.util.Scanner;

public class GroceryStore {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Please enter the price of orange per pound? "); 
		
		float orangePrice = input.nextFloat();
		
		System.out.println("How many pounds you want to buy? ");
		
		float pounds = input.nextFloat(); 
		float total = orangePrice*pounds; 
		 
		System.out.println("What is your account balance? "); 
		
		float accountBalance = input.nextFloat();
		
		boolean makePurchase = accountBalance >=total;
		
		System.out.println("Make a purchase: "+makePurchase);
		
	}

}
