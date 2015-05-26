package com.saftware.pattern.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	
	private List<Item> itemsList = new ArrayList<Item>();
	
	public void addItem(Item i){
		itemsList.add(i);
		
	}
	
	public float getCost(){
		float sum=0.0f;
		for(Item i : itemsList){
			sum+=i.price();
		}
		return sum;
	}
	
	public void listItems(){
		for(Item i : itemsList){
			System.out.println(i.name()+" "+i.packing().pack()+" price: "+i.price());
		}
	}

}
