package com.ee.trial.constraint;


public class StyleAttribute implements Constraint{

	private String styleAttribute;

	public StyleAttribute(String styleAttribute) {
		this.styleAttribute = styleAttribute;
	}

	public boolean isStyleNormal() {
		return styleAttribute.equalsIgnoreCase("normal");
	}

	@Override
	public String apply(String keyword) {
		return isStyleNormal()?keyword:"["+styleAttribute+"]"+keyword+"["+styleAttribute+"]";
	}
}
