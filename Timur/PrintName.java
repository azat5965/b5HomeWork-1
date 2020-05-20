package Variables;

import java.util.Scanner;

public class PrintName {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		
	    String name = input.next();
	    
	 String upperName = name.toUpperCase();
	    
	 int letterNumber = name.length();
	 
	 System.out.println("Hellow "+name.toUpperCase());
	 
	 System.out.println("Number of letters in your name: "+letterNumber);
	 
	 System.out.println(upperName.charAt(0));
	 System.out.println(upperName.charAt(1));
	 System.out.println(upperName.charAt(2));
	 System.out.println(upperName.charAt(3));
	 System.out.println(upperName.charAt(4));
	

		
	 
	 
	 
	 
		
		
	}

}
