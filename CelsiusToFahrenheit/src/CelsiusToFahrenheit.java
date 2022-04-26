//********************************** 
// COSC 1173 Programming Lab
// Name: Jacob Osbourne
// Date: 10/13/2021
//  Celsius to Fahrenheit
//******************************

import java.util.Scanner;
public class CelsiusToFahrenheit {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please input the temperature in Celsius:  ");
	    double celsius = input.nextDouble();
	    
	    double fahrenheit = celsiusToFahrenheit(celsius);
		
	    System.out.println(celsius + " Celsius equals to " + fahrenheit + " fahrenheit.");
	   
	   
	    input.close();
		
	}
	
	// convers from Celsius to Fahrenheit
	public static double celsiusToFahrenheit (double celsius) {
		return (9.0 / 5.0) * celsius + 32;
		
	}

}
