package com.ivtl.designpatterns.builder.concreteforabstracttypes;

import com.ivtl.designpatterns.builder.abstracttypes.CoolDrink;

public class Pepsi extends CoolDrink{
	   
	   @Override
	   public float price() {
	      return 35.0f;
	   }

	   @Override
	   public String name() {
	      return "Pepsi";
	   }
	   
}
