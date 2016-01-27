package com.ivtl.methodref;

import java.util.ArrayList;
import java.util.List;

public class MethodRefTrial {
public static void main(String args[]){
List<String> aList = new ArrayList<String>();
int x = 1;
for(;x<=10;x++){
	aList.add(x+" - String");
}
aList.forEach(System.out::println);

}
}
