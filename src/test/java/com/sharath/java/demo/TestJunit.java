package com.sharath.java.demo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sharath.java.testcases.MessageUtil;

public class TestJunit {
	
	String message = "Hello World!!!";
	
	MessageUtil messageUtil = new MessageUtil(message);
	

	@Test
	public void testPrintMessage() {
		
		//changing the messgae to fail test casse
		message = "New word";
		
		assertEquals(message, messageUtil.printMessage());;
	}

}
