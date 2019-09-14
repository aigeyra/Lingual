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
@Table(name="word_fr")
@Inheritance( strategy = InheritanceType.JOINED )
@DiscriminatorColumn(name = "WORD_CLASS", discriminatorType = DiscriminatorType.STRING, length = 12)
@NamedQueries({
	@NamedQuery(name = "Find French word",
				query = "SELECT w FROM WordFr w WHERE w.name = :name"),
	@NamedQuery(name = "Find similar French word",
				query = "SELECT w FROM WordFr w WHERE w.name REGEXP :name"),
	@NamedQuery(name = "Select random French word",
				 query = "SELECT w FROM WordFr w WHERE w.cwid = :id"),
})
public abstract class WordFr extends Word{

	private static final long serialVersionUID = -4385266454553066900L;
	
	@TableGenerator(name = "WORD_GEN_FR", table = "ID_GEN_FR", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", allocationSize = 1)
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "WORD_GEN_FR")
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