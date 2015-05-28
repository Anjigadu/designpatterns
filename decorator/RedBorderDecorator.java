package com.saftware.pattern.decorator;

public class RedBorderDecorator extends ShapeDecorator{

	public RedBorderDecorator(Shape baseShape) {
		super(baseShape);
	}
	
	public void draw(){
		super.draw();
		System.out.println("Adding Red Border");
	}

}
