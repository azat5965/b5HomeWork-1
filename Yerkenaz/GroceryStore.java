package Operators;

import java.util.Scanner;


public class GroceryStore {
public static void main (String [] args) {

	 Scanner input =  new Scanner  (System.in); 
	
	System.out.println ("What is the price of oranges per pound?"); 
	
	
	float price = input.nextFloat (); 
	 
	System.out.println ("How many pounds would you like?"); 
	
	int numberOfPounds = input.nextInt (); 
	
	System.out.println ("What is your account balance?"); 
	
	float balance = input.nextFloat (); 
	
	boolean purchase = price * numberOfPounds < balance;  
	
	System.out.println("You can make a purchase: " +  purchase);
	
	
	
	
	
	
}
	
	
	
}
