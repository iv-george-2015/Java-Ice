package com.ivtl.designpatterns.builder;

import com.ivtl.designpatterns.builder.concreteforabstracttypes.ChickenBurger;
import com.ivtl.designpatterns.builder.concreteforabstracttypes.Coke;
import com.ivtl.designpatterns.builder.concreteforabstracttypes.Pepsi;
import com.ivtl.designpatterns.builder.concreteforabstracttypes.VegBurger;

public class MealBuilder {

	   public Meal prepareVegMeal (){
	      Meal meal = new Meal();
	      meal.addItem(new VegBurger());
	      meal.addItem(new Coke());
	      return meal;
	   }   

	   public Meal prepareNonVegMeal (){
	      Meal meal = new Meal();
	      meal.addItem(new ChickenBurger());
	      meal.addItem(new Pepsi());
	      meal.addItem(new Pepsi());
	      return meal;
	   }
	}