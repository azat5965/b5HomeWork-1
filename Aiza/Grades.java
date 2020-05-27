package ConditionalStms;

import java.util.Scanner;

public class Grades {

	public void scoreToGrades(int number) {
		if(number>=80 && number<=100) {
			System.out.println('A');
		}
			if (number>=60 && number<=79) {
				System.out.println('B');
			}
				if (number>=40 && number<=59) {
					System.out.println('C');
				}
					if (number>=0 && number<=40) {
						System.out.println('F');
					}
				
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your highest score:");
		int score = input.nextInt();
		Grades grade =new Grades();
		grade.scoreToGrades(score);
	}
	
	
	
}
	
