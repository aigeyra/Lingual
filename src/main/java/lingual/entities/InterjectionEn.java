package lingual.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="interjection_en")
@PrimaryKeyJoinColumn(referencedColumnName="WID")
@DiscriminatorValue("interjection")
public class InterjectionEn extends WordEn{
	private static final long serialVersionUID = -5834882513522304410L;
	
	@Transient
	private static final String wordType = "interjection";
	
	@Transient
	private static final String language = "English";

	public String getWordType() {
		return wordType;
	}	
	
	public String getLanguage() {
		return language;
	}


}
