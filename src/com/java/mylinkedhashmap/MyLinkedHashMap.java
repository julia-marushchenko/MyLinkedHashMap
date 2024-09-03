package com.java.mylinkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyLinkedHashMap {
	
	public static void main(String str []) {
		
		//Creating LinkedHashMap with generic type Long
		LinkedHashMap<Integer, String> myLinkedHashMap = new LinkedHashMap<>();
		
		//Checking if myLinkedHashMap has no elements
		System.out.println("Is myLinkedHashMap empty: " + myLinkedHashMap.isEmpty());

		//Checking size of myLinkedHashMap
		int size = myLinkedHashMap.size();
		System.out.println("myLinkedHashMap size is " + size);
		
		//Adding elements to myLinkedHashMap
		myLinkedHashMap.put(0, "Coffee");
		myLinkedHashMap.put(1, "Tea");
		myLinkedHashMap.put(2, "Water");
		myLinkedHashMap.put(3, "Cola");
		myLinkedHashMap.put(4, "Juice");
		myLinkedHashMap.put(8, "Lemonade");
		myLinkedHashMap.put(6, "Soda");
		myLinkedHashMap.put(7, "Bier");
		
		//Printing elements of myLinkedHashMap to console
		System.out.println(myLinkedHashMap.toString());
		
		//Removing element with key 3 and value Cola
		myLinkedHashMap.remove(3);
		
		//Printing elements of myLinkedHashMap to console
		System.out.println(myLinkedHashMap.toString());
		
		//Printing element with key = 2
		System.out.println("Element with key 2 is " +  myLinkedHashMap.get(2)); // Water
		
		//Printing element with key = 6
		System.out.println("Element with key 6 is " + myLinkedHashMap.get(6)); // Soda
		
		//Printing element with key = 12
		System.out.println("Element with key 12 is " + myLinkedHashMap.get(12)); // null
		
		//Checking if myLinkedHashMap has key 100
		System.out.println("Is in myLinkedHashMap key = 100: " + myLinkedHashMap.containsKey(100));
		
		//Checking if myLinkedHashMap has key 1
		System.out.println("Is in myLinkedHashMap key = 1: " + myLinkedHashMap.containsKey(1));
				
		//Checking if myLinkedHashMap has key 7
		System.out.println("Is in myLinkedHashMap key = 7: " + myLinkedHashMap.containsKey(7));
		
		//Checking if myLinkedHashMap has value Lemonade
		System.out.println("Is in myLinkedHashMap value = Lemonade: " + myLinkedHashMap.containsValue("Lemonade"));
		
		//Checking if myLinkedHashMap has value Snaps
		System.out.println("Is in myLinkedHashMap value = Lemonade: " + myLinkedHashMap.containsValue("Snaps"));
		
		//Checking size of myLinkedHashMap
		size = myLinkedHashMap.size();
		System.out.println("myLinkedHashMap size is " + size);
		
		//Checking if myLinkedHashMap has no elements
		System.out.println("Is myLinkedHashMap empty: " + myLinkedHashMap.isEmpty());
		
		//Printing myLinkedHashMap nicely
		System.out.println("        myLinkedHashMap       ");
		for (Map.Entry<Integer, String> set : myLinkedHashMap.entrySet()) {
			System.out.println("Key is: " + set.getKey() + " and Value is: " + set.getValue());
		}
	}

}
