package com.ivtl.designpatterns.builder.abstracttypes;

import com.ivtl.designpatterns.builder.Item;
import com.ivtl.designpatterns.builder.Packing;
import com.ivtl.designpatterns.builder.kindsofwrappings.Wrapper;

public abstract class Burger implements Item{
	
	   @Override
	   public Packing packing() {
	      return new Wrapper();
	   }

}
