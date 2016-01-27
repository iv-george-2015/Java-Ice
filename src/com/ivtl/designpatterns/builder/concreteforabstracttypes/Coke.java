package com.ivtl.designpatterns.builder.concreteforabstracttypes;

import com.ivtl.designpatterns.builder.abstracttypes.CoolDrink;

public class Coke extends CoolDrink {

	 @Override
	   public float price() {
	      return 30.0f;
	   }

	   @Override
	   public String name() {
	      return "Coke";
	   }
	   
}
