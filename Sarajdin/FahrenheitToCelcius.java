import java.util.Scanner;
public class FahrenheitToCelcius{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter degree in Fahrenheit.");

		int fDegree = input.nextInt();
		double cDegree;

		cDegree= (((fDegree-32)*5)/9);
		System.out.println(cDegree);

	}
}