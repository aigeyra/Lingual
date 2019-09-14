package lingual.beans;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class LanguageOptionsManager {
	private String[] languages = {"English", "French"};
	private Map<String,List<String>> usefulLinksMap;

	public String[] getLanguages() {
		return languages;
	}
	
	public Map<String,List<String>> getUsefulLinksMap() {
		return usefulLinksMap;
	}

	public LanguageOptionsManager() {
		usefulLinksMap = new LinkedHashMap<>();
		usefulLinksMap.put("English", Arrays.asList(
				"http://www.oxforddictionaries.com", 
				"http://www.omniglot.com/rywsut"
		));		
		usefulLinksMap.put("French", Arrays.asList(
				"http://grammaire.reverso.net", 
				"http://www.french-linguistics.co.uk/grammar",
				"http://www.omniglot.com/rywsut"
		));		
	}	
	
}
