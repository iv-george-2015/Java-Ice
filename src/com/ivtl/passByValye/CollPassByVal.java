package com.ivtl.passByValye;

import java.util.ArrayList;

public class CollPassByVal {

	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<>();           // ref memory address of obj = 001
		System.out.println("sysout - 1 : "+alist.toString());  //obj at memory address 001 is empty
		alist.add("x");
		alist.add("y");
		alist.add("z");                                        // obj at memory address 001 has values x,y,z
		addAlphabets(alist);
	}

	//in case of objects the memory address value is passed . 
	public static void addAlphabets(ArrayList<String> al){ // ref memory address of al is 001 
		
//		step - 1
		al.add("a");  //obj at 001 address changed
		al.add("b");  //obj at 001 address changed
		al.add("c");  //obj at 001 address changed
		al.add("d");  //obj at 001 address changed
		al.add("e");  //obj at 001 address changed
		al.add("f");  //obj at 001 address changed
		
		System.out.println("sysout - 2 : "+al);  //obj at 001 address printed
		
//		Step-2
		ArrayList<String> locAl = new ArrayList<>(); // ref memory address of obj = 002
		locAl.add("g");  //obj at 002 address changed
		locAl.add("h");  //obj at 002 address changed
		locAl.add("i");  //obj at 002 address changed
		locAl.add("j");  //obj at 002 address changed
		locAl.add("k");  //obj at 002 address changed
		locAl.add("l");  //obj at 002 address changed
		
    	al = locAl; // address value in al is changed to 002
		
		System.out.println("sysout - 3 : "+al.toString());  //obj at 002 address printed
		
		al.add("g"); //obj at 002 address changed
		al.add("h"); //obj at 002 address changed
		al.add("i"); //obj at 002 address changed
		al.add("j"); //obj at 002 address changed
		al.add("k"); //obj at 002 address changed
		al.add("l"); //obj at 002 address changed
		
		System.out.println("sysout - 4 : "+al.toString());    //obj at 002 address printed
	    System.out.println("sysout - 5 : "+locAl.toString()); //obj at 002 address printed
	} 
}
