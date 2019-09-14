package lingual.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="adjective_en")
@PrimaryKeyJoinColumn(referencedColumnName="WID")
@DiscriminatorValue("adjective")
public class AdjectiveEn extends WordEn{
	private static final long serialVersionUID = 2797420279319505897L;
	
	@Transient
	private static final String wordType = "adjective";
	
	@Transient
	private static final String language = "English";

	public String getWordType() {
		return wordType;
	}	
	
	public String getLanguage() {
		return language;
	}


}
