package HomeWork;

import java.util.Scanner;

public class PracticeCondition {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please choose number of vehicle on the list:"
				+ " \n1)Passenger Car \n2)Bus \n3)Truck");
		
		int carSel = input.nextInt();
		
		switch (carSel) {
		case 1:
			System.out.println("Fee amount 2.50$");
			break;
		case 2:
			System.out.println("Fee amount 5.00$");
			break;
		case 3:
			System.out.println("Fee amount 6.50$");
			break;
			
			default:
			System.out.println("invalid number");
		}
		
		
	}
	
}
