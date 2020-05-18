package Operators;

import java.util.Scanner;

public class GroceryStore {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter price of oranges?: ");
		
		int price = input.nextInt();
		
		System.out.println("Please enter how many pounds you want?: ");
		
		int pounds = input.nextInt();
		
		System.out.println("What is your account balance?: ");
		
		int userBalance = input.nextInt();
		
		double balance = 12.35;
		
		boolean youCan = userBalance >balance;
		
		System.out.println("You can make a purchase:"+youCan);
		
		
		
		
	}

}
