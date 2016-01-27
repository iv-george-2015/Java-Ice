package com.ivtl.GenericClassSample;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GeneralClassSample {
	public static void main(String args[]) {
		GeneralClass<String, Integer> gc = new GeneralClass<>("Sunny", 123);
		gc.printCombinedResult();
		List<Object> lo = new ArrayList<>(); // 1
		List<String> ls = new ArrayList<>();
		lo.add(new Object()); // 3
//		String s = ls.get(0); // 4: Attempts to assign an Object to a String!
		
		List<? super Serializable> c = new ArrayList<>();
		c.add("asfasd"); // Compile time error
		
		System.out.println(System.getProperty("file.encoding"));
		System.out.println( Charset.defaultCharset());
		
		
	}
	public static void printCollection(Collection<?> c) {
	    for (Object e : c) {
	        System.out.println(e);
	    }
	}
}

class GeneralClass<T extends Object,P extends Object> {
	private T t;
	private P p;

	GeneralClass(T t, P p) {
		this.t = t;
		this.p = p;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public P getP() {
		return p;
	}

	public void setP(P p) {
		this.p = p;
	}

	public void printCombinedResult() {
		System.out.println("The combined value is : " + this.t + this.p);
	}
}

interface Internable<I,J>{
	void setInternable(I i);
	J getParam();
}

