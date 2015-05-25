package com.saftware.pattern.abstractfactory;


public class FactoryProducerTest {

	public static void main(String args[]){

		AbstractFactory shapeFactory  =  new ShapeFactory();
		
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		
		AbstractFactory colorFactory  =  new ColorFactory();

		Color color1 =  colorFactory.getColor("RED");
		color1.fill();
		
		Color color2 =  colorFactory.getColor("BLACK");
		color2.fill();
	}
}
