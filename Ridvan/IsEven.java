package sunDay;

import java.util.Scanner;

public class IsEven {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter student ID; ");
		 
		int number = input.nextInt();
		
		/*I am missing something here. I think i need to introduce 
		 * even and odd number to the code but I dont know how to do that.
		 */
		
		boolean evenNumbers =number ==0;
		
	
		
		System.out.println("Your Id number is " +evenNumbers);
	}

}
