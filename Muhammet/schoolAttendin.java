package Varibales;

import java.util.Scanner;

public class schoolAttendin {
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many percent you attending the school out of 100? (0-100)");
		
		String percent = input.next();
		
		System.out.println("Did you finish all your homework? yes/no");
		String finish = input.next();
		
		
		boolean percentResult = percent.equalsIgnoreCase("yes");
		boolean finishResult = finish.equalsIgnoreCase("yes");
		
		boolean result = percentResult|| finishResult;
		
		System.out.println("Have you recapped Java class? yes/no");
		String recappedJava = input.next();
		
		boolean recappedJavaResult = recappedJava.equalsIgnoreCase("yes");
		
		boolean finalResult = result && recappedJavaResult;
		
		System.out.println("Active student"+finalResult);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


}
