package com.saftware.pattern.singleton;

public class SingleObject {

	private static SingleObject singleObject = null;
	private SingleObject(){
	}
	
	public static SingleObject getSingleObject(){
		if(singleObject==null)
			singleObject = new SingleObject();
		return singleObject;
	}
	
	public void sayHello(){
		System.out.println("Hi there");
	}
	
}
