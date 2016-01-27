package com.ivtl.GenericClassSample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenSample {

	public static void main(String[] args) {
		
		ConcInter<Object, Object> concInter= new ConcInter<>("String1", "String2");
//		System.out.println(concInter.getParam());;
		
		List <String> l1 = new ArrayList<String>();
		List<Integer> l2 = new ArrayList<Integer>();
		System.out.println(l1.getClass() == l2.getClass());
		
		Collection<String> cs = new ArrayList<String>();
		// Illegal.
		if (cs instanceof ArrayList<?>) {
			System.out.println("yes");
		}
		
		Collection<String> cstr = (Collection<String>) cs;
	}

}

class ConcInter<I, J> implements Internable<I, J>{

	private I i;
	private J j;
	
	ConcInter(I i,J j){
		this.i = i;
		this.j = j;
	}
	
	public I getI() {
		return i;
	}

	public void setI(I i) {
		this.i = i;
	}

	public J getJ() {
		return j;
	}

	public void setJ(J j) {
		this.j = j;
	}

	@Override
	public void setInternable(I i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public  J getParam() {
		// TODO Auto-generated method stub
		return this.j;
	}
	
}