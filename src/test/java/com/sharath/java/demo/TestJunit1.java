package com.sharath.java.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJunit1 {

	@Test
	
	public void testAdd() {
		//test data
		int num = 5;
		String temp =null;
		String str = "Junit is working good:::";
		
		//check for equality
		
		assertEquals("Junit is working good:::", str);
		
		// checking for false condition
		
		assertFalse(num>6);
		
		//check for not null value
		
		assertNotNull(str);
	}
	

}
