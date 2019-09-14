package lingual.entities;

import java.io.Serializable;

public class Word implements Serializable{

	private static final long serialVersionUID = -2223394618611281088L;

	private int wid;

	private int cwid;

	private String name;

	private String definition;
	
	private String pronunciation;
	
	private static final String wordType = null;
	
	private static final String language = null;

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
	
	public String getWordType() {
		return wordType;
	}
	
	public String getLanguage() {
		return language;
	}

	public Word(){
		super();
	}

}
