package Operators;

import java.util.Scanner;

//Print the largest number 
public class TrenanryOperators {

	public static void main(String[] args) {

		//variable = Expression1 ? Expression2: Expression3
		
		Scanner num = new Scanner(System.in);
       	 System.out.println("please enter the number :   ");
         int  n1 = num.nextInt();
         int  n2 = num.nextInt();
         int  result;
      
        System.out.println("First num: " + n1); 
        System.out.println("Second num: " + n2); 
        result = (n1 > n2) ? (n1 + n2) : (n1 - n2); 
        System.out.println("Result = " + result); 
        
        
        int  max;
        // Largest among n1 and n2 
        max = (n1 > n2) ? n1 : n2; 
  
        // Print the largest number 
        System.out.println("Maximum is = " + max); 
        
        
    } 
 

	
}
		
		
	

