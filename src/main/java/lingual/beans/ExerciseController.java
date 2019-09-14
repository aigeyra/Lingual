package lingual.beans;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import lingual.service.WordLookupService;

@ManagedBean
@SessionScoped
public class ExerciseController implements Serializable{

	private static final long serialVersionUID = 6310151235044463180L;
	private static final ResourceBundle messagesBundle = 
			ResourceBundle.getBundle("messages", FacesContext.getCurrentInstance().getViewRoot().getLocale());
	private Exercise exercise;
	protected boolean evaluated;
	private boolean displayCorrectAnswer;
	private String resultMessage;

	@ManagedProperty(value="#{exerciseOptionsManager}")
	private ExerciseOptionsManager exerciseOptions;		
	
	@ManagedProperty(value="#{simpleLookupService}")
	private WordLookupService service;
	
	@ManagedProperty(value="#{sessionManager}")
	private SessionManager session;	
		
	private Map<String,Boolean> selectedMoods = new HashMap<String,Boolean>();
	private Map<String,String[]> selectedTenses = new HashMap<String,String[]>();
	
	public Map<String,Boolean> getSelectedMoods() {
		return selectedMoods;
	}
	
	public void setSelectedMoods(Map<String,Boolean> selectedMoods) {
		this.selectedMoods = selectedMoods;
	}
	
	public Map<String,String[]> getSelectedTenses() {
		return selectedTenses;
	}

	public void setSelectedTenses(Map<String,String[]> selectedTenses) {
		this.selectedTenses = selectedTenses;
	}

	public ExerciseOptionsManager getExerciseOptions() {
		return exerciseOptions;
	}

	public void setExerciseOptions(ExerciseOptionsManager eom) {
		this.exerciseOptions = eom;
	}
		
	public void setService(WordLookupService service) {
		this.service = service;
	}
	
	public SessionManager getSession() {
		return session;
	}

	public void setSession(SessionManager session) {
		this.session = session;
	}	
	
	public Exercise getExercise() {
		return exercise;
	}

	public void setExercise(Exercise exercise) {
		this.exercise = exercise;
	}
	
	/**
	 * Gets all selected moods and tenses from the exercise options 
	 * menu by the user as a set of strings. The set is used for the 
	 * construction of the French Conjugation exercise.
	 * 
	 * @return
	 */
	public Set<String> getCompleteTenseSelection(){
		Set<String> selection = new HashSet<>();
		if(!selectedMoods.isEmpty()){
			List<String> moodNames = exerciseOptions.getMoodNames();
			for(String mn: moodNames){
				if(selectedMoods.get(mn)){
					selection.add(mn);
					String[] tenses = selectedTenses.get(mn);
					for(String tense : tenses){
						selection.add(mn + tense);
					}
				}
			}
		}
		
		return selection;		
	}		
	
	public boolean isDisplayCorrectAnswer() {
		return displayCorrectAnswer;
	}
	
	public void setDisplayCorrectAnswer(boolean displayCorrectAnswer) {
		this.displayCorrectAnswer = displayCorrectAnswer;
	}
	
	public boolean isEvaluated() {
		return evaluated;
	}
	
	private void setEvaluated(boolean evaluated) {
		this.evaluated = evaluated;		
	}
	
	public String getResultMessage() {
		return resultMessage;
	}
			
	/**
	 * Gets exercise title to be displayed on the exercise page.
	 * 
	 * @return
	 */
	public String getExerciseTitle(){
		return "exerciseTitle" + exercise.getExerciseType().toUpperCase();		
	}

	/**
	 * Action method for "Evaluate" and "I have no idea" buttons.
	 * Evaluates the answer and sets the result message.
	 * Parameter eval indicates which button was clicked (true for
	 * "Evaluate" and false for "I have no idea").
	 * 
	 * @return
	 */
	public String evaluateAction(){
		Map<String,String> parMap = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();		
		String eval = parMap.get("eval");
		Boolean e = Boolean.parseBoolean(eval);
		boolean c = exercise.evaluate(e);
		setDisplayCorrectAnswer(!c);
		setEvaluated(true);
		
		if(c && e){
			resultMessage = "exerciseCorrectAnswerResult";
		}else if(!c && e){
			resultMessage = "exerciseIncorrectAnswerResult";
		}else{
			resultMessage = "";
		}	
		return null;
	}

	/**
	 * Prepares the first exercise question (word) and redirects to exercise page.
	 * 
	 * @return
	 */
	public String prepareExerciseAction(){
		
		String eType = exercise.getExerciseType();
				
		switch(eType){
		case "frCon":
			Set<String> selection = getCompleteTenseSelection();
			if(selection.isEmpty()){
				FacesMessage errorMessage = new FacesMessage(
						messagesBundle.getString("exerciseSelectAtLeastOneMoodRM"));
				errorMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
				FacesContext.getCurrentInstance().addMessage(null, errorMessage);
				return null;
			} else {
				exercise.nextWord(service);
				return "exercise?faces-redirect=true&amp;includeViewParams=true";				
			}
		case "enDef":
			exercise.nextWord(service);
			return "exercise?faces-redirect=true&amp;includeViewParams=true";
		default:
			return null;
		}
		
		
	}

	/**
	 * Invoked after the answer is evaluated (result is shown) and continue 
	 * button is clicked. Prepares another exercise question (word).
	 * 
	 * @return
	 */
	public String exerciseAction(){
		setEvaluated(false);
		setDisplayCorrectAnswer(false);
		resultMessage = "";
		exercise.nextWord(service);
		return null;
	}	

	/**
	 * Creates a new exercise object according to the action event attribute 
	 * "exerciseType" using an ExerciseFactory instance.
	 * 
	 * @param event
	 */
	public void exerciseOptionsListener(ActionEvent event){
		String type = (String)event.getComponent().getAttributes().get("exerciseType");		
		ExerciseFactory ef = new ExerciseFactory();
		exercise = ef.getExercise(type);
	}

	/**
	 * Removes session beans ExerciseController from session map, 
	 * and starts a new exercise session.
	 * (redirects to exercise options page)
	 *  
	 * @return
	 */
	public String startAction(){
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove("exerciseController");
		return "exercise-options?faces-redirect=true&amp;includeViewParams=true";
	}

}