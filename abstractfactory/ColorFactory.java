package com.saftware.pattern.abstractfactory;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String choice) {
		if(choice.equalsIgnoreCase("RED")){
			return new Red();
		}else if(choice.equalsIgnoreCase("BLACK")){
			return new Black();
			
		}
		return null;
	}

	@Override
	public Shape getShape(String choice) {
		return null;
	}

}
