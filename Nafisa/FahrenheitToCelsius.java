import java.util.Scanner;

public class FahrenheitToCelsius{ 
 public static void main(String[] args) {

 	Scanner input = new Scanner(System.in);

 	System.out.println("Please, enter degree in Fahrenheit: ");

 	double degree = input.nextDouble();

 	System.out.println("It is: "+(degree-32)*5/9+" in Celsius");
 }

}