import java.util.Scanner;
public class question14 {
	public static void main(String[] args) {
		
		//user input of number
		Scanner input = new Scanner(System.in);  
		System.out.print("Enter the first number: ");         
		int n1 = input.nextInt();  
		System.out.print("Enter the second number: ");        
		int n2 = input.nextInt();  
		
		
		//logic for finding lcm of both numbers  
		int i;  
		//find the largest between two numbers n1 and n2 and assigns the large number to the variable a  
		int a =(n1 > n2)? n1 : n2;    
		for(i = a ; i <= n1*n2 ; i = i + a)  
		{  
		//returns true if both conditions are true  
		if(i % n1 == 0 && i % n2 == 0)  
		break;  
		}  
		//prints the result  
		System.out.println("LCM of "+n1+" and "+n2+" is: "+i);  
		
		
		input.close();
	}

}	
