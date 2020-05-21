package Homework05;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please print your name, position, location and company?");
		
		String pInfo = input.nextLine();
		System.out.println(pInfo);
		
		int pInfoLength = pInfo.length();
		//System.out.println(pInfoLength);
		
		int commaIndex= pInfo.indexOf(',');
		String name = pInfo.substring(0,commaIndex);
		System.out.println("So your name is: "+name.toUpperCase());
		
		
		String pInfo2 = pInfo.substring(commaIndex+2);
		int pInfo2Length = pInfo2.length();
		int comma2Index = pInfo2.indexOf(',');
		String work = pInfo2.substring(0,comma2Index);
		System.out.println("You work as: "+work.toUpperCase());
		
		String pInfo3 = pInfo2.substring(comma2Index+2);
		int pInfo3Length = pInfo3.length();
		int comma3Index = pInfo3.indexOf(',');
		String location = pInfo3.substring(0,comma3Index);
		System.out.println("Your location is: "+location.toUpperCase());
		
		String pInfo4 = pInfo3.substring(comma3Index+2);
		int pInfo4Length = pInfo4.length();
		int comma4Index = pInfo4.indexOf(',');
		String company = pInfo4.substring(0);
		System.out.println("You work for company: "+company.toUpperCase());
		


	}

}
