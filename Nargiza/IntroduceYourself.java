package StringMethods;

import java.util.Scanner;

public class IntroduceYourself {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please print your name,position,location,and company?");
		
		
		String perInfo = input.nextLine();
		System.out.println(perInfo);
		
		int perInfoLength = perInfo.length();

		
		int spaceIndex= perInfo.indexOf(',');
		String name = perInfo.substring(0,spaceIndex);
		System.out.println("So your name is: "+name.toUpperCase());
		
		
		String perInfo2 = perInfo.substring(spaceIndex+1);
		int perInfo2Length = perInfo2.length();
		
		int space2Index = perInfo2.indexOf(',');
		String work = perInfo2.substring(0,space2Index);
		System.out.println("You work as: "+ work.toUpperCase());
		
		String perInfo3 = perInfo2.substring(space2Index+1);
		int perInfo3Length = perInfo3.length();
		
		int space3Index = perInfo3.indexOf(',');
	 	String location = perInfo3.substring(0,space3Index);
	 	
		System.out.println("Your location is: "+ location.toUpperCase());
		
		String perInfo4 = perInfo3.substring(space3Index+1);
		int perInfo4Length = perInfo4.length();
		
		int space4Index = perInfo4.indexOf(',');
		String company = perInfo4.substring(0);
		
		System.out.println("You work for company: "+ company.toUpperCase());
		

		
		
	}

}
