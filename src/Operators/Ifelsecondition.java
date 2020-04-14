package Operators;

import java.util.Scanner;

public class Ifelsecondition {

	public static void main(String[] args) {
		
		
		 Scanner num = new Scanner(System.in);
		 System.out.println("please enter the number :   ");
          int  a = num.nextInt();
		 
          {
		
		if (a%2 ==0)
		{
			System.out.println("enter the number is even ");
		}
			
		else 
		{
			System.out.println("enter the number is odd ");
		}
	
          }
          {
        	  int x, y, z;
        	  
        	  System.out.println("please enter the number X :   ");
                x = num.nextInt();
              System.out.println("please enter the number y :   ");
                y = num.nextInt();
              System.out.println("please enter the number Z :   ");
                z = num.nextInt();
        	  
        	 
        	  if (x>y && x>z )
        	  {
        		  System.out.println("Print X");
        	  }
        	  else if(y>z)
        	  {
        		  System.out.println("print Y ");
        	  }
        	  else
        	  {
        		  System.out.println("print Z ");
        	  }
        	  
        	  
        	  
        	  
        	  
          }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
