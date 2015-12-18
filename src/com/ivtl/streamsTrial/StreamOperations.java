package com.ivtl.streamsTrial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamOperations {
public static void main(String ...a){
	List<Integer> aList = new ArrayList<>();
	int x = 1;
	
	ArrayList<StringBuilder> arrlist1 = new ArrayList<StringBuilder>();

	   // use add for new value
	   arrlist1.add(new StringBuilder("Learning-"));

	   // using clone to affect the objects pointed to by the references.
	   ArrayList arrlist2 = (ArrayList) arrlist1.clone();
	for(;x<=100;x++){
		aList.add(x);
	}
	
	aList.stream().filter(s ->{ 
		System.out.println(s);
		return true;
}
	);
}
}
