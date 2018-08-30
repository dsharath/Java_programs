package com.sharath.java.demo;

import java.util.LinkedList;

public class LinkedtoArrayListConvertion {

	public static void main(String[] args) {

		LinkedList<String> linkedlist = new LinkedList<String>();
		
		
		linkedlist.add("pig");
		linkedlist.add("dog");
		linkedlist.add("owl");
		linkedlist.add("buffalo");
		linkedlist.add("cat");
		
		System.out.println(" things in list "+linkedlist);
		System.out.println(" things in list "+linkedlist.size());
		
		//coverting linkedlist to arraylist
		
		String[] array = linkedlist.toArray(new String[linkedlist.size()]);
		
		System.out.println("things added to arraylist ");
		
		for(String s: array) {
			System.out.println("\n"+s);
			}
			

		
	}

}
