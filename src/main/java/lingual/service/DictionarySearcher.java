package lingual.service;

import java.io.Serializable;
import java.util.List;
import java.util.Random;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import lingual.entities.Word;

@ManagedBean(name="simpleLookupService", eager=true)
@ApplicationScoped
public class DictionarySearcher implements WordLookupService, Serializable{

	private static final long serialVersionUID = -2654764610181091667L;

	
	/* (non-Javadoc)
	 * @see lingual.service.WordLookupService#selectRandomly(java.lang.String, int)
	 */
	@Override
	public Word selectRandomly(String language, int range) {		
		EntityManager em = EMF.get().createEntityManager();		
		TypedQuery<Word> query = null;
		
		if(range > 0) {
			Random r = new Random();			
			int id = r.nextInt(range) + 1;
		
			String queryName = "Select random " + language + " word";
			query = em.createNamedQuery(queryName, Word.class);			
			
			query.setParameter("id", id);
			List<Word> wordList = query.getResultList();
			
		    return wordList != null ? (wordList.size() > 0 ? wordList.get(0) : null) : null;
		} else {
			return null;
		}
	}
	
	/* (non-Javadoc)
	 * @see lingual.service.WordLookupService#find(java.lang.String, java.lang.String, boolean)
	 */
	@Override
	public List<Word> find(String language, String name, boolean useRegexp) {
		EntityManager em = EMF.get().createEntityManager();		
		TypedQuery<Word> query = null;	
				
		if(name != null) {			
			String similarity = useRegexp ? "similar " : "";
			String queryName = "Find " + similarity + language + " word";
			query = em.createNamedQuery(queryName, Word.class);			
			
			query.setParameter("name", name.toLowerCase());
			List<Word> wordList = query.getResultList();
			return wordList;			
		} else {
			return null;
		}
	}
}

