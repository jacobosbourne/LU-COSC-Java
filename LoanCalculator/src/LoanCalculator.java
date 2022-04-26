import java.util.Scanner;
public class LoanCalculator {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter interest rate: ");
	    double interest = input.nextDouble();
	    double monthlyinterest = interest / 1200;
		
	    System.out.print("Enter number of years: ");
	    double years = input.nextDouble();
	    double month = years * 12;
		
	    System.out.print("Enter loan amount: ");
	    double loan = input.nextDouble();
	    
	    double monthlypayment = loan * monthlyinterest / (1 - 1 / Math.pow(1 + monthlyinterest, month));
	    double totalpayment = monthlypayment * month;
	    
	    System.out.println("Monthly Payment is " + monthlypayment);
	    System.out.println("Total payment is " + totalpayment);
	    
	    
	    input.close();
		
	}
}
