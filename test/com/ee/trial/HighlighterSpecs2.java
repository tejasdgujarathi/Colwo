package com.ee.trial;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.ee.trial.constraint.CapitalizationConstraint;
import com.ee.trial.constraint.ColourConstraint;
import com.ee.trial.constraint.Constraint;
import com.ee.trial.constraint.StyleAttribute;
import com.ee.trial.model.Keyword;
import com.ee.trial.model.SyntaxHighlighter;

public class HighlighterSpecs2 {

	SyntaxHighlighter syntaxHighlighter;

	@Test
	public void itHighLightsKeywordsWithBlueColor() {
		// Given
		String sentence = "If";
		syntaxHighlighter = new SyntaxHighlighter();

		List<Constraint> listOfIfConstraints = new ArrayList<Constraint>();
		listOfIfConstraints.add(new ColourConstraint("blue"));
		syntaxHighlighter.addKeywords(new Keyword("if", listOfIfConstraints));

		// When
		String highlightedSentence = syntaxHighlighter.highlight(sentence);

		// Then
		assertEquals("[blue]If[blue]", highlightedSentence);
	}

	@Test
	public void itHighLightsKeywordsWithRespectiveColor() {
		// Given
		String sentence = "If we write a program and compile it, then as we run the program, we will get output";
		syntaxHighlighter = new SyntaxHighlighter();

		List<Constraint> listOfIfConstraints = new ArrayList<Constraint>();
		listOfIfConstraints.add(new ColourConstraint("red"));
		syntaxHighlighter.addKeywords(new Keyword("if", listOfIfConstraints));

		List<Constraint> listOfAsConstraints = new ArrayList<Constraint>();
		listOfAsConstraints.add(new ColourConstraint("blue"));
		syntaxHighlighter.addKeywords(new Keyword("as", listOfAsConstraints));

		List<Constraint> listOfAndConstraints = new ArrayList<Constraint>();
		listOfAndConstraints.add(new ColourConstraint("red"));
		syntaxHighlighter.addKeywords(new Keyword("and", listOfAndConstraints));

		List<Constraint> listOfThenConstraints = new ArrayList<Constraint>();
		listOfThenConstraints.add(new ColourConstraint("green"));
		syntaxHighlighter
				.addKeywords(new Keyword("then", listOfThenConstraints));

		List<Constraint> listOfWhenConstraints = new ArrayList<Constraint>();
		listOfWhenConstraints.add(new ColourConstraint("blue"));
		syntaxHighlighter
				.addKeywords(new Keyword("when", listOfWhenConstraints));

		String expectedSentence = "[red]If[red] we write a program [red]and[red] compile it, [green]then[green] [blue]as[blue] we run the program, we will get output";

		// When
		String highlightedSentence = syntaxHighlighter.highlight(sentence);

		// Then
		assertEquals(expectedSentence, highlightedSentence);
	}

	@Test
	public void itHighLightsKeywordsWithRespectiveColorAndCapitalization() {
		// Given
		String sentence = "If we write a program and compile it, then as we run the program, we will get output";
		syntaxHighlighter = new SyntaxHighlighter();

		List<Constraint> listOfIfConstraints = new ArrayList<Constraint>();
		listOfIfConstraints.add(new ColourConstraint("red"));
		listOfIfConstraints.add(new CapitalizationConstraint(false));
		syntaxHighlighter.addKeywords(new Keyword("if", listOfIfConstraints));

		List<Constraint> listOfAsConstraints = new ArrayList<Constraint>();
		listOfAsConstraints.add(new ColourConstraint("blue"));
		listOfAsConstraints.add(new CapitalizationConstraint(true));
		syntaxHighlighter.addKeywords(new Keyword("as", listOfAsConstraints));

		List<Constraint> listOfAndConstraints = new ArrayList<Constraint>();
		listOfAndConstraints.add(new ColourConstraint("red"));
		listOfAndConstraints.add(new CapitalizationConstraint(true));
		syntaxHighlighter.addKeywords(new Keyword("and", listOfAndConstraints));

		List<Constraint> listOfThenConstraints = new ArrayList<Constraint>();
		listOfThenConstraints.add(new ColourConstraint("green"));
		listOfThenConstraints.add(new CapitalizationConstraint(false));
		syntaxHighlighter
				.addKeywords(new Keyword("then", listOfThenConstraints));

		List<Constraint> listOfWhenConstraints = new ArrayList<Constraint>();
		listOfWhenConstraints.add(new ColourConstraint("blue"));
		listOfWhenConstraints.add(new CapitalizationConstraint(false));
		syntaxHighlighter
				.addKeywords(new Keyword("when", listOfWhenConstraints));

		String expectedSentence = "[red]If[red] we write a program [red]AND[red] compile it, [green]then[green] [blue]AS[blue] we run the program, we will get output";

		// When
		String highlightedSentence = syntaxHighlighter.highlight(sentence);

		// Then
		assertEquals(expectedSentence, highlightedSentence);
	}

	@Test
	public void itHighLightsKeywordsWithRespectiveColorCapitalizationAndStyleAttribute() {
		// Given
		String sentence = "If we write a program and compile it, then as we run the program, we will get output";
		syntaxHighlighter = new SyntaxHighlighter();

		List<Constraint> listOfIfConstraints = new ArrayList<Constraint>();
		listOfIfConstraints.add(new ColourConstraint("red"));
		listOfIfConstraints.add(new CapitalizationConstraint(false));
		listOfIfConstraints.add(new StyleAttribute("bold"));
		syntaxHighlighter.addKeywords(new Keyword("if", listOfIfConstraints));

		List<Constraint> listOfAsConstraints = new ArrayList<Constraint>();
		listOfAsConstraints.add(new ColourConstraint("blue"));
		listOfAsConstraints.add(new CapitalizationConstraint(true));
		listOfAsConstraints.add(new StyleAttribute("normal"));
		syntaxHighlighter.addKeywords(new Keyword("as", listOfAsConstraints));

		List<Constraint> listOfAndConstraints = new ArrayList<Constraint>();
		listOfAndConstraints.add(new ColourConstraint("red"));
		listOfAndConstraints.add(new CapitalizationConstraint(false));
		listOfAndConstraints.add(new StyleAttribute("bold"));
		syntaxHighlighter.addKeywords(new Keyword("and", listOfAndConstraints));

		List<Constraint> listOfThenConstraints = new ArrayList<Constraint>();
		listOfThenConstraints.add(new ColourConstraint("green"));
		listOfThenConstraints.add(new CapitalizationConstraint(false));
		listOfThenConstraints.add(new StyleAttribute("normal"));
		syntaxHighlighter
				.addKeywords(new Keyword("then", listOfThenConstraints));

		List<Constraint> listOfWhenConstraints = new ArrayList<Constraint>();
		listOfWhenConstraints.add(new ColourConstraint("blue"));
		listOfWhenConstraints.add(new CapitalizationConstraint(false));
		listOfWhenConstraints.add(new StyleAttribute("normal"));
		syntaxHighlighter
				.addKeywords(new Keyword("when", listOfWhenConstraints));

		String expectedSentence = "[red][bold]If[bold][red] we write a program [red][bold]and[bold][red] compile it, " +
				"[green]then[green] [blue]AS[blue] we run the program, we will get output";

		// When
		String highlightedSentence = syntaxHighlighter.highlight(sentence);

		// Then
		assertEquals(expectedSentence, highlightedSentence);
	}

}
