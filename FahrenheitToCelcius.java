import java.util.Scanner;

		public class FahrenheitToCelcius {
			public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter degree in Fahrenheit" );

		float num1 = input.nextInt();	

		System.out.println("It is " +( (num1-32)*5/9 )+    
			" in Celsius " );

	}
}