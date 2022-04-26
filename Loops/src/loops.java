//********************************** 
// COSC 1173 Programming Lab
// Name: Jacob Osbourne
// Date: 10/6/2021
// Loops
//******************************

public class loops {
	public static void main(String[] args) {
		
		System.out.println("Sample 1:");

		int count;  
		count  =  10;       
		
		while(count > 0) {
			 
			System.out.println(count); 
		
			count = count - 1;
			
		}
		
		System.out.println("");
		System.out.println("Sample 2:");
		
		int count2;      
		count2  =  10; 
		
		while(count2 > 1) {
	 
			System.out.println(count2); 
		
			count2 = count2 - 2;
				
		}
		
		System.out.println("");
		System.out.println("Sample 3:");
		
		int count3;       
		count3  =  1; 
		
		System.out.println("1");
		
		while(count3 <= 7) { 
			
			System.out.println(count3 * 3); 
		
			count3 = count3 + 1;
				
		}
		
		
	}
}
