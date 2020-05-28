package Conditions;

import java.util.Scanner;

public class PracticeCondition {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please choose number of vehicle on the list: \n1) Passenger car"
				+"\n2) Bus \n3) Truck");
		
		int tollFee = input.nextInt();
		
		switch(tollFee) {
		case 1:
			System.out.println("Car. Fee amound: $2.50");
			break;
		case 2:
			System.out.println("Bus. Fee amound: $5.00");
			break;
		case 3:
			System.out.println("Truck. Fee amound: $6.50");
			
			
		
		}
		
		
		
		
		
	}

}
