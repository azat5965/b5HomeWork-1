package ConditionalStms;

import java.util.Scanner;

public class Homework {
	
	public boolean canDivide(int num1, int num2) {
		boolean numbers = num1%num2 ==0;
		return numbers;
		
	}
	
	 public static void main(String[] args) {
		 
		 Scanner input = new Scanner(System.in);
		 System.out.println("please enter your first number:" );
		 int num1 = input.nextInt();
		 System.out.println("please enter your second number;");
		 int num2 = input.nextInt();
		Homework divide = new Homework();
		System.out.println(divide.canDivide(num1, num2));
	}

			
			
		

}
