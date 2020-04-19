package lops;

public class Forloop {

	public static void main(String[] args) {

		//for (statement 1; statement 2; statement 3) {
			  // code block to be executed }
		
//		Statement 1 is executed (one time) before the execution of the code block.
//
//		Statement 2 defines the condition for executing the code block.
//
//		Statement 3 is executed (every time) after the code block has been executed.

		int i = 1;
		
		{
			 System.out.println(i);
			// i++;
			 ++i;
			 System.out.println(i);
		}
		{
			for (int j = 1; j <10; j++) {
				  System.out.println(j);
				}
			
		}
		{
			for (int k = 1; k <= 10; k = k + 2) {
				  System.out.println(k);
				}
		}


		
		
		
		

	}

}
