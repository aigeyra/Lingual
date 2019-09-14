package lingual.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="pronoun_en")
@PrimaryKeyJoinColumn(referencedColumnName="WID")
@DiscriminatorValue("pronoun")
public class PronounEn extends WordEn {
	private static final long serialVersionUID = 7380398915710172022L;
	
	@Transient
	private static final String wordType = "pronoun";
	
	@Transient
	private static final String language = "English";

	public String getWordType() {
		return wordType;
	}	
	
	public String getLanguage() {
		return language;
	}

}
