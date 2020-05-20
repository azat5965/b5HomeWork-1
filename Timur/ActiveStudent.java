package Variables;

import java.util.Scanner;

public class ActiveStudent {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many percent you attending the school out of 100? (0-100%) ");
		
	    int attendingPercent = input.nextInt();
	      
	      
	    System.out.println("Did you finish all your HomeWork? Yes/No ");
	    
	    String finishHW = input.next();
	    
	    
	    System.out.println("Have you recapped Java class? Yes/No ");
	    
	    String recapJS = input.next();
	    
		
	    boolean question1 = attendingPercent>=80;
	    
	    boolean question2 = finishHW.equalsIgnoreCase("Yes");
	    
	    boolean question3 = recapJS.equalsIgnoreCase("Yes");
	    
	    
	    boolean finalQ = question1 && question2 && question3;
	    
	    System.out.println("Active student: "+finalQ);
	    
		
		
		
		
		
		
		
		
		
		
	}

}
