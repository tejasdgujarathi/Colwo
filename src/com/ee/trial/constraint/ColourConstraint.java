package com.ee.trial.constraint;


public class ColourConstraint implements Constraint{

	public String colour;
	
	public ColourConstraint(String color) {
		this.colour = color;
	}

	@Override
	public String apply(String keyword) {		
		return "["+colour+"]"+keyword+"["+colour+"]";
	}

	

}
