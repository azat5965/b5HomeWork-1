package StringMethods;

import java.util.Scanner;

public class namposloccom1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = input.next();
		System.out.println("So your name is:" +name.toUpperCase());
		
		
		System.out.println("What is your job ?");
		String job = input.next();
		System.out.println("You work as:" +job.toUpperCase());
		
		System.out.println("Where is location ?");
		String location = input.next();
		System.out.println("Your location is:" +location.toUpperCase());
		
		System.out.println("What is name of company ?");
		String company = input.next();
		System.out.println("Your work for company:" +company.toUpperCase());
		
		
		
		
		
		
		
	}

}
