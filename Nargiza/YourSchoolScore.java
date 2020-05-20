package Variables;

import java.util.Scanner;

public class YourSchoolScore {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//*******EXAMPLE 1:
		
		System.out.println("How many percent you attending the school out of 100?(0-100)");
		String percentAtt = input.next();
		
		System.out.println("Did you finish all your homework?yes/no");
		String homework = input.next();
		
		System.out.println("Have you recapped Java Class? yes/no");
		String recappJava = input.next();
		
		boolean homeworkResult = homework.equals("yes");
		boolean recappJavaResult = 100 >= 80;

		

		boolean activeStudent = homeworkResult && recappJavaResult;
		
		System.out.println("Are you active Student?: "+ activeStudent);
		
		
		

}
}