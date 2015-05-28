package com.saftware.pattern.decorator;

public abstract class ShapeDecorator implements Shape {

	protected Shape baseShape;
	
	public ShapeDecorator(Shape baseShape){
		this.baseShape = baseShape;
	}
	
	public  void draw() {
		baseShape.draw();
	}

}
