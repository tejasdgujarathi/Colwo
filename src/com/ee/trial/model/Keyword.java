package com.ee.trial.model;

import java.util.ArrayList;
import java.util.List;

import com.ee.trial.constraint.Constraint;

public class Keyword {

	private String keyword;
	private List<Constraint> constraints = new ArrayList<Constraint>();

	public Keyword(String keyword, List<Constraint> listOfIfConstraints) {
		this.keyword = keyword;
		this.constraints = listOfIfConstraints;
	}

	public String applyConstraints(String sentence) {
		for (String word : sentence.split(" ")) {
			if(word.equalsIgnoreCase(keyword)) {
				for (Constraint constraint : constraints) {
					sentence = sentence.replace(word, constraint.apply(word));
				}
			}
		}
		return sentence;
	}

}
