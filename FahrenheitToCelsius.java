import java.util.Scanner;
public class FahrenheitToCelsius{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter degrees in Fahrenheit");

		float fahrenheitDegree = input.nextInt();
		int celsius = -32;

		System.out.println(fahrenheitDegree+" Fahrenheit degrees will be equivilant to "+(fahrenheitDegree+celsius)*5/9+" Celsius.");






	}

}