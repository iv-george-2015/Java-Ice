package com.ivtl.javainterface;

import java.util.ArrayList;
import java.util.List;

public class Triangle implements Drawable{

	@Override
	public List<String> getCoordinates() {
		System.out.println("Reading logic from input elements specific to pentagon ");
		ArrayList<String> cordinateslist = new ArrayList<>();
		cordinateslist.add("2,13");
		cordinateslist.add("2,58");
		cordinateslist.add("9,15");
		return cordinateslist;
	}
}
