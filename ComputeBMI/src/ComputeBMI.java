//********************************** 
// COSC 1173 Programming Lab
// Name: Jacob Osbourne
// Date: 9/15/2021
// Compute BMI
//******************************


import java.util.Scanner;
public class ComputeBMI {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your weight in pounds: ");
	    double weight = input.nextDouble();
		
	    System.out.print("Enter height in inches: ");
	    double height = input.nextDouble();
	    
	    //BMI = (weight in pounds*0.45) / ( (height in inches * 0.025) * (height in inches * 0.025) )
	    double BMI = (weight * 0.45) / ((height * 0.025) * (height * 0.025));
	    
	    System.out.println("BMI is: " + BMI);
	   
	    
	    input.close();
		
	}

}
