package com.ivtl.javainterface;

import java.util.ArrayList;
import java.util.List;

public class Pentagon implements Drawable{

	@Override
	public List<String> getCoordinates() {
		System.out.println("Reading logic from input elements specific to pentagon ");
		ArrayList<String> cordinateslist = new ArrayList<>();
		cordinateslist.add("0,1");
		cordinateslist.add("0,50");
		cordinateslist.add("1,1");
		cordinateslist.add("2,10");
		cordinateslist.add("8,10");
		return cordinateslist;
	}
}
