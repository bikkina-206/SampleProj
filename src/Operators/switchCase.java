package Operators;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class switchCase {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
	//Use the BufferedReader Class and wrap it with the InputStreamReader Class.

             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    //string str = br.readLine();     //for string input
             System.out.println("emter number  : "  );
		    int day = Integer.parseInt(br.readLine()); // for Integer Input
		
		 
		 
		switch (day)
		{
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		  default:
			    System.out.println("Looking forward to the Weekend");
			
			
		
		
		    }
		
		{
			
			String str = br.readLine();

			

			int num , num2;
			String str1[] = new String[2];

			System.out.print("Please Enter Your First Number:");
			str1[0] = br.readLine();
			System.out.print("Please Enter Your Second Number:");
			str1[1] = br.readLine();

			num = Integer.parseInt(str1[0]);
			num2 = Integer.parseInt(str1[1]);
		}
		
	}

		
}

	

