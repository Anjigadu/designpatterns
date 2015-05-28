package com.saftware.pattern.decorator;

public class ShapeDecoratorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ShapeDecorator circleDecorator = new RedBorderDecorator(new Circle());
		ShapeDecorator rectangleDecorator = new RedBorderDecorator(new Rectangle());
		
		circleDecorator.draw();
		rectangleDecorator.draw();

	}

}
