package lingual.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="word_en")
@Inheritance( strategy = InheritanceType.JOINED )
@DiscriminatorColumn(name = "WORD_CLASS", discriminatorType = DiscriminatorType.STRING, length = 12)
@NamedQueries({
	@NamedQuery(name = "Find English word",
				query = "SELECT w FROM WordEn w WHERE w.name = :name"),
	@NamedQuery(name = "Find similar English word",
				query = "SELECT w FROM WordEn w WHERE w.name REGEXP :name"),
	@NamedQuery(name = "Select random English word",
				query = "SELECT w FROM WordEn w WHERE w.cwid = :id"),
})
public abstract class WordEn extends Word{

	private static final long serialVersionUID = 7516901538082354636L;
	
	
	@TableGenerator(name = "WORD_GEN_EN", table = "ID_GEN_EN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", allocationSize = 1)
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "WORD_GEN_EN")
	private int wid;
	
	@Column(name = "CWID")
	private int cwid;

	@Column(name = "NAME", nullable = false, length = 30)
	private String name;
	
	@Column(name = "DEFINITION", columnDefinition = "TEXT")
	private String definition;
	
	@Column(name = "PRONUNCIATION", length = 30)
	private String pronunciation;
	
	public int getWid() {
		return wid;
	}

	public void setWid(int wid) {
		this.wid = wid;
	}
	
	public int getCwid() {
		return cwid;
	}

	public void setCwid(int cwid) {
		this.cwid = cwid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getDefinition() {
		return definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}
	
	public String getPronunciation() {
		return pronunciation;
	}

	public void setPronunciation(String pronunciation) {
		this.pronunciation = pronunciation;
	}


}