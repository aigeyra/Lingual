package lingual.beans;

import java.io.Serializable;

public class ExerciseScore implements Serializable, Score{

	private static final long serialVersionUID = -9057229681604614880L;
	private Integer answersCount = 0;
	private Integer incorrectAnswers = 0;
	private Integer correctAnswers = 0;
	
	/* (non-Javadoc)
	 * @see lingual.beans.Score#addAnswerResult(boolean)
	 */
	@Override
	public void addAnswerResult(boolean correct){	
		++answersCount;
		if(correct){
			++correctAnswers;
		}else{
			++incorrectAnswers;
		}
	}
	
	/* (non-Javadoc)
	 * @see lingual.beans.Score#getAnswersCount()
	 */
	@Override
	public String getAnswersCount() {
		return answersCount.toString();
	}
	
	/* (non-Javadoc)
	 * @see lingual.beans.Score#getIncorrectAnswers()
	 */
	@Override
	public String getIncorrectAnswers() {
		return incorrectAnswers.toString();
	}
	
	/* (non-Javadoc)
	 * @see lingual.beans.Score#getCorrectAnswers()
	 */
	@Override
	public String getCorrectAnswers() {
		return correctAnswers.toString();
	}
	
	/* (non-Javadoc)
	 * @see lingual.beans.Score#getPercentage()
	 */
	@Override
	public String getPercentage(){
		if(answersCount == 0){
			return null;
		}
		double d = correctAnswers / (double)(answersCount) * 100;
		String score = String.format("%.1f", d);
		return score + "%";
	}
	
	/* (non-Javadoc)
	 * @see lingual.beans.Score#getScore()
	 */
	@Override
	public String getCompleteScore(){
		String score = getPercentage();
		if(score == null){
			return null;
		}
		return "<span class='correct'>" + correctAnswers.toString() + 
		        "</span>/<span class='incorrect'>" + incorrectAnswers.toString() + 
		        "</span> (" + score + "%)";
	}	
	
	@Override
	public String toString(){
		return getCompleteScore();
	}
}