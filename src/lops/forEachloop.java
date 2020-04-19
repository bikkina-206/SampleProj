package lops;

import java.util.ArrayList;

public class forEachloop {

	
	public static void main(String[] args) {
		
	
		//for (type variableName : arrayName) {
			  // code block to be executed    }
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars)
		{
		  System.out.println(i);
		}
		
		
		  ArrayList<String> list=new ArrayList<String>();  
		   list.add("vimal");  
		   list.add("sonoo");  
		   list.add("ratan");  
		   //traversing the list of elements using for-each loop  
		   for(String s:list){  
		     System.out.println(s);  
		   } 
		
		
		
		
		
		
	}
}




