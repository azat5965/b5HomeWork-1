import java.util.Scanner;

public class T2 {
public static void main (String [] args) {
	
	Scanner input = new Scanner (System.in); 
	
	System.out.println (" How much percent of school are you attending to out of 100?"); 
	int number = input.nextInt(); 
	boolean result1= number >= 80; 
	
	System.out.println ("Did you finish all your homework? Yes/No");
	String homework = input.next(); 
	
	System.out.println ("Have you recapped Java class? Yes/No"); 
	String recapJava = input.next (); 
	
	boolean homeworkresult= homework.equalsIgnoreCase ("yes");
	boolean recapJavaresult = recapJava.equalsIgnoreCase ("yes");
	
	boolean result2 = homeworkresult || recapJavaresult; 
	
	boolean finalResult = result1 && result2; 
	
	System.out.println ("Active student: " + finalResult ); 
	
 
	
	
	
	


}
}
