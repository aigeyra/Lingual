package lingual.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="noun_en")
@PrimaryKeyJoinColumn(referencedColumnName="WID")
@DiscriminatorValue("noun")
public class NounEn extends WordEn{

	private static final long serialVersionUID = 884916896430836710L;

	@Transient
	private static final String wordType = "noun";	
	
	@Transient
	private static final String language = "English";
	
	@Column(name="PLURAL", length = 30)
	private String plural;
	
	public String getWordType() {
		return wordType;
	}	
	
	public String getLanguage() {
		return language;
	}

	public String getPlural() {
		return plural;
	}
		
	public void setPlural(String plural) {
		this.plural = plural;
	}
	
}