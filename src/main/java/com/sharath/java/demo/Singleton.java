package com.sharath.java.demo;

public class Singleton {

	private static Singleton single_instance = null;
	
	public String a;
	
	private Singleton() {
		
		a="Hello these is a singleton class!!!";
	}
	
	static Singleton getInstance() {
		
		if (single_instance == null)
			single_instance= new Singleton();
		return single_instance;
		
	}
	
	
	public static Singleton Singleton() {
		
		if (single_instance == null) {
			
			single_instance = new Singleton();
		}
		
		return single_instance;
		
		
	}
	
}
