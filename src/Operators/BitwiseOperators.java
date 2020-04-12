package Operators;

public class BitwiseOperators {

	public static void main(String[] args) {

		int i = 25 ; // 1 1 0 0 1     it to check bit  wise in I and J
		int j = 15 ; // 0 1 1 1 1
		            //=============
		            //  0 1 0 0 1 ==>> 9    &   and operator
		           //-----------------------------------------
		           //   1 1 1 1 1 ===> 31    |  or operator
		
		
		int and = i & j; // check bit to bit AND operator
		
		int or = i | j; // check bit to bit AND operator
		
		
		
		
		
		
		int a= 0b11001;
		int b= 0b01111;/// bilateral converts machine language to human readable; 
		int c = a & b; 
		
		System.out.println("value of a is    : " +  a);
		System.out.println("value of b  is   : "+   b);
		System.out.println("value of c  is   : "+   c);
		
		System.out.println("The vlaue of both i&j and a & b is :  "  +   (i+j) +"  :   "+(a+b));
		
		System.out.println("value of k  is   : "+   and);
		System.out.println("value of k  is   : "+   or);
		
		
	}

}
