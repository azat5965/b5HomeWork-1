
package Operaters;

import java.util.Scanner;

public class IsEven {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please provide your student id number");
		
		int studId = input.nextInt();
		
		Boolean result = studId%2 == 0;
		 
		System.out.println("Entered id is even: "+result);
		System.out.println("Entered id is odd: "+!result);
		
		
		 
		
	}

}
