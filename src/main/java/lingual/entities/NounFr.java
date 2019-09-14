package lingual.entities;


public class NounFr extends WordFr{

	private static final long serialVersionUID = -5010164740519384343L;
	

	private static final String wordType = "noun";
	

	private static final String language = "French";
	
	private Gender gender;
	

	private String plural;

	public enum Gender {
		M, F;
		
		@Override
		public String toString(){
			switch(this){
			case M:
				return "Masculine";
			case F:
				return "Feminine";
			default:
				return "";					
			}
		}
	}	

	public String getWordType() {
		return wordType;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getPlural() {
		return plural;
	}

	public void setPlural(String plural) {
		this.plural = plural;
	}

}