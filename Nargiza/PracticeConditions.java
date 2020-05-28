package Conditions;

import java.util.Scanner;

public class PracticeConditions {

	public static void main(String[] args) {
	
		Scanner input =new Scanner(System.in);
		
		System.out.println("Please choose number of vehicle on the list ");
		
		System.out.println("1.Passenger Car \n 2.Bus \n3.Truck");
		
		 int carNumber = input.nextInt();
		 
		 switch(carNumber) {
			case 1:
				System.out.println("Your car fee amount $2.50 ");
				break;
				
			case 2:
				System.out.println("Your bus fee  amount $ 5.0");
				break;
				
			case 3:
				System.out.println("Your track fee  amount $6.50");
				break;
		
				default:
					System.out.println("Your entry is invalid");

	}

	}
}