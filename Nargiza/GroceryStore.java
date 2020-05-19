package Operators;

import java.util.Scanner;

public class GroceryStore {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("-Enter price of oranges per pound: ");
		
		double price = input.nextDouble();
		
		System.out.println("-Enter how many pounds you want?");
		
		double pounds = input.nextDouble();
		
		System.out.println("-What is your account balance?");
		
		double accountBalance = input.nextDouble();
		
		boolean purchase = accountBalance >= 0;
		
		
		System.out.println("You can make a purchase:" + purchase);
	}

}
