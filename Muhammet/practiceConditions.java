import java.util.Scanner;

public class practiceConditions {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please choose number of vehicle on the list:");
		
		System.out.println("1)Passenger car\n2)Bus\n3)Truck");
		
		int vehicle = input.nextInt();
		
		
		switch(vehicle) {
		case 1:
		     System.out.println("Car fee amount $2.50 ");
		     break;
		case 2:
			System.out.println("You selected bus fee is $5");
			break;
		case 3:
			System.out.println("You selected truck fee is $6.50" );
			break;
		default:
			System.out.println("Invalid selection");
		}
		
		
	}

}
