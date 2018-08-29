package com.sharath.java.demo;

public class SingletonMain {

	public static void main(String[] args) {
		
		Singleton x = Singleton.Singleton();
		
		
		Singleton y = Singleton.Singleton();
		
		Singleton z = Singleton.Singleton();
		
		x.a = (x.a).toUpperCase();
		
		 System.out.println("String from x is " + x.a);
		 System.out.println("String from y is " + y.a);
		 System.out.println("String from z is " + z.a);
		 
		 System.out.println("changing things here ");
		 
		 z.a = (z.a).toLowerCase();
		 
		 System.out.println("String from x is " + x.a);
		 System.out.println("String from y is " + y.a);
		 System.out.println("String from z is " + z.a);
		 
		

	}

}
