//********************************** 
// COSC 1173 Programming Lab
// Name: Jacob Osbourne
// Date: 9/8/2021
// Convert pounds into Kilograms
//**********************************


import java.util.Scanner;
public class Poundstokilo {
	public static void main(String[] args) {
			
		// Create a Scanner object
	    Scanner input = new Scanner(System.in);
	    
	    // Prompt the user to enter pounds
	    System.out.print("Enter a number in pounds: ");
	    double pounds = input.nextDouble();
		
	    //compute kilograms
	    double kilograms = 0.45 * pounds;
	    
	    // Display result
	    System.out.println("Equals to " + kilograms + " kilograms");
	    
	    input.close();
	    
	}
}
