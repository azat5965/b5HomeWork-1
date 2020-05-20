package Homework04;
import java.util.Scanner;

public class ActiveStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many percet you attending the school out of 100? (0-100)");
		int attendency = input.nextInt();
		System.out.println("Did you finish all your homework? Yes/No");
		String homeworkDone = input.next();
		System.out.println("Have you recapped Java Class? Yes/No");
		String classRecap = input.next();
		
		boolean active = attendency >=80 && ( homeworkDone.equalsIgnoreCase("yes") || classRecap.equalsIgnoreCase("yes"));
		
		System.out.println("Active student: "+active);

	}

}
