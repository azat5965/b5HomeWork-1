import java.util.Scanner;
public class Discussion {
	
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Hi! What is your name? ");

		String name = "David";
		System.out.println(name);

		System.out.println("Nice to meet you, "+name );
		System.out.println("What do you do, "+name+" ? ");

		String job = "SDET";
		System.out.println(job);

		System.out.println("So you are a SDET. ");
		System.out.println("How much is your hourly salary? ");

		long salary = input.nextLong();

		System.out.println("So you make weekly $ "+(salary*8*5) );
		System.out.println("So you make weekly $ "+(salary*8*5*4) );
		System.out.println("So you make weekly $ "+( salary*8*5*4*12) );

	}

}