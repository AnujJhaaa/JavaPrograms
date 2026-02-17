package com.codegnan.javaapp17022026.program;

import java.util.ArrayList;
import java.util.Iterator;

public class BoxingDowncasting {
	public static void main(String[] args) {
		
		//Boxing --> Wrapping data in Objects using Wrapper Classes to pass and store in Collections.
		Integer i = new Integer(10);
		Double d = new Double(99.11);
		Character c = new Character('a');
		Boolean b = new Boolean(true);
		String s = "testString";
		
		ArrayList list1 = new ArrayList();
		list1.add(i);
		list1.add(d);
		list1.add(c);
		list1.add(b);
		list1.add(s);
		System.out.println(list1);
		
		//AutoBoxing --> Wrapping of data in Objects using Wrapper Classes implicitly.
		Integer i2 = 20;
		Double d2 = 20.20;
		Character c2 = 'D';
		Boolean b2 = false;
		String s2 = "testString";
		
		ArrayList list2 = new ArrayList();
		list2.add(i);
		list2.add(d);
		list2.add(c);
		list2.add(b);
		list2.add(s);
		System.out.println(list2);
		
		//Iterable Object
		Iterator iterator = list1.iterator();
		
		while(iterator.hasNext()) {
			Object obj = iterator.next(); // returns as object
			
			//DownCasting --> Converting Parent class object into Child class object 
			if(obj instanceof Integer) {
				Integer object = (Integer)obj;
				System.out.println(object);
			}
			else if(obj instanceof Double) {
				Double object = (Double)obj;
				System.out.println(object);
			}
			else if(obj instanceof Character) {
				Character object = (Character)obj;
				System.out.println(object);
			}
			else if(obj instanceof Boolean) {
				Boolean object = (Boolean)obj;
				System.out.println(object);
			}
			else if(obj instanceof String) {
				String object = (String)obj;
				System.out.println(object);
			}
			
		}
		
		Iterator iterator2 = list2.iterator();
		while(iterator2.hasNext()) {
			Object obj = iterator2.next(); // returns as object
			
			//Auto-UnBoxing --> DownCasting done implicitly.
			if(obj instanceof Integer) {
				int var = (Integer)obj;
				System.out.println(var);
			}
			else if(obj instanceof Double) {
				double var = (Double)obj;
				System.out.println(var);
			}
			else if(obj instanceof Character) {
				char var = (Character)obj;
				System.out.println(var);
			}
			else if(obj instanceof Boolean) {
				boolean var = (Boolean)obj;
				System.out.println(var);
			}
			else if(obj instanceof String) {
				String var = (String)obj;
				System.out.println(var);
			}
		}	
	}
}
