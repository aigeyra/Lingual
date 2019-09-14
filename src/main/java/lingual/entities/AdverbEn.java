package lingual.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="adverb_en")
@PrimaryKeyJoinColumn(referencedColumnName="WID")
@DiscriminatorValue("adverb")
public class AdverbEn extends WordEn {
	private static final long serialVersionUID = 2809807520991998528L;
	
	@Transient
	private static final String wordType = "adverb";
	
	@Transient
	private static final String language = "English";

	public String getWordType() {
		return wordType;
	}	
	
	public String getLanguage() {
		return language;
	}

}
