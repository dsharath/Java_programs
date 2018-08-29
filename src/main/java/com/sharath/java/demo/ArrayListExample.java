package com.sharath.java.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
	List<String> animals = new ArrayList<>();
	
	
	animals.add("Lion");
	animals.add("cat");
	animals.add("kishore");
	animals.add("donkey");
	
	System.out.println("Animals are: "+animals +"\nSize is: "+animals.size());
	
	List<String> items = new ArrayList<>();
	items.add("fan");
	items.add("can");
	items.add("tan");
	
	System.out.println("itemss are: "+items +"\nSize is: "+items.size());
	
	Iterator<String> it = animals.iterator();
	while(it.hasNext()) {
		String s = it.next();
		System.out.println("\n"+s);
	}
	
	for(String s: animals) {
	System.out.println("\n"+s);
	}
	
	System.out.println("\n next iterations:");
	
	List<String> adl = new ArrayList<>();
	adl.addAll(animals);
	adl.addAll(items);
	
	System.out.println(adl);
	
	for(String gopi: adl) {
		
		System.out.println("names of things..."+gopi+
				"  number of items in total.."+adl.size());
	}
	
	
	System.out.println("using list iterator in down cases");
	
	ListIterator sof = adl.listIterator(adl.size());
	
	while(sof.hasPrevious()) {
		
		System.out.println(sof.previous());
	}

	
	}
	
	

}
