/*package com.ee.trial;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class HighlighterSpecs {
	
	SyntaxHighlighter syntaxHighlighter;
	
	@Test
	public void itHighLightsKeywordsWithBlueColor() {
		// Given
		String sentence = "If";
		syntaxHighlighter = new SyntaxHighlighter();
//		Map<String,List<Constraint>> keywordConstraintPair = new HashMap<String, List<Constraint>>();
		
//		List<Constraint> ifConstraints = new ArrayList<Constraint>();
//		ifConstraints.add(new ColourConstraint("blue"));
//		keywordConstraintPair.put("if", ifConstraints);
//		
//		List<Constraint> asConstraints = new ArrayList<Constraint>();
//		asConstraints.add(new ColourConstraint("blue"));
//		keywordConstraintPair.put("as", asConstraints);
//		
//		List<Constraint> andConstraints = new ArrayList<Constraint>();
//		andConstraints.add(new ColourConstraint("blue"));
//		keywordConstraintPair.put("and", andConstraints);
//		
//		List<Constraint> thenConstraints = new ArrayList<Constraint>();
//		thenConstraints.add(new ColourConstraint("blue"));
//		keywordConstraintPair.put("then", thenConstraints);
//		
//		List<Constraint> whenConstraints = new ArrayList<Constraint>();
//		whenConstraints.add(new ColourConstraint("blue"));
//		keywordConstraintPair.put("when", whenConstraints);
		
//		List<Keyword> keywords = new ArrayList<Keyword>();
		
		List<Constraint> listOfIfConstraints = new ArrayList<Constraint>();
		listOfIfConstraints.add(new ColourConstraint("blue"));
		syntaxHighlighter.addKeywords(new Keyword("if",listOfIfConstraints ));
		

		//When
		String highlightedSentence = syntaxHighlighter.highlight(sentence);

		//syntaxHighlighter.addConstraint(keywordConstraintPair);
		//String highlightedSentence = syntaxHighlighter.highlight(sentence);
		
		// Then
		assertEquals("[blue]If[blue]", highlightedSentence);
	}

	@Test
	public void itHighLightsKeywordsWithRespectiveColor() {
		// Given
		String sentence = "if we write a program and compile it then as";
		syntaxHighlighter = new SyntaxHighlighter();
		Map<String,List<Constraint>> keywordConstraintPair = new HashMap<String, List<Constraint>>();
		
		List<Constraint> ifConstraints = new ArrayList<Constraint>();
		ifConstraints.add(new ColourConstraint("red"));
		keywordConstraintPair.put("if", ifConstraints);
		
		List<Constraint> asConstraints = new ArrayList<Constraint>();
		asConstraints.add(new ColourConstraint("blue"));
		keywordConstraintPair.put("as", asConstraints);
		
		List<Constraint> andConstraints = new ArrayList<Constraint>();
		andConstraints.add(new ColourConstraint("red"));
		keywordConstraintPair.put("and", andConstraints);
		
		List<Constraint> thenConstraints = new ArrayList<Constraint>();
		thenConstraints.add(new ColourConstraint("green"));
		keywordConstraintPair.put("then", thenConstraints);
		
		List<Constraint> whenConstraints = new ArrayList<Constraint>();
		whenConstraints.add(new ColourConstraint("blue"));
		keywordConstraintPair.put("when", whenConstraints);
		
		syntaxHighlighter.addConstraint(keywordConstraintPair);
		
		//When
		String highlightedSentence = syntaxHighlighter.highlight(sentence);
		
		// Then
		assertEquals("[red]if[red] we write a program [red]and[red] compile it [green]then[green] [blue]as[blue]"
				, highlightedSentence);
	}
	
	@Test
	public void itHighLightsKeywordsWithRespectiveColorAndCapitalization() {
		// Given
		String sentence = "if we write a program and compile it as";
		syntaxHighlighter = new SyntaxHighlighter();
		
		Map<String,List<Constraint>> keywordConstraintPair = new HashMap<String, List<Constraint>>();
		List<Constraint> ifConstraints = new ArrayList<Constraint>();
		ifConstraints.add(new ColourConstraint("red"));
		ifConstraints.add(new CapitalizationConstraint(true));		
		keywordConstraintPair.put("if", ifConstraints);
		
		List<Constraint> asConstraints = new ArrayList<Constraint>();
		asConstraints.add(new ColourConstraint("blue"));
		asConstraints.add(new CapitalizationConstraint(true));
		keywordConstraintPair.put("as", asConstraints);
		
		List<Constraint> andConstraints = new ArrayList<Constraint>();
		andConstraints.add(new ColourConstraint("red"));
		andConstraints.add(new CapitalizationConstraint(true));
		keywordConstraintPair.put("and", andConstraints);
		
		List<Constraint> thenConstraints = new ArrayList<Constraint>();
		thenConstraints.add(new ColourConstraint("green"));
		keywordConstraintPair.put("then", thenConstraints);
		
		List<Constraint> whenConstraints = new ArrayList<Constraint>();
		whenConstraints.add(new ColourConstraint("blue"));
		keywordConstraintPair.put("when", whenConstraints);
		
		syntaxHighlighter.addConstraint(keywordConstraintPair);
		
		//When
		String highlightedSentence = syntaxHighlighter.highlight(sentence);
		
		// Then
		assertEquals("[red]IF[red] we write a program [red]AND[red] compile it [blue]AS[blue]", highlightedSentence);
	}

	
	@Test
	public void itHighLightsKeywordsWithRespectiveColorCapitalizationAndStyleAttribute() {
		String sentence = "if";
		Map<String, RuleToBeApplied> keywordAndConstraint = new HashMap<String, RuleToBeApplied>();
		RuleToBeApplied ruleAs = new RuleToBeApplied(new Color("blue"), new Capitalization(true), new StyleAttribute("normal"));
		RuleToBeApplied ruleIf = new RuleToBeApplied(new Color("red"), new Capitalization(false), new StyleAttribute("bold"));
		RuleToBeApplied ruleAnd = new RuleToBeApplied(new Color("red"), new Capitalization(true), new StyleAttribute("bold"));
		RuleToBeApplied ruleThen = new RuleToBeApplied(new Color("green"), new Capitalization(false), new StyleAttribute("normal"));
		RuleToBeApplied ruleWhen = new RuleToBeApplied(new Color("blue"), new Capitalization(false), new StyleAttribute("normal"));
		
		keywordAndConstraint.put("as", ruleAs);
		keywordAndConstraint.put("if", ruleIf);
		keywordAndConstraint.put("and", ruleAnd);
		keywordAndConstraint.put("then", ruleThen);
		keywordAndConstraint.put("when", ruleWhen);
		
		syntaxHighlighter = new SyntaxHighlighter(keywordAndConstraint);
		assertEquals("[red][bold]if[bold][red]", syntaxHighlighter.highlight(sentence));
	}
	
	

}
*/