import java.util.Scanner;

public class DestinationTime{
	
	public static void main(String[] args){

	  /* Write aa program that will ask a user to
	   enter number of miles to the destination

	   Then ask a user what is his/her speed
	   that she/he driving the car within
	   And this program will calculate how many minutes it will take 
	   to get to destination.

	   */
	   Scanner input = new Scanner(System.in);
	   System.out.println("Please enter how many miles to your destination");
	   int miles = input.nextInt();
	   System.out.println("What is your speed?");
	   int speed = input.nextInt();
	   System.out.println ("Your total hours will be " +(miles/speed) +"hours");


	}
}