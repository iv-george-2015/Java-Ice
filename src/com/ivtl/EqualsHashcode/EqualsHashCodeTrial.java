package com.ivtl.EqualsHashcode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * * Person class with equals and hashcode implementation in Java * 
 * @author A.S.George
 * 
 */
class Person {
	Person(int id,String firstName,String lastName){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	private int id;
	private String firstName;
	private String lastName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Person guest = (Person) obj;
		return (id == guest.id)
				&& (firstName == guest.firstName || (firstName != null && firstName
						.equals(guest.getFirstName())))
				&& (lastName == guest.lastName || (lastName != null && lastName
						.equals(guest.getLastName())));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}
}

public class EqualsHashCodeTrial{
	public static void main(String args[]){
		testPersons(); // As Person class properly overrides 'hashCode' method . 
					   //It returns same value's for objects generated by both loops  
		
		testForStringBuffers(); //Creates StringBuffer objects with different values as it does not adher to .equals contract. 
		
		testHashset(); //Set should not accept duplicates by convention but it accepts . 
		
		testHashMapKey();//HashMap should not accept duplicate keys but it accepts . 
		
	}
	
	
	public static void testPersons(){
		for(int i=1;i<10;i++){
			Person p = new Person(i, "firstName"+i, "lastName"+i);
			System.out.println(p.hashCode());
		}
		
		System.out.println("-------------------------------------------------------------------");
		for(int i=1;i<10;i++){
			Person p = new Person(i, "firstName"+i, "lastName"+i);
			System.out.println(p.hashCode());
		}
	}
	
	public static void testForStringBuffers(){
		System.out.println("String buffers hash codes generated for same string :::::::::");
		for(int i=1;i<10;i++){
			StringBuffer str = new StringBuffer("firstName");
			System.out.println(str.hashCode());
		}
		
		System.out.println("Same valued String buffers are not equal ::::::::::");
		StringBuffer str1 = new StringBuffer("10");
		StringBuffer str2 = new StringBuffer("10");
		System.out.println("Compared result using .equals - "+str1.equals(str2));
		
	}
	
	public static void testHashset(){
		//HashSet accepting duplicates when adding string buffers . 
		System.out.println("HashSet accepting duplicates of SBuffer.");
		StringBuffer str1 = new StringBuffer("10");
		StringBuffer str2 = new StringBuffer("10");
		
		HashSet<StringBuffer> hSet = new HashSet<>();
		hSet.add(str1);
		hSet.add(str2);
		
		System.out.println(hSet);
		
		//HashSet doesn't accept duplicates when adding string buffers .
		try {
			String strn1 = "10";
			String strn2 = "10";
			String strn3 = "10";
			String strn4 = "10";
			String strn5 = "10";
			String strn6 = "10";
			
			HashSet<String> hSet1 = new HashSet<>();
			hSet1.add(strn1);
			hSet1.add(strn2);
			hSet1.add(strn3);
			hSet1.add(strn4);
			hSet1.add(strn5);
			hSet1.add(strn6);
			
			System.out.println("When strings are added Prints only one value as duplicates are not added :  "+hSet1);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("strings adhere to hashcode contract so cant be added");
		}
	}
	
	public static void testHashMapKey(){
//		Hashmap cannot 
		HashMap<StringBuffer, StringBuffer> hMap = new HashMap<>();
		hMap.put(new StringBuffer("10"), new StringBuffer("10"));
		hMap.put(new StringBuffer("10"), new StringBuffer("11"));
		hMap.put(new StringBuffer("10"), new StringBuffer("12"));
		hMap.put(new StringBuffer("10"), new StringBuffer("13"));
		hMap.put(new StringBuffer("10"), new StringBuffer("14"));
		hMap.put(new StringBuffer("10"), new StringBuffer("15"));
		hMap.put(new StringBuffer("10"), new StringBuffer("16"));
		System.out.println(hMap);
		
		
//		when duplicate is added as key the value is replaced . 
		HashMap<String, String> dupHmap = new HashMap<>();
		dupHmap.put("123","001");
		dupHmap.put("123","002");
		System.out.println(dupHmap);
	}
	
}