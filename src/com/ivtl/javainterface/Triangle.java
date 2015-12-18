package com.ivtl.javainterface;

public class Triangle implements Drawable{

	@Override
	public int returnCordinates() {
		System.out.println("executes logic to return 3 cordinates");
		return 3;
	}

}
