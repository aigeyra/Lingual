package lingual.beans;

import java.io.Serializable;

public class ExerciseFactory implements Serializable{

	private static final long serialVersionUID = 7567288214083553376L;

	/**
	 * Creates and returns a new instance of a concrete subtype of the Exercise class. 
	 * The subtype is specified by exerciseType param.
	 * 
	 * @param exerciseType	type of exercise
	 * @return				instance of a concrete subtype of the Exercise class
	 */
	public Exercise getExercise(String exerciseType) {
		switch(exerciseType){
		case "enDef":
			return new ExerciseEnDef();
		case "frCon":
			return new ExerciseFrCon();
		default: 
			return null;		
		}

	}

}