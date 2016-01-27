package com.ivtl.designpatterns.builder.concreteforabstracttypes;

import com.ivtl.designpatterns.builder.abstracttypes.Burger;

public class ChickenBurger extends Burger {

	   @Override
	   public float price() {
	      return 50.5f;
	   }

	   @Override
	   public String name() {
	      return "Chicken Burger";
	   }
	   
}
