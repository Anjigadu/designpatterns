package com.saftware.pattern.prototype;

public class ShapeCacheTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ShapeCache shapeCache = new ShapeCache();
		shapeCache.loadCache();
		
		Shape circle1 = shapeCache.getShape("1");
		circle1.draw();

		Shape circle2 = shapeCache.getShape("2");
		circle2.draw();
		
		Shape rect3 = shapeCache.getShape("3");
		rect3.draw();
		
	}

}

