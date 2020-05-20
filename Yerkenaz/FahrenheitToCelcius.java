import java.util.Scanner;


public class FahrenheitToCelcius {
	


public static void main (String [] args){
	Scanner input = new Scanner (System.in);
	System.out.println ("Please enter degree in Fanrenheit: "); 
	double degreeInFarenheit = input.nextDouble(); 
    
    double celcius = (degreeInFarenheit - 32) * 5/9; 

	System.out.println (" It is " + celcius + " in Celsius"); 

// (70°F − 32) × 5/9 = 21.111°C



/*  Yerkenazs-Air:Day2 yerkenazbayetova$ java FahrenheitToCelcius
Please enter degree in Fanrenheit: 
70
 It is 21.0 in Celsius */

}

}