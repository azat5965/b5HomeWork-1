package Operators;

import java.util.Scanner;

public class GroCeryStore {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please, enter the price of oranges per pound?");
		double price = input.nextDouble();
		
		System.out.println("How many pounds he/she wants to buy?");
		double pound = input.nextDouble();
		
		System.out.println("What is your account balance?");
		double balance = input.nextDouble();
		
		double purchase = price * pound;
		boolean compare = balance >=purchase;
		
		System.out.println("You can make a purchase: "+compare);
			
	}

}
