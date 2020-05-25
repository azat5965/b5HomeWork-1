package HomeWorks;
import java.util.Scanner;

public class GroceryStore {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the price of oranges per pound:");
		
		float pricePerPound = input.nextFloat();
		
		System.out.println("How many pounds do you want to buy?");
		
		float quantityPounds = input.nextFloat();
		
		float cost = pricePerPound*quantityPounds; 
		
		
		System.out.println("What is your account balance?");
		
		float accountBalance = input.nextFloat();
		
		
		// pricePerpound*quantityPounds = cost
		
		// accountBalance >= cost =="yes"
		
		
		boolean finalAnswer = accountBalance >= cost;
		
		
		System.out.println("You can make your purchase today: "+finalAnswer);
		
		
		
		
	}

}
