package Operators;

import java.io.IOException;
import java.util.Scanner;

public class booleanMethods {
	
	
    public static int age;

	public static  boolean IsTeen(int age)
	{	
		if(age>= 13 && age <= 18 )
		{
			return  true;
			
		}
		else 
		{
			return  false;
		}
	}

	
	public static void main(String[] args) throws NumberFormatException, IOException {

		
	do
	{
		 Scanner age = new Scanner(System.in);
		System.out.println("please enter the teenage:   ");
		age.nextInt();

	} 		
	while(   IsTeen(age)  );
	
   System.out.println("Thank you");
	
//   nextBoolean()   	Reads a boolean value from the user
//   nextByte()     	Reads a byte value from the user
//   nextDouble()	    Reads a double value from the user
//   nextFloat()	    Reads a float value from the user
//   nextInt()	        Reads a int value from the user
//   nextLine()	        Reads a String value from the user
//   nextLong()	        Reads a long value from the user
//   nextShort()	    Reads a short value from the user
   
   
	}

}
