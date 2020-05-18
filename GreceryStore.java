package Operaters;

import java.util.Scanner;

public class GreceryStore {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the price of oranges per pound?");
		
		 float oranges = input.nextFloat(); 
		
		System.out.println("How many pounds do you want to buy?");
		
		int pounds = input.nextInt();
		
		System.out.println("What it is your account balance?");
		 
		float money = input.nextFloat();
		 
		
	    boolean minBalance;
	    
	    
	    minBalance = money >=pounds*oranges;
	    
	    System.out.println("You can make a purchase:true");
		
		
		
		
		
	}

}
