package Variables;

import java.util.Scanner;

public class AttandingPercentage {
	
	 public static void main(String[] args) {
		 
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("How many percent are you attending the school out of 100?");
		  int whatPercent = input.nextInt();
		 
		 System.out.println("Did you finish your homework? yes/no");
		 String finishHomework = input.next();
		 
		 System.out.println("Have you recapped Java class? yes/no");
		 String javaCoding = input.next();
		 
		 boolean finishHomeworkResult = finishHomework.equalsIgnoreCase("yes");
		 boolean javaCodingResult = javaCoding.equalsIgnoreCase("yes");
		 
		 boolean percent = whatPercent >=80;
		 boolean finalResult = percent && finishHomeworkResult || javaCodingResult;
		   System.out.println("Active Student: "+finalResult);
	
		 
		 
		 
		 
		 
		 
		 
	 }

}
