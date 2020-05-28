import java.util.Scanner;

public class PracticeConditions {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please choose number of the vehicles on thre list : \n1)Passenger car"
				+ "\n2)Bus \n3)Truck ");
		
		int carNumber = input.nextInt();
		
		
		switch(carNumber) {
		    case 1:
			System.out.println("Passenger car. Fee amount $2.5");
			break;
		case 2:
			System.out.println("Bus. Fee amount $5");
			break;
		case 3:
			System.out.println("Truck. Fee amount $6.5");
			default:
		}
		
	}
	

}
