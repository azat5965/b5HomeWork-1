package sunDay;

import java.util.Scanner;

public class GroceryStore {

	
public static void main(String[] args) {
	
	Scanner input = new Scanner( System.in);
	System.out.println("Cost  of a pound of orange: ");
	 int poundPerOrange = input.nextInt();
	 
	System.out.println("Amount of orange requested: ");
	 int amountRequested = input.nextInt();
	  
	 System.out.println("Current account balance: ");
	 
	 int currentBalance =input.nextInt();
	 
	 Boolean purchase = currentBalance < amountRequested;
	 
	 System.out.println("purchase");
	 
	
	 
	  
	
}
}
