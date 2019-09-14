package lingual.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="determiner_en")
@PrimaryKeyJoinColumn(referencedColumnName="WID")
@DiscriminatorValue("determiner")
public class DeterminerEn extends WordEn{
	private static final long serialVersionUID = -5604305884514567726L;
	
	@Transient
	private static final String wordType = "determiner";
	
	@Transient
	private static final String language = "English";

	public String getWordType() {
		return wordType;
	}	
	
	public String getLanguage() {
		return language;
	}


}
