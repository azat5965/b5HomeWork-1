package sunDay;

import java.util.Scanner;

public class FahrenheitToCelcius {

    public static void main(String[] args) {
    
         double celsius; 
         double fahrenheit;
        Scanner temp = new Scanner(System.in);
       
        System.out.print("Enter temperature in Fahrenheit:");
        
        fahrenheit = temp.nextDouble();
        
        celsius = (fahrenheit-32)*(0.5556);
        
        System.out.println("Temperature in Celsius:"+celsius);
    }
}
