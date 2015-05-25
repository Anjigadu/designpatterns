package com.saftware.pattern.factory;

public class ShapeFactory {

	public  Shape getShape(String type){
		if(type.equalsIgnoreCase("Circle")){
			return new Circle();
		}else if(type.equalsIgnoreCase("Rectangle")){
			return new Rectangle();
		}else
			return null;
	}
}
