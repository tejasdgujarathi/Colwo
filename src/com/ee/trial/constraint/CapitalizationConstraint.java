package com.ee.trial.constraint;


public class CapitalizationConstraint implements Constraint {
	boolean capitalize;

	public CapitalizationConstraint(boolean capitalizationType) {
		this.capitalize = capitalizationType;
	}

	@Override
	public String apply(String keyword) {
		return capitalize ? keyword.toUpperCase(): keyword;
	}
}
