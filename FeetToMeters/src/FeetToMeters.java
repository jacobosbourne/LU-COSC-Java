import java.util.Scanner;
public class FeetToMeters {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a vaule for feet: ");
	    double feet = input.nextDouble();
	    
	    double meter = feet * 0.3048;
	    
	    System.out.println(feet + " feet is " + meter + " meters");
	    
	    input.close();
	}
}
