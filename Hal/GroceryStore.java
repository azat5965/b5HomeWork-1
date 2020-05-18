package Operators;

import java.util.Scanner;

public class GroceryStore {

		public static void main(String[] args) {
			
			Scanner input= new Scanner(System.in);
			
			System.out.println("Enter Price of oranges:");
			float price=input.nextFloat();
			
			System.out.println("Enter how many pounds you want:");
			float weight=input.nextFloat();
			
								
			System.out.println("What is your account balance:");
			float userBalance=input.nextFloat();
			
			boolean result = userBalance>=price*weight;
			
			
			
			System.out.println("You can make your purchase:" +result);
			
			
			
		}
}
