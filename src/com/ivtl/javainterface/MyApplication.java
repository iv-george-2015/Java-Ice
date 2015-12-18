package com.ivtl.javainterface;


public class MyApplication {

	public static void main(String... geo){
		Drawable d = new Triangle();
		Painter p = new Painter(d);
		p.getTheCordinatesAndDrawShape();
		
		Drawable d1 = new Pentagon();
		Painter p1 = new Painter(d1);
		p1.getTheCordinatesAndDrawShape();
		
	}
}

class Painter {
	Drawable drawable;
	public Painter(Drawable drawable) {
		this.drawable = drawable; 
	} 
	
	public void getTheCordinatesAndDrawShape(){
		int x = this.drawable.returnCordinates();
		System.out.println("joins the "+x+" cordinates and draws the shape");
	}
	
}
