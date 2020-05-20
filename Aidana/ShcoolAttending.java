package Variables;
import java.util.Scanner;
public class ShcoolAttending {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
	//Example 1
System.out.println("How many percent you attending the school out of 100? (0-100)");
int percent = input.nextInt();
boolean percentRate = percent>=80;


System.out.println("Did you finish all your homework? Yes/No");
String homework = input.next();
boolean homeWorkDid = homework.equalsIgnoreCase("Yes");

	
	
System.out.println("Have you recapped Java class? Yes/No");
String recapped = input.next();
boolean recappedJava = recapped.equalsIgnoreCase("Yes");

boolean result = percentRate && homeWorkDid;
boolean answer = result && percentRate;
System.out.println("Active student; "+answer);
	
	
	
	
	
	
}
}
