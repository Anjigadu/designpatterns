package com.saftware.pattern.abstractfactory;

public class FactoryProducer {

	public AbstractFactory getFactory(String choice){
		if(choice.equalsIgnoreCase("Color"))
			return new ColorFactory();
		else
			return new ShapeFactory();
	}
}
