package Variables;

import java.util.Scanner;

public class HWTask2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many percent you attending the school out of 100 ");
		int attendance = input.nextInt();
		
		System.out.println("Did you finish your homework? yes/no");
		String finishHW = input.next();
		
		System.out.println("Have you recapped Java class? yes/no");
		String recappedJv = input.next();
			 
			boolean resultAttendance = attendance>=80;
			boolean finishHWResult = finishHW.equals("yes");
			boolean recappedJvResult = recappedJv.equals("yes");
			boolean firstResult = resultAttendance && finishHWResult;
			boolean finalResult = firstResult || recappedJvResult;

			System.out.println("Active student:" +finalResult);
		
		
		
		
		
		
	
	}
}
