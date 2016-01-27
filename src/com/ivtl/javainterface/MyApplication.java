package com.ivtl.javainterface;

import java.util.ArrayList;
import java.util.Scanner;


public class MyApplication {
	public static void main(String... geo){
		Drawable d = null;
	    Shape sp = MyApplication.getUserInput(); 
	    switch (sp) {
		case Triangle:
			d = new Triangle();
			break;
		case Pentagon:
			d = new Pentagon();
			break;
		default:
			d = new Pentagon();
			break;
		}
		
		 Painter pe = new Painter(d);
		    pe.getTheCordinatesAndDrawShape();
		
}
	
	public static Shape getUserInput(){
		String userinput;
		Scanner in = new Scanner(System.in);
	    System.out.println("Enter your choice : ");
	    userinput = in.nextLine();
	    Shape sp = null;
	    switch(userinput){
	    case "T":
	    	sp = Shape.Triangle;
	    break;
	    case "P":
	    	sp = Shape.Pentagon;
	    break;
	    case "R":
	    	sp = Shape.Rectangle;
	    break;
	    }
	   
	    return sp;
	}
}

class Painter {
	Drawable drawable;
	public Painter(Drawable drawable) {
		this.drawable = drawable; 
	} 
	
	public void getTheCordinatesAndDrawShape(){
		ArrayList<String>  al = (ArrayList<String>) drawable.getCoordinates();
		for(String str : al){
			System.out.println(str);
		}
	}
	
}

enum Shape{
	Triangle ,
	Rectangle,
	Pentagon
}
