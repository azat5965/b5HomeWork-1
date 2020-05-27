package Homework06;
import java.util.Scanner;

//Task 4
public class Grades {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Grades classCopy = new Grades();
		
		System.out.println("Please enter your score to get your grade.");
		double yourScore = input.nextDouble();
		if (yourScore>=0 && yourScore<=100) {
		char grade = classCopy.scoreToGrade((int)yourScore);
		System.out.println("Your grade is: "+grade);
		}else {
			System.out.println("Please enter a valid score between 0 and 100");
		}

	}
	
	
	
	//Method retuns grade based on entered score.
	public char scoreToGrade(int score) {
		if(score >=80 && score <=100) {
			return 'A';
		}else if(score >=60 && score <=79) {
			return 'B';
		}else if(score >=40 && score <=59) {
			return 'C';
		}else
			return 'F';
		}
	
	


}
