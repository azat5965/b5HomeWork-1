import java.util.Scanner;
public class Discussion{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Hi! What is your name?");

		String userName = input.next();

		System.out.println("Nice to meet you "+userName);

		System.out.println("What do you do "+userName+" for work?");

		String job = input.next();

		System.out.println("So you are an "+job+"?");

		System.out.println("How much is your hourly salary?");

		int hourlyRate = input.nextInt();

		int weeklyPay = 40;

		int month = 4;

		int year = 12;

		System.out.println("So you make weekly $"+hourlyRate*weeklyPay);

		System.out.println("So you make monthly $"+(hourlyRate*weeklyPay)*month);

		System.out.println("So you make annually $"+(hourlyRate*weeklyPay)*month*year);




	}


}