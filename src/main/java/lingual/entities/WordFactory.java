package lingual.entities;

import java.io.Serializable;


public class WordFactory implements Serializable{

	private static final long serialVersionUID = 6096278038162661088L;

	/**
	 * Creates and returns a new instance of a concrete subtype of the Word class. 
	 * The subtype is specified by language and wordType params.
	 * 
	 * @param language	language
	 * @param wordType	type of word
	 * @return			instance of a concrete subtype of the Word class
	 */
	public Word getWord(String language, String wordType){
		switch(language + " " + wordType){
		case "English noun":
			return new NounEn();
		case "English verb":
			return new VerbEn();
		case "English adjective":
			return new AdjectiveEn();
		case "English adverb":
			return new AdverbEn();
		case "English pronoun":
			return new PronounEn();
		case "English preposition":
			return new PrepositionEn();
		case "English conjunction":
			return new ConjunctionEn();
		case "English determiner":
			return new DeterminerEn();
		case "English interjection":
			return new InterjectionEn();
		case "French noun":
			return new NounFr();
		case "French verb":
			return new VerbFr();
		default:
			return null;
		}
	}
}