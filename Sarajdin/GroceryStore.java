

/*Task 1: 
num1 = 16;
num2 = 22;
*/


//Task 2
import java.util.Scanner;

public class GroceryStore{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the price of oranges per pound.");
		double orangePrice = input.nextDouble();

		System.out.println("How many pounds you would like to buy?");
		double pounds = input.nextDouble();

		System.out.println("What is your account balance?");
		double balance = input.nextDouble();

		boolean ability = balance >= (pounds*orangePrice);

		System.out.println("You can make purchase: "+ability);




	}
}