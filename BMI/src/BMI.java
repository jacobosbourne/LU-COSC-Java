//********************************** 
// COSC 1173 Programming Lab
// Name: Jacob Osbourne
// Date: 9/14/2021
// BMI
//**********************************


import java.util.Scanner; 
public class BMI {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please input your BMI: ");
	    double BMI = input.nextDouble();
	    
	    if(BMI < 18.5) {
	    	System.out.println("Your weight status is: Underweight");
	    }
	    else if(BMI >= 18.5 && BMI < 25.0) {
	    	System.out.println("Your weight status is: Normal");
	    }
	    else if(BMI >= 25.0 && BMI < 30) {
	    	System.out.println("Your weight status is: Overweight");
	    }
	    else if(BMI >= 30) {
	    	System.out.println("Your weight status is: Obese");
	    }
	    
	    
		input.close();
	}

}
