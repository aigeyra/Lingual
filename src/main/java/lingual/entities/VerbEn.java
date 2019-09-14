package lingual.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="verb_en")
@PrimaryKeyJoinColumn(referencedColumnName="WID")
@DiscriminatorValue("verb")
public class VerbEn extends WordEn{

	private static final long serialVersionUID = -6041927679648415921L;
	@Transient
	private static final String wordType = "verb";	
	
	@Transient
	private static final String language = "English";
	
	@Column(name="PAST_TENSE", length = 30)
	private String pastTense;
	
	@Column(name="PAST_PARTICIPLE", length = 30)
	private String pastParticiple;
	
	public String getWordType() {
		return wordType;
	}	
	
	public String getLanguage() {
		return language;
	}
	
	public String getPastTense() {
		return pastTense;
	}
	
	public void setPastTense(String pastTense) {
		this.pastTense = pastTense;
	}
	
	public String getPastParticiple() {
		return pastParticiple;
	}
	
	public void setPastParticiple(String pastParticiple) {
		this.pastParticiple = pastParticiple;
	}

}