package com.saftware.pattern.abstractfactory;

public class ShapeFactory extends AbstractFactory {

	public  Shape getShape(String type){
		if(type.equalsIgnoreCase("Circle")){
			return new Circle();
		}else if(type.equalsIgnoreCase("Rectangle")){
			return new Rectangle();
		}else
			return null;
	}

	@Override
	public Color getColor(String choice) {
		return null;
	}
}
