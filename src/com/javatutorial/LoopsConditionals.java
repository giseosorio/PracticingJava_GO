package com.javatutorial;

public class LoopsConditionals {

	public void Marks (int mark){
		System.out.println("------------------");
		if(mark >= 70)
			System.out.println("Passed");
		else
			System.out.println("Failed");
		System.out.println("------------------");
	}

	public void Order (int a, int b, int c) {	
		System.out.println("------------------");
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
		System.out.println("------------------");
	}
	
	public void PrintTable(int d){		
		System.out.println("------------------");
		System.out.println(d + " Table");
		for(int i=1; i <= 10; i ++) {
			System.out.println(d + " x " + i + " = " + d*i);			
		}
		System.out.println("------------------");
	}
	
	public void PrintAsterisk(int row) {
		System.out.println("------------------");
		System.out.println("Print asteriks");
		
		for (int i = 1; i <= row; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
