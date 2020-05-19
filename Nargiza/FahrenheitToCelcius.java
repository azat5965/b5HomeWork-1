package Operators;
import java.util.Scanner;

public class FahrenheitToCelcius{
	
	
	    public  static void main(String[]args){
	         //(32'F -32) * 5/9 = 0'C

	        Scanner input = new Scanner(System.in);

	        System.out.println("Please enter your F degree");

	        float F = input.nextFloat();
	        float C = (F - 32)*5/9;
	        System.out.println("Result in C " + C);

}
}