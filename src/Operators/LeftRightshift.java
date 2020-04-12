package Operators;

public class LeftRightshift {

	public static void main(String[] args) {

		
		
		int a= 0b11101; // 1 1 0 0 1 = 25
		int b= 0b01111;//  0 1 1 1 1 = 15
		
		/// binary code converts machine language to human readable; 
		int c = a & b; 
		
		System.out.println("value of a is    : " +  a);
		System.out.println("value of b  is   : "+   b);
		System.out.println("value of c  is   : "+   c);
		
		
		int M,N;
		
		/// adding zeros                       
		
	 M = a >> 2; // right shift operator moves towards right with two places 0 0 1 1 1 = 7
	 N = b << 2; // left  shift operator moves towards left  with two places adding extra zeros  1 1 1 1 1 0 0 = 60 
	 
	 System.out.println("value of M is    : " +  M);
	 System.out.println("value of N is    : " +  N);

		
		
	}

}
