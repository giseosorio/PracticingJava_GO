package com.javatutorial;

public class LoopsConditionals {

	public void Marks (int mark){		
		if(mark >= 70)
			System.out.println("Passed");
		else
			System.out.println("Failed");
	}

	public void Order (int a, int b, int c) {	
		System.out.println("Sort number descending: " + a + ", " + b + ", " + c);
		if(a>=b && b>=c)
			System.out.println( a + ", " + b + ", " + c);
		else if(a>=c && c>=b)
			System.out.println( a + ", " + c + ", " + b);
		else if(b>=a && a>=c)
			System.out.println( b + ", " + a + ", " + c);
		else if(b>=c && c>=a)
			System.out.println( b + ", " + c + ", " + a);
		else if(c>=a && a>=b)
			System.out.println( c + ", " + a + ", " + b);
		else 
			System.out.println( c + ", " + b + ", " + a);
	}
	
}
