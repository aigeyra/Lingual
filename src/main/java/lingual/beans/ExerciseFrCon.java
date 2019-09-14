package lingual.beans;

import lingual.entities.VerbFr;
import lingual.service.WordLookupService;

public class ExerciseFrCon extends Exercise {

	private static final long serialVersionUID = -2938359521962303330L;

	/* (non-Javadoc)
	 * @see lingual.beans.Exercise#getExerciseQuestion()
	 */
	@Override
	public String getExerciseQuestion() {
		return "<span class='questionHeaderFrCon'>" +
				Exercise.messagesBundle.getString("exerciseFRCONQuestionHeader") + 
				"</span><span>" +
				selectedRandomWord.getName() +
				"</span>";
	}

	/* (non-Javadoc)
	 * @see lingual.beans.Exercise#evaluate(boolean)
	 */
	@Override
	public boolean evaluate(boolean eval) {
		boolean correct = true;

		if(eval && userWord != null){
			boolean c;

			if(((VerbFr)userWord).getIndicPreseP1sg() != null){
				c = ((VerbFr)userWord).getIndicPreseP1sg().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getIndicPreseP1sg().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getIndicPreseP1sg() != null){
				c = ((VerbFr)userWord).getIndicPreseP1sg().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getIndicPreseP1sg().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getIndicPreseP2sg() != null){
				c = ((VerbFr)userWord).getIndicPreseP2sg().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getIndicPreseP2sg().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getIndicPreseP3sg() != null){
				c = ((VerbFr)userWord).getIndicPreseP3sg().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getIndicPreseP3sg().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getIndicPreseP1pl() != null){
				c = ((VerbFr)userWord).getIndicPreseP1pl().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getIndicPreseP1pl().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getIndicPreseP2pl() != null){
				c = ((VerbFr)userWord).getIndicPreseP2pl().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getIndicPreseP2pl().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getIndicPreseP3pl() != null){
				c = ((VerbFr)userWord).getIndicPreseP3pl().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getIndicPreseP3pl().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getIndicPasscP1sg() != null){
				c = ((VerbFr)userWord).getIndicPasscP1sg().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getIndicPasscP1sg().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getIndicPasscP2sg() != null){
				c = ((VerbFr)userWord).getIndicPasscP2sg().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getIndicPasscP2sg().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getIndicPasscP3sg() != null){
				c = ((VerbFr)userWord).getIndicPasscP3sg().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getIndicPasscP3sg().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getIndicPasscP1pl() != null){
				c = ((VerbFr)userWord).getIndicPasscP1pl().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getIndicPasscP1pl().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getIndicPasscP2pl() != null){
				c = ((VerbFr)userWord).getIndicPasscP2pl().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getIndicPasscP2pl().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getIndicPasscP3pl() != null){
				c = ((VerbFr)userWord).getIndicPasscP3pl().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getIndicPasscP3pl().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getIndicImparP1sg() != null){
				c = ((VerbFr)userWord).getIndicImparP1sg().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getIndicImparP1sg().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getIndicImparP2sg() != null){
				c = ((VerbFr)userWord).getIndicImparP2sg().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getIndicImparP2sg().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getIndicImparP3sg() != null){
				c = ((VerbFr)userWord).getIndicImparP3sg().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getIndicImparP3sg().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getIndicImparP1pl() != null){
				c = ((VerbFr)userWord).getIndicImparP1pl().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getIndicImparP1pl().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getIndicImparP2pl() != null){
				c = ((VerbFr)userWord).getIndicImparP2pl().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getIndicImparP2pl().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getIndicImparP3pl() != null){
				c = ((VerbFr)userWord).getIndicImparP3pl().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getIndicImparP3pl().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getIndicFutusP1sg() != null){
				c = ((VerbFr)userWord).getIndicFutusP1sg().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getIndicFutusP1sg().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getIndicFutusP2sg() != null){
				c = ((VerbFr)userWord).getIndicFutusP2sg().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getIndicFutusP2sg().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getIndicFutusP3sg() != null){
				c = ((VerbFr)userWord).getIndicFutusP3sg().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getIndicFutusP3sg().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getIndicFutusP1pl() != null){
				c = ((VerbFr)userWord).getIndicFutusP1pl().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getIndicFutusP1pl().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getIndicFutusP2pl() != null){
				c = ((VerbFr)userWord).getIndicFutusP2pl().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getIndicFutusP2pl().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getIndicFutusP3pl() != null){
				c = ((VerbFr)userWord).getIndicFutusP3pl().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getIndicFutusP3pl().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getImperPreseP2sg() != null){
				c = ((VerbFr)userWord).getImperPreseP2sg().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getImperPreseP2sg().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getImperPreseP1pl() != null){
				c = ((VerbFr)userWord).getImperPreseP1pl().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getImperPreseP1pl().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getImperPreseP2pl() != null){
				c = ((VerbFr)userWord).getImperPreseP2pl().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getImperPreseP2pl().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getSubjoPreseP1sg() != null){
				c = ((VerbFr)userWord).getSubjoPreseP1sg().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getSubjoPreseP1sg().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getSubjoPreseP2sg() != null){
				c = ((VerbFr)userWord).getSubjoPreseP2sg().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getSubjoPreseP2sg().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getSubjoPreseP3sg() != null){
				c = ((VerbFr)userWord).getSubjoPreseP3sg().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getSubjoPreseP3sg().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getSubjoPreseP1pl() != null){
				c = ((VerbFr)userWord).getSubjoPreseP1pl().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getSubjoPreseP1pl().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getSubjoPreseP2pl() != null){
				c = ((VerbFr)userWord).getSubjoPreseP2pl().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getSubjoPreseP2pl().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getSubjoPreseP3pl() != null){
				c = ((VerbFr)userWord).getSubjoPreseP3pl().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getSubjoPreseP3pl().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getSubjoPasseP1sg() != null){
				c = ((VerbFr)userWord).getSubjoPasseP1sg().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getSubjoPasseP1sg().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getSubjoPasseP2sg() != null){
				c = ((VerbFr)userWord).getSubjoPasseP2sg().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getSubjoPasseP2sg().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getSubjoPasseP3sg() != null){
				c = ((VerbFr)userWord).getSubjoPasseP3sg().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getSubjoPasseP3sg().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getSubjoPasseP1pl() != null){
				c = ((VerbFr)userWord).getSubjoPasseP1pl().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getSubjoPasseP1pl().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getSubjoPasseP2pl() != null){
				c = ((VerbFr)userWord).getSubjoPasseP2pl().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getSubjoPasseP2pl().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getSubjoPasseP3pl() != null){
				c = ((VerbFr)userWord).getSubjoPasseP3pl().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getSubjoPasseP3pl().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getCondiPreseP1sg() != null){
				c = ((VerbFr)userWord).getCondiPreseP1sg().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getCondiPreseP1sg().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getCondiPreseP2sg() != null){
				c = ((VerbFr)userWord).getCondiPreseP2sg().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getCondiPreseP2sg().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getCondiPreseP3sg() != null){
				c = ((VerbFr)userWord).getCondiPreseP3sg().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getCondiPreseP3sg().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getCondiPreseP1pl() != null){
				c = ((VerbFr)userWord).getCondiPreseP1pl().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getCondiPreseP1pl().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getCondiPreseP2pl() != null){
				c = ((VerbFr)userWord).getCondiPreseP2pl().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getCondiPreseP2pl().toLowerCase().trim());
				correct = correct && c;
			}

			if(((VerbFr)userWord).getCondiPreseP3pl() != null){
				c = ((VerbFr)userWord).getCondiPreseP3pl().toLowerCase().trim().equals(
						((VerbFr)selectedRandomWord).getCondiPreseP3pl().toLowerCase().trim());
				correct = correct && c;
			}

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
			wordRange = 64;
			break;
		case 2:
			wordRange = 127;
			break;
		case 3:
			wordRange = 291;
			break;
		}
		selectedRandomWord = service.selectRandomly("French", wordRange);		
	}

	public ExerciseFrCon(){
		exerciseType = "frCon";
		score = new ExerciseScore();
	}

}