package lingual.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
@ApplicationScoped
public class ExerciseOptionsManager implements Serializable{
	private static final long serialVersionUID = 2859776251020591603L;	
	private static final ResourceBundle bundle = 
			ResourceBundle.getBundle("wordLabels", FacesContext.getCurrentInstance().getViewRoot().getLocale());
	private Map<String,List<String>> moodsMap;

	public List<String> getMoodNames() {
		List<String> moodNames = new ArrayList<>();
		Set<Map.Entry<String,List<String>>> moodsSet = moodsMap.entrySet();
		Iterator<Map.Entry<String,List<String>>> it = moodsSet.iterator();
		while(it.hasNext()){
			Map.Entry<String, List<String>> mood = it.next();
			moodNames.add(mood.getKey());;
		}
		return moodNames;
	}
	
	public List<String> getTenses(String moodName){
		return moodsMap.get(moodName);
	}
	
	public ExerciseOptionsManager() {
		moodsMap = new LinkedHashMap<>();
		
		moodsMap.put(bundle.getString("indicLabel"),
				Arrays.asList(
						bundle.getString("indicPreseLabel"),
						bundle.getString("indicPasscLabel"),
						bundle.getString("indicImparLabel"),
						bundle.getString("indicFutusLabel")));
		
		moodsMap.put(bundle.getString("imperLabel"), 
				Arrays.asList(
						bundle.getString("imperPreseLabel")));
		
		moodsMap.put(bundle.getString("subjoLabel"),
				Arrays.asList(
						bundle.getString("subjoPreseLabel"),
						bundle.getString("subjoPasseLabel")));
		
		moodsMap.put(bundle.getString("condiLabel"),
				Arrays.asList(
						bundle.getString("condiPreseLabel")));
	
	}
	
}
