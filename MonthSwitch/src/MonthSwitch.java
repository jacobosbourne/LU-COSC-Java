//********************************** 
// COSC 1173 Programming Lab
// Name: Jacob Osbourne
// Date: 9/22/2021
// Month switch
//**********************************


import java.util.Scanner; 
public class MonthSwitch {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please input an integer between 1 to 12: ");
	    int MonthNumber = input.nextInt();
	    
	    switch(MonthNumber) {
	    	case 1:
	    		System.out.println("The month is: January");
	    		break;
	    	case 2:
	    		System.out.println("The month is: Febuary");
	    		break;
	    	case 3:
	    		System.out.println("The month is: March");
	    		break;
	    	case 4:
	    		System.out.println("The month is: April");
	    		break;
	    	case 5:
	    		System.out.println("The month is: May");
	    		break;
	    	case 6:
	    		System.out.println("The month is: June");
	    		break;
	    	case 7:
	    		System.out.println("The month is: July");
	    		break;
	    	case 8:
	    		System.out.println("The month is: August");
	    		break;
	    	case 9:
	    		System.out.println("The month is: September");
	    		break;
	    	case 10:
	    		System.out.println("The month is: October");
	    		break;
	    	case 11:
	    		System.out.println("The month is: November");
	    		break;
	    	case 12:
	    		System.out.println("The month is: December");
	    		break;	
	    	default:
	    	System.out.println(MonthNumber + " is an invalid integer");
	    
	    }
		
	    input.close();	
		
	}
}
