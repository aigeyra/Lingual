package lingual.beans;


import lingual.service.WordLookupService;

public class ExerciseEnDef extends Exercise {

	private static final long serialVersionUID = -7004744536799666139L;

	/* (non-Javadoc)
	 * @see lingual.beans.Exercise#getExerciseQuestion()
	 */
	@Override
	public String getExerciseQuestion() {
		return "<span class='questionHeaderEnDef'>" +
				Exercise.messagesBundle.getString("exerciseENDEFQuestionHeader") +
				"</span><p>" + 
				selectedRandomWord.getDefinition() +
				"</p>";
	}

	/* (non-Javadoc)
	 * @see lingual.beans.Exercise#evaluate(boolean)
	 */
	@Override
	public boolean evaluate(boolean eval) {
		boolean correct = false;		
		if(eval && userWord != null){			
			correct = (userWord.getName() != null && userWord.getName().toLowerCase().trim().equals(
					selectedRandomWord.getName().toLowerCase().trim()));
		}
		if(eval && correct){
			score.addAnswerResult(true);			
		}else{
			score.addAnswerResult(false);			
		}
		return eval && correct;
	}

	/* (non-Javadoc)
	 * @see lingual.beans.Exercise#nextWord(lingual.service.WordLookupService)
	 */
	@Override
	public void nextWord(WordLookupService service) {
		int wordRange = 0;
		switch(exerciseLevel){
		case 1:
			wordRange = 30;
			break;
		case 2:
			wordRange = 76;
			break;		
		case 3:
			wordRange = 122;
			break;
		}
		selectedRandomWord = service.selectRandomly("English", wordRange);		
	}
	
	public ExerciseEnDef() {	
		exerciseType = "enDef";
		score = new ExerciseScore();
	}

}