package lingual.beans;


import java.io.Serializable;
import java.util.ResourceBundle;

import javax.faces.context.FacesContext;

import lingual.entities.Word;
import lingual.service.WordLookupService;

public abstract class Exercise implements Serializable{

	private static final long serialVersionUID = -4983583418512123695L;
	protected static final ResourceBundle messagesBundle = 
			ResourceBundle.getBundle("messages", FacesContext.getCurrentInstance().getViewRoot().getLocale());
	protected String exerciseType = null;	
	protected Word userWord = null;
	protected Word selectedRandomWord = null;
	protected Integer exerciseLevel = 1;
	protected Score score = new ExerciseScore();	
	
	/**
	 * Gets exercise question according to exercise type
	 * 
	 * @return		exercise question as a String
	 */
	public abstract String getExerciseQuestion();
	
	/**
	 * Evaluates the user's answer (user word).
	 * 
	 * @param eval	indicates whether the actual evaluation will be performed
	 * @return		true if the actual evaluation is performed and answer is correct,
	 * 				otherwise false 
	 */
	public abstract boolean evaluate(boolean eval);
	
	/**
	 * Selects a word using a word lookup service
	 * 
	 * @param service	word lookup service
	 */
	public abstract void nextWord(WordLookupService service);	
	
	/**
	 * Gets the type of the exercise.
	 * 
	 * @return
	 */
	public String getExerciseType() {
		return exerciseType;
	}

	/**
	 * Gets the level of the exercise.
	 * This is used for building exercise questions
	 * 
	 * @return
	 */
	public Integer getExerciseLevel() {
		return exerciseLevel;
	}
	
	/**
	 * Sets the level of the exercise.
	 * 
	 * @param level
	 */
	public void setExerciseLevel(Integer level) {
		this.exerciseLevel = level;		
	}

	/**
	 * Gets the exercise score.
	 * 
	 * @return		exercise score
	 */
	public Score getScore() {
		return score;
	}
	
	/**
	 * Gets the user word (user's answer).
	 * 
	 * @return		user word
	 */
	public Word getUserWord() {
		return userWord;
	}
	
	/**
	 * Sets the user word (user's answer).
	 * 
	 * @param word
	 */
	public void setUserWord(Word word) {
		this.userWord = word;
	}
	
	/**
	 * Gets the type of the user word.
	 * 
	 * @return
	 */
	public String getUserWordType() {
		return selectedRandomWord.getWordType();
	}
	
	/**
	 * Gets the selected random word (used to build an exercise question).
	 * 
	 * @return
	 */
	public Word getSelectedRandomWord() {
		return selectedRandomWord;
	}
	
}