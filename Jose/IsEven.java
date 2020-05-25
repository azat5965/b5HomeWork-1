package HomeWorks;

import java.util.Scanner;

public class IsEven {
	
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please enter your Student ID number: ");
		
		int studentId = input.nextInt();
		
		boolean evenId = (studentId%2 == 0); 
		
		System.out.println("Your Student ID is even: "+evenId);
		
		
		
	}

}
