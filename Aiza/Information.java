package HomeWork;

import java.util.Scanner;

public class Information {
     
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Please print your name, position, location and company:");
		 //1 name
		 String answer = input.nextLine();
		 int namelength = answer.length();
		 int commaIndex = answer.indexOf(',');
		 String name = answer.substring(0,commaIndex);
		 System.out.println("So your name is: "+name.toUpperCase());
		 //2 work
		 String answer2 = answer.substring(commaIndex+1);
		 int worklength = answer2.length();
		 int commaIndex2 = answer2.indexOf(',');
		 String work = answer2.substring(0,commaIndex2);
		 System.out.println("You work as: "+ work.toUpperCase());
		 //3 location
		 String answer3 = answer2.substring(commaIndex2+1);
		 int locationlength = answer3.length();
		 int commaIndex3 = answer3.indexOf(',');
		 String location = answer3.substring(0,commaIndex3);
		 System.out.println("Your location is; "+location.toUpperCase());
		 //4 company
		 String answer4 = answer3.substring(commaIndex3+1);
		 int companyLength =answer4.length();
		 int commaIndex4 = answer4.indexOf(',');
		 String company = answer4.substring(0);
		 System.out.println("You work for company: "+company.toUpperCase());
		 
		 
		 
		 
		
		
	}
	
}
