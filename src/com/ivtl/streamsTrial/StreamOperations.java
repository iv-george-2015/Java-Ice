package com.ivtl.streamsTrial;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamOperations {
	public static void main(String... a) {
		List<String> strList = new ArrayList<>();
		strList.add("a");
		strList.add("b");
		strList.add("c");
		strList.add("d");
		strList.add("oe");
		strList.add("of");
		strList.add("og");
		strList.add("h");
		strList.add("i");
		strList.add("j");
		strList.add("k");
		strList.add("l");
		strList.add("m");
		strList.add("n");
		strList.add("o");
		strList.add("p");
		strList.add("q");
		strList.add("r");
		strList.add("s");
		strList.add("t");
		strList.add("u");
		strList.add("v");
		strList.add("w");
		strList.add("x");
		strList.add("y");
		strList.add("z");

		// int x1 = 0 ;

		// strList = strList.stream().map((op) -> {
		//
		// return op.concat(" - "+Integer.toString(x1));
		// }).collect(Collectors.toList());

		List<Student> students = new ArrayList<>();
		students.add(new Student("allwin", "nagercoil"));
		students.add(new Student("allwin1", "nagercoil1"));
		students.add(new Student("allwin2", "nagercoil2"));
		students.add(new Student("allwin3", "nagercoil3"));
		students.add(new Student("allwin4", "nagercoil4"));
		students.add(new Student("allwin5", "nagercoil5"));
		students.add(new Student("allwin6", "nagercoil6"));
		students.add(new Student("allwin7", "nagercoil7"));

		//
		Map<String, Student> stdMap = students.stream().collect(
				Collectors.toMap(Student::getName, Student::getSelf));
		System.out.println(stdMap);
	}

}

class Student {
	private String name;
	private String city;

	Student(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public Student getSelf(){
		return this;
	}
	
	@Override
	public String toString(){
		return this.name+" "+this.city;
		
	}
}
