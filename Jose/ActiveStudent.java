package HomeWorks;

import java.util.Scanner;

public class ActiveStudent {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many percent you attending the school out of 100? (0-100)");
		
		int percent = input.nextInt();
		
		System.out.println("Did you finish all your homework? Yes or No?");
		
		String homeWork = input.next();
		
		boolean homeWorkAnswer = homeWork.equalsIgnoreCase("Yes");
		
		System.out.println("Have you recapped Java class?");
		
		String reccapped = input.next(); 
		
		boolean didRecap = reccapped.equalsIgnoreCase("yes");
					
		boolean participation = (didRecap || homeWorkAnswer) && percent >= 80;
		
		System.out.println("Active Student: "+participation);
		
		
	}

}
