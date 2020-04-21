package Operators;

public class LabeledBreakStatement {

	public static void main(String[] args) {

		// break ;   un labled break statement
		
		anthem :
		for (int i =1; i< 4; i ++)
		{
			for (int j=1; j <=4; j++	)
			{
				if (i ==3)
					break anthem; /// labeld  break statement;
				System.out.print("*");
			}
			System.out.println("");
		}
	
	
}

}