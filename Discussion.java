import java.util.Scanner;
public class Discussion {
	
public static void main(String[] args){
	
 Scanner input = new Scanner(System.in);
 System.out.println("Hi! What is your name? ");

 String mName = input.next();

System.out.println("Nice to meet you, "+mName+"!");

System.out.println("What do you do, "+mName+"?");

String work = input.next();

System.out.println("So you are a "+work);

System.out.println("How much is your hourly salary?");

int salary = input.nextInt();
int sAnnual = (salary*1_920);

System.out.println("So you make weekly $"+salary*40);
System.out.println("So you make monthly $"+salary*160);
System.out.println("So you make annual $"+sAnnual);


// Timur Dzhigkaev 





}


}