package Operators;

import java.util.Scanner;

public class GroceryStore {
 public static void main(String[] args) {
	 
	 Scanner input = new Scanner(System.in);
	 System.out.println("Please enter the price of orange per pound:");
	  
	 float pricePerPound = input.nextFloat();
	   
	   System.out.println("Please enter how many pounds do you want to buy? ");
	 
	   float pounds = input.nextFloat();
	   
	   System.out.println(" What is your balance? ");
	   
	   
	   float balance = input.nextFloat();
	   
	   boolean makePurchase  = balance > pounds;
	   System.out.println("You can make purchase: "+makePurchase);
 }
}
