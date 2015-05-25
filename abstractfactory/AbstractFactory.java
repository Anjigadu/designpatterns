package com.saftware.pattern.abstractfactory;

public abstract class AbstractFactory {

	abstract public Color getColor(String choice);
	abstract public Shape getShape(String choice);
}
