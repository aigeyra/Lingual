package lingual.beans;

public interface Score {

	/**
	 * Counts the number of answers and the number of
	 * correct answers .
	 * 
	 * @param correct	boolean value indicating a correct answer
	 */	
	public void addAnswerResult(boolean correct);	
	
	/**
	 * Returns the total number of answers as a String.
	 * 
	 * @return		number of answers
	 */
	public String getAnswersCount();
	
	/**
	 * Returns the number of incorrect answers as a String.
	 * 
	 * @return		number of incorrect answers
	 */
	public String getIncorrectAnswers();
	
	/**
	 * Returns the number of correct answers as a String.
	 * 
	 * @return		number of correct answers
	 */
	public String getCorrectAnswers();
	
	/**
	 * Returns the percentage of correct answers as a String.
	 * 
	 * @return		percentage
	 */
	public String getPercentage();
	
	/**
	 * Returns the number of correct and incorrect answers
	 * and percentage as a string to be displayed on a page. 
	 * 
	 * @return		score
	 */
	public String getCompleteScore();
}