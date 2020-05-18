package HomeWork;

import java.util.Scanner;

public class GroceryStore {

public static void main(String[] args ) {
	
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter price of oranges? ");
		
		double price = input.nextDouble();
		
		System.out.println("Enter how many pounds you want? ");
		
		double pound = input.nextDouble();
		
		System.out.println("What is your account balance? ");
		
		double balance = input.nextDouble();
		
		boolean purchase = price*pound <= balance;
		
		System.out.println("You can make a purchase: "+purchase);
		
		
		
		
		
		
		
	}

}