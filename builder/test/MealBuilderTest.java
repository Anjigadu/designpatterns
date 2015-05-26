package com.saftware.pattern.builder;

public class MealBuilderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MealBuilder mealBuilder =  new MealBuilder();
		
		Meal vegMeal = mealBuilder.buildVegMeal();		
		vegMeal.listItems();
		System.out.println("Total Cost: "+vegMeal.getCost());
		
		Meal nonVegMeal = mealBuilder.buildNonVegMeal();
		nonVegMeal.listItems();
		System.out.println("Total Cost: "+nonVegMeal.getCost());
		
		Meal jumboMeal = mealBuilder.buildJumboNonVegMeal();
		jumboMeal.listItems();
		System.out.println("Total Cost: "+jumboMeal.getCost());
		
	}

}
