package com.saftware.pattern.prototype;

import java.util.HashMap;

public class ShapeCache {

	private HashMap<String,Shape> shapeMap = new HashMap<String, Shape>();
	
	public Shape getShape(String id){
		Shape cachedShape = shapeMap.get(id); 
		return (Shape)cachedShape.clone();
	}
	
	
	/**The operation which takes much time to create Object
	 * 
	 */
	public void loadCache(){
		
		Shape shape1 = new Circle();
		shape1.setId("1");
		
		Shape shape2 = new Circle();
		shape2.setId("2");
		
		Shape shape3 = new Rectangle();
		shape3.setId("3");
		
		shapeMap.put(shape1.getId(), shape1);
		shapeMap.put(shape2.getId(), shape2);
		shapeMap.put(shape3.getId(), shape3);
		
	}
}
