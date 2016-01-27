package com.ivtl.LstOfMapSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMapSort {

	public static void main(String[] args) {
		
		ArrayList<Map<String,Integer>> lstOfMap = new ArrayList<>();
		
		HashMap<String, Integer> mapInst =new HashMap<>();
		mapInst.put("START_COLUMN", 17);
		mapInst.put("END_COLUMN", 17);
		lstOfMap.add(mapInst);
		
		HashMap<String, Integer> mapInst1 =new HashMap<>();
		mapInst1.put("START_COLUMN", 23);
		mapInst1.put("END_COLUMN", 17);
		lstOfMap.add(mapInst1);
		
		HashMap<String, Integer> mapInst2 =new HashMap<>();
		mapInst2.put("START_COLUMN", 7);
		mapInst2.put("END_COLUMN", 17);
		lstOfMap.add(mapInst2);
		
		HashMap<String, Integer> mapInst3 =new HashMap<>();
		mapInst3.put("START_COLUMN", 12);
		mapInst3.put("END_COLUMN", 17);
		lstOfMap.add(mapInst3);
		
		HashMap<String, Integer> mapInst4 =new HashMap<>();
		mapInst4.put("START_COLUMN", 25);
		mapInst4.put("END_COLUMN", 17);
		lstOfMap.add(mapInst4);
		
		HashMap<String, Integer> mapInst5 =new HashMap<>();
		mapInst5.put("START_COLUMN", 3);
		mapInst5.put("END_COLUMN", 17);
		lstOfMap.add(mapInst5);
		
		System.out.println(lstOfMap);
		
//		Collections.sort(lstOfMap, (o1,o2)->{
//			if(o1.get("START_COLUMN") == o2.get("START_COLUMN") ){
//				return 0;
//			}
//			else if(o1.get("START_COLUMN") > o2.get("START_COLUMN")){
//				return 1;
//			}
//			else{
//				return -1;
//			}
//		} );
		
		Collections.sort(lstOfMap,new StColSorter());
		
		System.out.println(lstOfMap.toString());
	}

}

class StColSorter implements Comparator<Map<String,Integer>>{

	@Override
	public int compare(Map<String, Integer> o1,
			Map<String, Integer> o2) {
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

