package lingual.beans;

import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import lingual.entities.Word;
import lingual.service.WordLookupService;

@ManagedBean
@ViewScoped
public class SearchController implements Serializable{

	private static final long serialVersionUID = 1591355912415998440L;
	private final int showResultLimit = 100;
	private List<Word> result;
	private Boolean showResult;	
	private String resultMessage;
	private String wordName;
	private Word selectedWord;	

	@ManagedProperty(value="#{sessionManager}")
	private SessionManager session;
	
	@ManagedProperty(value="#{simpleLookupService}")
	private WordLookupService service;
	
	public String getWordName() {
		return wordName;
	}

	/**
	 * Sets a wordName and then finds a word by name.
	 * Word search is placed in this setter method 
	 * due to page bookmarking purposes.
	 * @param wordName
	 */
	public void setWordName(String wordName) {
		this.wordName = wordName;
		result = service.find(session.getLanguage(), wordName, false);
		resultMessage = "searchResultFound";		
		showResult = result != null && result.size() < showResultLimit;
	}	
	
	public Word getSelectedWord() {
		return selectedWord;
	}
		
	public void setSelectedWord(Word selectedWord) {
		this.selectedWord = selectedWord;
	}	
	
	public List<Word> getResult() {
		return result;
	}
	
	public Integer getResultSize() {
		return result.size();
	}
	
	public Boolean getShowResult() {
		return showResult;
	}	
	
	public String getResultMessage() {
		return resultMessage;
	}

	public String showResultAction(){
		showResult = true;
		return null;
	}

	public void setSession(SessionManager session) {
		this.session = session;
	}

	public void setService(WordLookupService service) {
		this.service = service;
	}
	
	/**
	 * Creates a regexp pattern for the given word (str param).
	 * This pattern is used for searching for similar words to the given one.
	 * 
	 * @param str	word of which the pattern is made
	 * @return
	 */
	private String createSimilarWordRegexp(String str) {
		if(str.length() < 4){
			return null;
		}
		return  "^" + str.substring(0, str.length() - 2) + "[a-z-]{0,3}$";		
	}	
	
	/**
	 * Sets a selected word
	 * 
	 * @return
	 */
	public void selectedWordListener(ActionEvent event){	
		selectedWord = (Word)event.getComponent().getAttributes().get("selectedWord");
	}
	
	/**
	 * Sets a selected word and inserts it into the search history
	 * 
	 * @return
	 */
	public void selectedWordHistoryListener(ActionEvent event){	
		selectedWord = (Word)event.getComponent().getAttributes().get("selectedWord");
		session.getSearchHistory().addWord(selectedWord);
	}
	
	/**
	 * Action controller method. If there were no items found
	 * (setWordName setter method searches a word by name) than 
	 * creates a regexp pattern to find suggestions.
	 * 
	 * @return
	 */
	public String submit(){
		boolean suggestionSearch;		
		// items matching the entered word found 
		if(result != null && !result.isEmpty()){
			suggestionSearch = false;	
		}else{
			// no items matching exactly the entered word were found,
			// get a regexp pattern and use it for searching for items to be suggested.
			suggestionSearch = true;
			String similarWordRegexp = createSimilarWordRegexp(wordName);
			result = service.find(session.getLanguage(), similarWordRegexp, true);			
			
			// even no items for suggestion were found
			if(result == null || result.isEmpty()){
				ResourceBundle bundle = ResourceBundle.getBundle("messages", FacesContext.getCurrentInstance().getViewRoot().getLocale());
				FacesMessage errorMessage = new FacesMessage(bundle.getString("searchNoItemsFound"));
				errorMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
				FacesContext.getCurrentInstance().addMessage("wordsForm:wordInput", errorMessage);
			}
		}
		
		resultMessage = suggestionSearch ? "searchResultSuggestionsFound" : "searchResultFound";		
		showResult = result != null && result.size() < showResultLimit;
		return null;
	}

	/**
	 * Starts a new search session, the search history will be kept
	 * (redirects to search page).
	 * @return
	 */
	public String startAction(){
		return "search?faces-redirect=true&amp;includeViewParams=true";
	} 
}