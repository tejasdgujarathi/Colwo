package com.ee.trial.model;

import java.util.ArrayList;
import java.util.List;

public class SyntaxHighlighter {
	// private List<Map<String, List<Constraint>>> keywordConstraintPairs = new
	// ArrayList<Map<String, List<Constraint>>>();
	private List<Keyword> keywords = new ArrayList<Keyword>();

	// public String highlight(String sentence) {
	//
	// for (String word : getWordsInSentence(sentence)) {
	// for (Map<String, List<Constraint>> keywordConstraintPair :
	// keywordConstraintPairs) {
	// for (Map.Entry<String, List<Constraint>> entry :
	// keywordConstraintPair.entrySet()) {
	// if (isEqual(word, entry.getKey())) {
	// sentence = applyConstraint(sentence, word, entry.getValue());
	// }
	// }
	// }
	// }
	// return sentence;
	// }

	// private String[] getWordsInSentence(String sentence) {
	// return sentence.split(" ");
	// }
	//
	// private String applyConstraint(String sentence, String word,
	// List<Constraint> constraints) {
	// for (Constraint constraint : constraints) {
	// sentence = sentence.replaceAll(word, constraint.apply(word));
	// }
	// return sentence;
	// }
	//
	// private boolean isEqual(String word, String keyword) {
	// return word.equalsIgnoreCase(keyword);
	// }
	//
	// public void addConstraint(
	// Map<String, List<Constraint>> keywordConstraintPair) {
	// keywordConstraintPairs.add(keywordConstraintPair);
	// }

	public void addKeywords(Keyword keyword) {
		this.keywords.add(keyword);
	}

	public String highlight(String sentence) {
		for (Keyword keyword : keywords) {
			sentence = keyword.applyConstraints(sentence);
		}
		return sentence;
	}

}
