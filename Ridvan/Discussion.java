package day1;

import java.util.Scanner;

public class Discussion {

	public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  
	  System.out.println("Hi! What is your name?");
	   
	  
	  String name = input.next();
	 
	  System.out.println("Nice to meet you, David");
	  
	  System.out.println("What do you do for work?");
	  
	  String work =  input.next();
	 
	 
	  System.out.println("So you are a SDET");
	  System.out.println("How much is your hourly salary?");
	  String salary =  input.next();
	  
	  System.out.println("Do you  weekly make $2000?");
	  String weekly =  input.next();
	
	  System.out.println("So you make montly $8000");
	  String monthly =  input.next();
	  System.out.println("So you make annually $96000");
	  String yearly = input.next();
	  
	  
	  
	  

	}
}
