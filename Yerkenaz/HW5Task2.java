import java.util.Scanner;

public class HW5Task2 {
public static void main (String [] args) {
	
	Scanner input = new Scanner (System.in); 
	
	
	System.out.println("Please print your name, position, location, and company?");
	String response = input.next(); 
	
	int indexOfSpace = response.indexOf (',');
	String name = response.substring(0, indexOfSpace);
	System.out.println("So your name is: " + name.toUpperCase());
	
	
	String response2 = response.substring(indexOfSpace+1);  //sdet,  chicago,chase
	indexOfSpace = response2.indexOf(',');
	String work = response2.substring(0,indexOfSpace);
	System.out.println("You work as: " + work.toUpperCase()); 
	
	String response3 = response2.substring(indexOfSpace+1);
	
	String location = response3.substring(0, response3.indexOf(','));
	System.out.println("Your location is: " + location.toUpperCase());
	
	
	
	String company = response3.substring(response3.indexOf (',')+1);
	System.out.println("You work for company: " + company.toUpperCase ());
	//String response4 = response3.substring(indexOfSpace+1); 
	
}
}
