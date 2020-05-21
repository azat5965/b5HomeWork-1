package StringMethods;

import java.util.Scanner;

public class YourInformationCase {
	

	public static void main(String[] args) {
		
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please print your name, position,lacation, and company? ");
	
	String userInfo = input.next();
	int userInfoA = userInfo.length();
	int commaIndex = userInfo.indexOf(',');
	String name = userInfo.substring(0,commaIndex);
	System.out.println("So your name is: "+name.toUpperCase());
	
	
	String userInfo2 = userInfo.substring(commaIndex+1);
	int userInfo2Length = userInfo2.length();
	int commaIndex2 = userInfo2.indexOf(',');
	String work = userInfo2.substring(0,commaIndex2);
	System.out.println("You work as: "+work.toUpperCase());
	
	
	String userInfo3 = userInfo2.substring(commaIndex2+1);
	int userInfo3Length = userInfo3.length();
	int commaIndex3  = userInfo3.indexOf(',');
	String location = userInfo3.substring(0,commaIndex3);
	System.out.println("Your location is: "+location.toUpperCase());
	
	
	String userInfo4 = userInfo3.substring(commaIndex3+1);
	int userInfo4length = userInfo4.length();
	int commaIndex4 = userInfo4.indexOf(',');
	String company = userInfo4.substring(0);
	System.out.println("Your work for company: "+company.toUpperCase());
	
	

	
	
	
	
	
	
	
	
	
	

	
	
	}

	
	

}
