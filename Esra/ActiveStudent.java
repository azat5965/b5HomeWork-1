package Variables;

import java.util.Scanner;

public class ActiveStudent {
   
public static void main(String[] args){
		
Scanner input = new Scanner(System.in);	
		
System.out.println("How many percent you attending to school out of 100? 0-100");
 
int percentNumber = input.nextInt();

boolean attendingToSchool = percentNumber >= 80;

System.out.println("Did you finish all your homework? yes/no");

String answer = input.next();

boolean finishedHomeWork= answer.equals("yes");

boolean result = attendingToSchool && finishedHomeWork;


System.out.println("Have you recapped java class?");

String recappingJava = input.next();

boolean java = recappingJava.equals("yes");

boolean finalResult = result || java;

System.out.println("Your student status is active: "+finalResult);








		
		
		
		
	
	
	
	
	
	
	
	
	
}	
	
}
