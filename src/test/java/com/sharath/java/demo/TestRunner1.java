package com.sharath.java.demo;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner1 {

	public static void main(String[] args) {
		
		
		Result result = JUnitCore.runClasses(TestJunit1.class);
		
		for(Failure failre : result.getFailures()) {
			
			System.out.println(failre.toString());
		}
		
		System.out.println(result.wasSuccessful());
		
		

	}

}
