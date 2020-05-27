package Homework06;
import java.util.Scanner;

//Homework06-> Task1 and Task2 are in this class.
public class Homework {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Object of our class.
		Homework homeworkObject = new Homework();
		
		System.out.println("Please enter your first number.");
		 int firstNum = input.nextInt();
		System.out.println("Please enter your second number.");
		int secondNum = input.nextInt();
		
		
		//Calling our method using the homeworkObject instance and passing int values to our method and catching the returned value and printing it.
		boolean result = homeworkObject.canDivide(firstNum,secondNum);
		System.out.println(result);
		
		System.out.println("Please enter your word to get the middle character.");
		String yourWord = input.next();
		String secondMethod = homeworkObject.middleChars(yourWord);
		System.out.println(secondMethod);
		
	}

	
	//Task 1 Method:
	//Methods checks if two number can be divided by itself without any remainder and returns boolean value.
	public boolean canDivide(int num1, int num2){		
		if(num1%num2 ==0) {
			return true;
		}else return false;	
	}
	
	
	//Task 2 Method:
	//Method returns the middle char
	public String middleChars(String word) {
		if(word.length()%2 == 0) {
			int length = word.length();
			int firstPartLength = (length/2);
			String firstPart = word.substring(0,firstPartLength);
			String secondPart = word.substring(firstPartLength);
			int secondPartLength = secondPart.length();
			String evenMiddleChar = ""+firstPart.charAt(firstPartLength-1)+secondPart.charAt(0);
			return evenMiddleChar;
		}else {
			int wordLength = word.length();
			int toMakeWordEven = wordLength -1;
			int lengthOfFirstPart = (toMakeWordEven/2);		
			String oddMiddleChar = word.substring(lengthOfFirstPart,lengthOfFirstPart+1);
			return oddMiddleChar;
		}
		
		
		
	}

	
}
