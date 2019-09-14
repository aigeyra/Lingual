package lingual.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="conjunction_en")
@PrimaryKeyJoinColumn(referencedColumnName="WID")
@DiscriminatorValue("conjunction")
public class ConjunctionEn extends WordEn{
	private static final long serialVersionUID = 5396741354898213961L;
	
	@Transient
	private static final String wordType = "conjunction";
	
	@Transient
	private static final String language = "English";

	public String getWordType() {
		return wordType;
	}	
	
	public String getLanguage() {
		return language;
	}


}
