package lingual.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="preposition_en")
@PrimaryKeyJoinColumn(referencedColumnName="WID")
@DiscriminatorValue("preposition")
public class PrepositionEn extends WordEn{
	private static final long serialVersionUID = 3700547944300222886L;
	
	@Transient
	private static final String wordType = "preposition";
	
	@Transient
	private static final String language = "English";

	public String getWordType() {
		return wordType;
	}	
	
	public String getLanguage() {
		return language;
	}


}
