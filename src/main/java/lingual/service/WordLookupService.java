package lingual.service;

import java.util.List;

import lingual.entities.Word;

public interface WordLookupService {
	/**
	 * Finds words specified by language and name.
	 * @param language		specifies the language of the word
	 * @param wordName		specifies the name of the word 
	 * @param useRegexp		specifies whether the name of the word is used as a regexp pattern
	 * @return				the list of Word objects found
	 */
	public List<Word> find(String language, String wordName, boolean useRegexp);
	/**
	 * Selects a word randomly from a specified range 
	 * 
	 * @param language		specifies the language of the word
	 * @param range			specifies the range from which the word will be selected
	 * @return				the selected Word object
	 */
	public Word selectRandomly(String language, int range);
}