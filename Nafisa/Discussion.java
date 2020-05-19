import java.util.Scanner;
public class Discussion{
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Hi! What is your name?");
	String name = input.next();

	System.out.println("Nice to meet you "+name+" !");
	System.out.println("What do you do, "+name+ " ?");
	String doing = input.next();

	System.out.println("So you are a SDET");
	System.out.println("How much is your hourly salary?");
	int salary = input.nextInt();
	
	System.out.println("So you make weekly: "+salary*40);
	System.out.println("So you make monthly: "+salary*176);
	System.out.println("So you make annual: "+salary*176*12);


	}
}