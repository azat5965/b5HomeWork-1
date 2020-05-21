package StringMethods;


import java.util.Scanner;
public class HomeWTask2 {


	
		public static void main(String[] args) {
			
			Scanner hal = new Scanner(System.in);
			
			String[] input = new String[4]; 
			String a, b, c, d;
			System.out.print("Please print your name, position location and company? "); 
			/* in task we see inputs in blue with commas. 
			 * so user will provide inputs with commas or just leave space?
			 * if they provide commas then we should add comma sign here .split(","); 
			 * if users inputs has only 1 space then its ok 
			 * but  if they input with 2 or more spaces it is a problem))
			*/
			input = hal.nextLine().split(" ");
			a= input[0];
			b= input[1];
			c= input[2];
			d= input[3];
			System.out.println("Your name is: " + a);
			System.out.println("You work as: " + b);
			System.out.println("Your location is: " + c);
			System.out.println("You work for compnay: " + d);
			}
		}