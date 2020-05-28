package Homework07;

import java.util.Scanner;
//homework07_Task2
public class PracticeConditions {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please choose number of vehicle on the list.");
		System.out.println("1) Passenger Car \n2) Bus \n3) Truck");
		int carSelection = input.nextInt();
		
		//switch statement checks for user car selection and returns the car type and its fee.
		switch(carSelection) {
		case 1:
			System.out.println("Passenger car. Fee amount: $2.50");
			break;
		case 2:
			System.out.println("Bus. Fee amount: $5");
			break;
		case 3:
			System.out.println("Truck. Fee amount: $6.50");
			break;
		default: System.out.println("Please enter a valid number.");
		}
		

	}

}
