package StringMethods;


import java.util.Scanner;
public class HomeWTask3 {


	
		public static void main(String[] args) {
			
			Scanner hal = new Scanner(System.in);
			
			String[] input = new String[4]; 
			String a, b, c, d;
			System.out.print("Please print your name, position location and company? "); 
			/* same as task 2 but added to.UpperCase. also some inputs has 2 words with space
			 * such as NEW YORK so it is confusing, if user inputs has comma then its ok 
			 * without comma big error
			*/
			input = hal.nextLine().split(",");
			a= input[0];
			b= input[1];
			c= input[2];
			d= input[3];
			System.out.println("Your name is: " + a.toUpperCase());
			System.out.println("You work as: " + b.toUpperCase());
			System.out.println("Your location is: " + c.toUpperCase());
			System.out.println("You work for compnay: " + d.toUpperCase());
			}
	


}
