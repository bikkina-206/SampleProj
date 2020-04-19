package Operators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class switchexamp {

	public static void main(String[] args) throws NumberFormatException, IOException
	
	{
    BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("emter number n : "  );		
		  int n = Integer.parseInt(re.readLine());
		  System.out.println("emter number num : "  );		
		  int num = Integer.parseInt(re.readLine());
		  
		  
		  
		
		switch(n)
		{
  case 1: 
  switch(num) 
		  {
		    case 10: 
		    System.out.println("statement 1");
		      break;
		      
		    case 20: 
		    	System.out.println("statement 2");
		      break;
		      
		    case 30: 
		    	System.out.println("statement 3");
		      break;
		      
		      default: 
		  }
		  
		  
		  break;
		    
		  // code to be executed if n = 2;
		  case 2:
			  System.out.println("statement 2");
		    break;
		  
		  // code to be executed if n = 3;
		  case 3: 
			  System.out.println("statement 3");
		    break;
		  
		   // code to be executed if n doesn't match any cases
		   default: 
		}
		
		
		{
		  
		 
		

		
			
				
			
		    System.out.println("emter number X : "  );		
			  int x = Integer.parseInt(re.readLine());
			  System.out.println("emter number Y : "  );		
			  int y = Integer.parseInt(re.readLine());
			
		  
		    // Outer Switch 
		    switch (x) { 
		  
		    // If x == 1 
		    case 1: 
		  
		        // Nested Switch 
		  
		        switch (y) { 
		  
		        // If y == 2 
		        case 2: 
		            printf( "Choice is 2"); 
		            break; 
		  
		        // If y == 3 
		        case 3: 
		            printf( "Choice is 3"); 
		            break; 
		        } 
		        break; 
		  
		    // If x == 4 
		    case 4: 
		        printf( "Choice is 4"); 
		        break; 
		  
		    // If x == 5 
		    case 5: 
		        printf( "Choice is 5"); 
		        break; 
		  
		    default: 
		        printf( "Choice is other than 1, 2 3, 4, or 5"); 
		        break; 
		    } 
		    return ; 
		}
		
	}

	private static int printf(String string) {
		return 0;
		// TODO Auto-generated method stub
		
	}		
		
	

}
