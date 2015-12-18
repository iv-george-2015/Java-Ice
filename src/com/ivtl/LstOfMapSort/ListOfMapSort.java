package com.ivtl.LstOfMapSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ListOfMapSort {

	public static void main(String[] args) {
		
		ArrayList<Map<String,Integer>> lom = new ArrayList<>();
		
		HashMap<String, Integer> map =new HashMap<>();
		map.put("START_COLUMN", 17);
		map.put("END_COLUMN", 17);
		lom.add(map);
		
		HashMap<String, Integer> map1 =new HashMap<>();
		map1.put("START_COLUMN", 23);
		map1.put("END_COLUMN", 17);
		lom.add(map1);
		
		HashMap<String, Integer> map2 =new HashMap<>();
		map2.put("START_COLUMN", 7);
		map2.put("END_COLUMN", 17);
		lom.add(map2);
		
		HashMap<String, Integer> map3 =new HashMap<>();
		map3.put("START_COLUMN", 12);
		map3.put("END_COLUMN", 17);
		lom.add(map3);
		
		HashMap<String, Integer> map4 =new HashMap<>();
		map4.put("START_COLUMN", 25);
		map4.put("END_COLUMN", 17);
		lom.add(map4);
		
		HashMap<String, Integer> map5 =new HashMap<>();
		map5.put("START_COLUMN", 3);
		map5.put("END_COLUMN", 17);
		lom.add(map5);
		
		System.out.println(lom);
		
		Collections.sort(lom, new MyMapComparator());
		
		System.out.println(lom.toString());
	}

}

class MyMapComparator implements Comparator<Map<String,Integer>>{

	@Override
	public int compare(Map<String, Integer> o1, Map<String, Integer> o2) {
		if(o1.get("START_COLUMN") == o2.get("START_COLUMN") ){
			return 0;
		}
		else if(o1.get("START_COLUMN") > o2.get("START_COLUMN")){
			return 1;
		}
		else{
			return -1;
		}
	}
}
