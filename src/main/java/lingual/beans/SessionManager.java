package lingual.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import lingual.entities.Word;

@ManagedBean
@SessionScoped
public class SessionManager implements Serializable{
	private static final long serialVersionUID = -1678854033616262908L;
	private String language;
	private SearchHistory searchHistory = new SearchHistory();
	private String mode = "";
	
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}		
	
	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * Gets the search history as an array of Word objects.
	 * @return		search history
	 */
	public Word[] getSearchHistoryArray() {
		return searchHistory.toArray();
	}
	
	/**
	 * Gets the search history as a SearchHistory object.
	 * @return		search history
	 */
	public SearchHistory getSearchHistory(){
		return searchHistory;
	}
	
	/**
	 * Removes session beans: sessionManager, exerciseController, 
	 * and searchController from session map, and starts a new session
	 * (redirects to welcome page).
	 * 
	 * @return 
	 */
	public String startAction(){
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove("sessionManager");
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove("exerciseController");				
		return "welcome?faces-redirect=true";				
	}

	/**
	 * Returns style class suffix "-active" for the active mode
	 * or empty String for inactive modes.
	 * 
	 * @param	m	mode
	 * @return		style class suffix
	 */
	public String isActiveMode(String m){
		String ret = "";
		if(this.mode.equals(m)){
			ret = "-active";
		}		
		return ret;
	}
	

}