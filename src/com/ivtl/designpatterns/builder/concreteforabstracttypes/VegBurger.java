package com.ivtl.designpatterns.builder.concreteforabstracttypes;

import com.ivtl.designpatterns.builder.abstracttypes.Burger;

public class VegBurger extends Burger{
	  
	   @Override
	   public float price() {
	      return 25.0f;
	   }

	   @Override
	   public String name() {
	      return "Veg Burger";
	   }
}
