package com.saftware.pattern.builder;

public class MealBuilder {

	public Meal buildVegMeal(){
		
		Meal vegMeal = new Meal();
		vegMeal.addItem(new VegBurger());
		vegMeal.addItem(new Coke());
		return vegMeal;
		
	}
	
	public Meal buildNonVegMeal(){
		Meal nonvegMeal = new Meal();
		nonvegMeal.addItem(new NonVegBurger());
		nonvegMeal.addItem(new Pepsi());
		
		return nonvegMeal;
	}
	
	
	public Meal buildJumboNonVegMeal(){
		Meal jumboNonvegMeal = new Meal();
		jumboNonvegMeal.addItem(new NonVegBurger());
		jumboNonvegMeal.addItem(new NonVegBurger());
		jumboNonvegMeal.addItem(new Pepsi());
		jumboNonvegMeal.addItem(new Coke());
		
		return jumboNonvegMeal;
	}
}
