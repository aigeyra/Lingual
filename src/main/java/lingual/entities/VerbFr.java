package lingual.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="verb_fr")
@PrimaryKeyJoinColumn(referencedColumnName="WID")
@DiscriminatorValue("verb")
public class VerbFr extends WordFr{	

	private static final long serialVersionUID = -2831400485137325551L;
	public enum VerbGroup{
		Group1, Group2, Group3, Auxiliary;
		
		@Override
		public String toString(){
			switch(this){
			case Group1:
				return "1st";
			case Group2:
				return "2nd";
			case Group3:
				return "3rd";
			case Auxiliary:
				return "auxiliary";
			default:
				return "";					
			}
		}
	}
	
	@Transient
	private static final String wordType = "verb";
	
	@Transient
	private static final String language = "French";

	@Column(name = "VERB_GROUP", length = 30)
	private VerbGroup verbGroup;

	@Column(name = "TRANSITIVITY", length = 60)
	private String transitivity;
	
	//private long accentuationMask	

	@Column(name = "INDIC_PRESE_P1SG", length = 60)
	private String indicPreseP1sg;

	@Column(name = "INDIC_PRESE_P2SG", length = 60)
	private String indicPreseP2sg;

	@Column(name = "INDIC_PRESE_P3SG", length = 60)
	private String indicPreseP3sg;

	@Column(name = "INDIC_PRESE_P1PL", length = 60)
	private String indicPreseP1pl;

	@Column(name = "INDIC_PRESE_P2PL", length = 60)
	private String indicPreseP2pl;

	@Column(name = "INDIC_PRESE_P3PL", length = 60)
	private String indicPreseP3pl;

	@Column(name = "INDIC_PASSC_P1SG", length = 60)
	private String indicPasscP1sg;

	@Column(name = "INDIC_PASSC_P2SG", length = 60)
	private String indicPasscP2sg;

	@Column(name = "INDIC_PASSC_P3SG", length = 60)
	private String indicPasscP3sg;

	@Column(name = "INDIC_PASSC_P1PL", length = 60)
	private String indicPasscP1pl;

	@Column(name = "INDIC_PASSC_P2PL", length = 60)
	private String indicPasscP2pl;

	@Column(name = "INDIC_PASSC_P3PL", length = 60)
	private String indicPasscP3pl;

	@Column(name = "INDIC_IMPAR_P1SG", length = 60)
	private String indicImparP1sg;

	@Column(name = "INDIC_IMPAR_P2SG", length = 60)
	private String indicImparP2sg;

	@Column(name = "INDIC_IMPAR_P3SG", length = 60)
	private String indicImparP3sg;

	@Column(name = "INDIC_IMPAR_P1PL", length = 60)
	private String indicImparP1pl;

	@Column(name = "INDIC_IMPAR_P2PL", length = 60)
	private String indicImparP2pl;

	@Column(name = "INDIC_IMPAR_P3PL", length = 60)
	private String indicImparP3pl;

	@Column(name = "INDIC_PLUQP_P1SG", length = 60)
	private String indicPluqpP1sg;

	@Column(name = "INDIC_PLUQP_P2SG", length = 60)
	private String indicPluqpP2sg;

	@Column(name = "INDIC_PLUQP_P3SG", length = 60)
	private String indicPluqpP3sg;

	@Column(name = "INDIC_PLUQP_P1PL", length = 60)
	private String indicPluqpP1pl;

	@Column(name = "INDIC_PLUQP_P2PL", length = 60)
	private String indicPluqpP2pl;

	@Column(name = "INDIC_PLUQP_P3PL", length = 60)
	private String indicPluqpP3pl;

	@Column(name = "INDIC_PASSS_P1SG", length = 60)
	private String indicPasssP1sg;

	@Column(name = "INDIC_PASSS_P2SG", length = 60)
	private String indicPasssP2sg;

	@Column(name = "INDIC_PASSS_P3SG", length = 60)
	private String indicPasssP3sg;

	@Column(name = "INDIC_PASSS_P1PL", length = 60)
	private String indicPasssP1pl;

	@Column(name = "INDIC_PASSS_P2PL", length = 60)
	private String indicPasssP2pl;

	@Column(name = "INDIC_PASSS_P3PL", length = 60)
	private String indicPasssP3pl;

	@Column(name = "INDIC_PASSA_P1SG", length = 60)
	private String indicPassaP1sg;

	@Column(name = "INDIC_PASSA_P2SG", length = 60)
	private String indicPassaP2sg;

	@Column(name = "INDIC_PASSA_P3SG", length = 60)
	private String indicPassaP3sg;

	@Column(name = "INDIC_PASSA_P1PL", length = 60)
	private String indicPassaP1pl;

	@Column(name = "INDIC_PASSA_P2PL", length = 60)
	private String indicPassaP2pl;

	@Column(name = "INDIC_PASSA_P3PL", length = 60)
	private String indicPassaP3pl;

	@Column(name = "INDIC_FUTUS_P1SG", length = 60)
	private String indicFutusP1sg;

	@Column(name = "INDIC_FUTUS_P2SG", length = 60)
	private String indicFutusP2sg;

	@Column(name = "INDIC_FUTUS_P3SG", length = 60)
	private String indicFutusP3sg;

	@Column(name = "INDIC_FUTUS_P1PL", length = 60)
	private String indicFutusP1pl;

	@Column(name = "INDIC_FUTUS_P2PL", length = 60)
	private String indicFutusP2pl;

	@Column(name = "INDIC_FUTUS_P3PL", length = 60)
	private String indicFutusP3pl;

	@Column(name = "INDIC_FUTUA_P1SG", length = 60)
	private String indicFutuaP1sg;

	@Column(name = "INDIC_FUTUA_P2SG", length = 60)
	private String indicFutuaP2sg;

	@Column(name = "INDIC_FUTUA_P3SG", length = 60)
	private String indicFutuaP3sg;

	@Column(name = "INDIC_FUTUA_P1PL", length = 60)
	private String indicFutuaP1pl;

	@Column(name = "INDIC_FUTUA_P2PL", length = 60)
	private String indicFutuaP2pl;

	@Column(name = "INDIC_FUTUA_P3PL", length = 60)
	private String indicFutuaP3pl;

	@Column(name = "IMPER_PRESE_P2SG", length = 60)
	private String imperPreseP2sg;

	@Column(name = "IMPER_PRESE_P1PL", length = 60)
	private String imperPreseP1pl;

	@Column(name = "IMPER_PRESE_P2PL", length = 60)
	private String imperPreseP2pl;

	@Column(name = "IMPER_PASSE_P2SG", length = 60)
	private String imperPasseP2sg;

	@Column(name = "IMPER_PASSE_P1PL", length = 60)
	private String imperPasseP1pl;

	@Column(name = "IMPER_PASSE_P2PL", length = 60)
	private String imperPasseP2pl;

	@Column(name = "SUBJO_PRESE_P1SG", length = 60)
	private String subjoPreseP1sg;

	@Column(name = "SUBJO_PRESE_P2SG", length = 60)
	private String subjoPreseP2sg;

	@Column(name = "SUBJO_PRESE_P3SG", length = 60)
	private String subjoPreseP3sg;

	@Column(name = "SUBJO_PRESE_P1PL", length = 60)
	private String subjoPreseP1pl;

	@Column(name = "SUBJO_PRESE_P2PL", length = 60)
	private String subjoPreseP2pl;

	@Column(name = "SUBJO_PRESE_P3PL", length = 60)
	private String subjoPreseP3pl;

	@Column(name = "SUBJO_PASSE_P1SG", length = 60)
	private String subjoPasseP1sg;

	@Column(name = "SUBJO_PASSE_P2SG", length = 60)
	private String subjoPasseP2sg;

	@Column(name = "SUBJO_PASSE_P3SG", length = 60)
	private String subjoPasseP3sg;

	@Column(name = "SUBJO_PASSE_P1PL", length = 60)
	private String subjoPasseP1pl;

	@Column(name = "SUBJO_PASSE_P2PL", length = 60)
	private String subjoPasseP2pl;

	@Column(name = "SUBJO_PASSE_P3PL", length = 60)
	private String subjoPasseP3pl;

	@Column(name = "SUBJO_IMPAR_P1SG", length = 60)
	private String subjoImparP1sg;

	@Column(name = "SUBJO_IMPAR_P2SG", length = 60)
	private String subjoImparP2sg;

	@Column(name = "SUBJO_IMPAR_P3SG", length = 60)
	private String subjoImparP3sg;

	@Column(name = "SUBJO_IMPAR_P1PL", length = 60)
	private String subjoImparP1pl;

	@Column(name = "SUBJO_IMPAR_P2PL", length = 60)
	private String subjoImparP2pl;

	@Column(name = "SUBJO_IMPAR_P3PL", length = 60)
	private String subjoImparP3pl;

	@Column(name = "SUBJO_PLUQP_P1SG", length = 60)
	private String subjoPluqpP1sg;

	@Column(name = "SUBJO_PLUQP_P2SG", length = 60)
	private String subjoPluqpP2sg;

	@Column(name = "SUBJO_PLUQP_P3SG", length = 60)
	private String subjoPluqpP3sg;

	@Column(name = "SUBJO_PLUQP_P1PL", length = 60)
	private String subjoPluqpP1pl;

	@Column(name = "SUBJO_PLUQP_P2PL", length = 60)
	private String subjoPluqpP2pl;

	@Column(name = "SUBJO_PLUQP_P3PL", length = 60)
	private String subjoPluqpP3pl;

	@Column(name = "CONDI_PRESE_P1SG", length = 60)
	private String condiPreseP1sg;

	@Column(name = "CONDI_PRESE_P2SG", length = 60)
	private String condiPreseP2sg;

	@Column(name = "CONDI_PRESE_P3SG", length = 60)
	private String condiPreseP3sg;

	@Column(name = "CONDI_PRESE_P1PL", length = 60)
	private String condiPreseP1pl;

	@Column(name = "CONDI_PRESE_P2PL", length = 60)
	private String condiPreseP2pl;

	@Column(name = "CONDI_PRESE_P3PL", length = 60)
	private String condiPreseP3pl;

	@Column(name = "CONDI_PASSE_P1SG", length = 60)
	private String condiPasseP1sg;

	@Column(name = "CONDI_PASSE_P2SG", length = 60)
	private String condiPasseP2sg;

	@Column(name = "CONDI_PASSE_P3SG", length = 60)
	private String condiPasseP3sg;

	@Column(name = "CONDI_PASSE_P1PL", length = 60)
	private String condiPasseP1pl;

	@Column(name = "CONDI_PASSE_P2PL", length = 60)
	private String condiPasseP2pl;

	@Column(name = "CONDI_PASSE_P3PL", length = 60)
	private String condiPasseP3pl;

	@Column(name = "INFIN_PRESE", length = 60)
	private String infinPrese;

	@Column(name = "INFIN_PASSE", length = 60)
	private String infinPasse;

	@Column(name = "PARTI_PRESE", length = 60)
	private String partiPrese;

	@Column(name = "PARTI_PASSE1", length = 60)
	private String partiPasse1;

	@Column(name = "PARTI_PASSE2", length = 60)
	private String partiPasse2;

	@Column(name = "GERON_PRESE", length = 60)
	private String geronPrese;

	@Column(name = "GERON_PASSE", length = 60)
	private String geronPasse;

	public String getWordType() {
		return wordType;
	}

	public String getLanguage() {
		return language;
	}

	public VerbGroup getVerbGroup() {
		return verbGroup;
	}

	public void setVerbGroup(VerbGroup verbGroup) {
		this.verbGroup = verbGroup;
	}

	public String getTransitivity() {
		return transitivity;
	}

	public void setTransitivity(String transitivity) {
		this.transitivity = transitivity;
	}

	public String getIndicPreseP1sg() {
		return indicPreseP1sg;
	}

	public void setIndicPreseP1sg(String indicPreseP1sg) {
		this.indicPreseP1sg = indicPreseP1sg;
	}

	public String getIndicPreseP2sg() {
		return indicPreseP2sg;
	}

	public void setIndicPreseP2sg(String indicPreseP2sg) {
		this.indicPreseP2sg = indicPreseP2sg;
	}

	public String getIndicPreseP3sg() {
		return indicPreseP3sg;
	}

	public void setIndicPreseP3sg(String indicPreseP3sg) {
		this.indicPreseP3sg = indicPreseP3sg;
	}

	public String getIndicPreseP1pl() {
		return indicPreseP1pl;
	}

	public void setIndicPreseP1pl(String indicPreseP1pl) {
		this.indicPreseP1pl = indicPreseP1pl;
	}

	public String getIndicPreseP2pl() {
		return indicPreseP2pl;
	}

	public void setIndicPreseP2pl(String indicPreseP2pl) {
		this.indicPreseP2pl = indicPreseP2pl;
	}

	public String getIndicPreseP3pl() {
		return indicPreseP3pl;
	}

	public void setIndicPreseP3pl(String indicPreseP3pl) {
		this.indicPreseP3pl = indicPreseP3pl;
	}

	public String getIndicPasscP1sg() {
		return indicPasscP1sg;
	}

	public void setIndicPasscP1sg(String indicPasscP1sg) {
		this.indicPasscP1sg = indicPasscP1sg;
	}

	public String getIndicPasscP2sg() {
		return indicPasscP2sg;
	}

	public void setIndicPasscP2sg(String indicPasscP2sg) {
		this.indicPasscP2sg = indicPasscP2sg;
	}

	public String getIndicPasscP3sg() {
		return indicPasscP3sg;
	}

	public void setIndicPasscP3sg(String indicPasscP3sg) {
		this.indicPasscP3sg = indicPasscP3sg;
	}

	public String getIndicPasscP1pl() {
		return indicPasscP1pl;
	}

	public void setIndicPasscP1pl(String indicPasscP1pl) {
		this.indicPasscP1pl = indicPasscP1pl;
	}

	public String getIndicPasscP2pl() {
		return indicPasscP2pl;
	}

	public void setIndicPasscP2pl(String indicPasscP2pl) {
		this.indicPasscP2pl = indicPasscP2pl;
	}

	public String getIndicPasscP3pl() {
		return indicPasscP3pl;
	}

	public void setIndicPasscP3pl(String indicPasscP3pl) {
		this.indicPasscP3pl = indicPasscP3pl;
	}

	public String getIndicImparP1sg() {
		return indicImparP1sg;
	}

	public void setIndicImparP1sg(String indicImparP1sg) {
		this.indicImparP1sg = indicImparP1sg;
	}

	public String getIndicImparP2sg() {
		return indicImparP2sg;
	}

	public void setIndicImparP2sg(String indicImparP2sg) {
		this.indicImparP2sg = indicImparP2sg;
	}

	public String getIndicImparP3sg() {
		return indicImparP3sg;
	}

	public void setIndicImparP3sg(String indicImparP3sg) {
		this.indicImparP3sg = indicImparP3sg;
	}

	public String getIndicImparP1pl() {
		return indicImparP1pl;
	}

	public void setIndicImparP1pl(String indicImparP1pl) {
		this.indicImparP1pl = indicImparP1pl;
	}

	public String getIndicImparP2pl() {
		return indicImparP2pl;
	}

	public void setIndicImparP2pl(String indicImparP2pl) {
		this.indicImparP2pl = indicImparP2pl;
	}

	public String getIndicImparP3pl() {
		return indicImparP3pl;
	}

	public void setIndicImparP3pl(String indicImparP3pl) {
		this.indicImparP3pl = indicImparP3pl;
	}

	public String getIndicPluqpP1sg() {
		return indicPluqpP1sg;
	}

	public void setIndicPluqpP1sg(String indicPluqpP1sg) {
		this.indicPluqpP1sg = indicPluqpP1sg;
	}

	public String getIndicPluqpP2sg() {
		return indicPluqpP2sg;
	}

	public void setIndicPluqpP2sg(String indicPluqpP2sg) {
		this.indicPluqpP2sg = indicPluqpP2sg;
	}

	public String getIndicPluqpP3sg() {
		return indicPluqpP3sg;
	}

	public void setIndicPluqpP3sg(String indicPluqpP3sg) {
		this.indicPluqpP3sg = indicPluqpP3sg;
	}

	public String getIndicPluqpP1pl() {
		return indicPluqpP1pl;
	}

	public void setIndicPluqpP1pl(String indicPluqpP1pl) {
		this.indicPluqpP1pl = indicPluqpP1pl;
	}

	public String getIndicPluqpP2pl() {
		return indicPluqpP2pl;
	}

	public void setIndicPluqpP2pl(String indicPluqpP2pl) {
		this.indicPluqpP2pl = indicPluqpP2pl;
	}

	public String getIndicPluqpP3pl() {
		return indicPluqpP3pl;
	}

	public void setIndicPluqpP3pl(String indicPluqpP3pl) {
		this.indicPluqpP3pl = indicPluqpP3pl;
	}

	public String getIndicPasssP1sg() {
		return indicPasssP1sg;
	}

	public void setIndicPasssP1sg(String indicPasssP1sg) {
		this.indicPasssP1sg = indicPasssP1sg;
	}

	public String getIndicPasssP2sg() {
		return indicPasssP2sg;
	}

	public void setIndicPasssP2sg(String indicPasssP2sg) {
		this.indicPasssP2sg = indicPasssP2sg;
	}

	public String getIndicPasssP3sg() {
		return indicPasssP3sg;
	}

	public void setIndicPasssP3sg(String indicPasssP3sg) {
		this.indicPasssP3sg = indicPasssP3sg;
	}

	public String getIndicPasssP1pl() {
		return indicPasssP1pl;
	}

	public void setIndicPasssP1pl(String indicPasssP1pl) {
		this.indicPasssP1pl = indicPasssP1pl;
	}

	public String getIndicPasssP2pl() {
		return indicPasssP2pl;
	}

	public void setIndicPasssP2pl(String indicPasssP2pl) {
		this.indicPasssP2pl = indicPasssP2pl;
	}

	public String getIndicPasssP3pl() {
		return indicPasssP3pl;
	}

	public void setIndicPasssP3pl(String indicPasssP3pl) {
		this.indicPasssP3pl = indicPasssP3pl;
	}

	public String getIndicPassaP1sg() {
		return indicPassaP1sg;
	}

	public void setIndicPassaP1sg(String indicPassaP1sg) {
		this.indicPassaP1sg = indicPassaP1sg;
	}

	public String getIndicPassaP2sg() {
		return indicPassaP2sg;
	}

	public void setIndicPassaP2sg(String indicPassaP2sg) {
		this.indicPassaP2sg = indicPassaP2sg;
	}

	public String getIndicPassaP3sg() {
		return indicPassaP3sg;
	}

	public void setIndicPassaP3sg(String indicPassaP3sg) {
		this.indicPassaP3sg = indicPassaP3sg;
	}

	public String getIndicPassaP1pl() {
		return indicPassaP1pl;
	}

	public void setIndicPassaP1pl(String indicPassaP1pl) {
		this.indicPassaP1pl = indicPassaP1pl;
	}

	public String getIndicPassaP2pl() {
		return indicPassaP2pl;
	}

	public void setIndicPassaP2pl(String indicPassaP2pl) {
		this.indicPassaP2pl = indicPassaP2pl;
	}

	public String getIndicPassaP3pl() {
		return indicPassaP3pl;
	}

	public void setIndicPassaP3pl(String indicPassaP3pl) {
		this.indicPassaP3pl = indicPassaP3pl;
	}

	public String getIndicFutusP1sg() {
		return indicFutusP1sg;
	}

	public void setIndicFutusP1sg(String indicFutusP1sg) {
		this.indicFutusP1sg = indicFutusP1sg;
	}

	public String getIndicFutusP2sg() {
		return indicFutusP2sg;
	}

	public void setIndicFutusP2sg(String indicFutusP2sg) {
		this.indicFutusP2sg = indicFutusP2sg;
	}

	public String getIndicFutusP3sg() {
		return indicFutusP3sg;
	}

	public void setIndicFutusP3sg(String indicFutusP3sg) {
		this.indicFutusP3sg = indicFutusP3sg;
	}

	public String getIndicFutusP1pl() {
		return indicFutusP1pl;
	}

	public void setIndicFutusP1pl(String indicFutusP1pl) {
		this.indicFutusP1pl = indicFutusP1pl;
	}

	public String getIndicFutusP2pl() {
		return indicFutusP2pl;
	}

	public void setIndicFutusP2pl(String indicFutusP2pl) {
		this.indicFutusP2pl = indicFutusP2pl;
	}

	public String getIndicFutusP3pl() {
		return indicFutusP3pl;
	}

	public void setIndicFutusP3pl(String indicFutusP3pl) {
		this.indicFutusP3pl = indicFutusP3pl;
	}

	public String getIndicFutuaP1sg() {
		return indicFutuaP1sg;
	}

	public void setIndicFutuaP1sg(String indicFutuaP1sg) {
		this.indicFutuaP1sg = indicFutuaP1sg;
	}

	public String getIndicFutuaP2sg() {
		return indicFutuaP2sg;
	}

	public void setIndicFutuaP2sg(String indicFutuaP2sg) {
		this.indicFutuaP2sg = indicFutuaP2sg;
	}

	public String getIndicFutuaP3sg() {
		return indicFutuaP3sg;
	}

	public void setIndicFutuaP3sg(String indicFutuaP3sg) {
		this.indicFutuaP3sg = indicFutuaP3sg;
	}

	public String getIndicFutuaP1pl() {
		return indicFutuaP1pl;
	}

	public void setIndicFutuaP1pl(String indicFutuaP1pl) {
		this.indicFutuaP1pl = indicFutuaP1pl;
	}

	public String getIndicFutuaP2pl() {
		return indicFutuaP2pl;
	}

	public void setIndicFutuaP2pl(String indicFutuaP2pl) {
		this.indicFutuaP2pl = indicFutuaP2pl;
	}

	public String getIndicFutuaP3pl() {
		return indicFutuaP3pl;
	}

	public void setIndicFutuaP3pl(String indicFutuaP3pl) {
		this.indicFutuaP3pl = indicFutuaP3pl;
	}

	public String getImperPreseP2sg() {
		return imperPreseP2sg;
	}

	public void setImperPreseP2sg(String imperPreseP2sg) {
		this.imperPreseP2sg = imperPreseP2sg;
	}

	public String getImperPreseP1pl() {
		return imperPreseP1pl;
	}

	public void setImperPreseP1pl(String imperPreseP1pl) {
		this.imperPreseP1pl = imperPreseP1pl;
	}

	public String getImperPreseP2pl() {
		return imperPreseP2pl;
	}

	public void setImperPreseP2pl(String imperPreseP2pl) {
		this.imperPreseP2pl = imperPreseP2pl;
	}

	public String getImperPasseP2sg() {
		return imperPasseP2sg;
	}

	public void setImperPasseP2sg(String imperPasseP2sg) {
		this.imperPasseP2sg = imperPasseP2sg;
	}

	public String getImperPasseP1pl() {
		return imperPasseP1pl;
	}

	public void setImperPasseP1pl(String imperPasseP1pl) {
		this.imperPasseP1pl = imperPasseP1pl;
	}

	public String getImperPasseP2pl() {
		return imperPasseP2pl;
	}

	public void setImperPasseP2pl(String imperPasseP2pl) {
		this.imperPasseP2pl = imperPasseP2pl;
	}

	public String getSubjoPreseP1sg() {
		return subjoPreseP1sg;
	}

	public void setSubjoPreseP1sg(String subjoPreseP1sg) {
		this.subjoPreseP1sg = subjoPreseP1sg;
	}

	public String getSubjoPreseP2sg() {
		return subjoPreseP2sg;
	}

	public void setSubjoPreseP2sg(String subjoPreseP2sg) {
		this.subjoPreseP2sg = subjoPreseP2sg;
	}

	public String getSubjoPreseP3sg() {
		return subjoPreseP3sg;
	}

	public void setSubjoPreseP3sg(String subjoPreseP3sg) {
		this.subjoPreseP3sg = subjoPreseP3sg;
	}

	public String getSubjoPreseP1pl() {
		return subjoPreseP1pl;
	}

	public void setSubjoPreseP1pl(String subjoPreseP1pl) {
		this.subjoPreseP1pl = subjoPreseP1pl;
	}

	public String getSubjoPreseP2pl() {
		return subjoPreseP2pl;
	}

	public void setSubjoPreseP2pl(String subjoPreseP2pl) {
		this.subjoPreseP2pl = subjoPreseP2pl;
	}

	public String getSubjoPreseP3pl() {
		return subjoPreseP3pl;
	}

	public void setSubjoPreseP3pl(String subjoPreseP3pl) {
		this.subjoPreseP3pl = subjoPreseP3pl;
	}

	public String getSubjoPasseP1sg() {
		return subjoPasseP1sg;
	}

	public void setSubjoPasseP1sg(String subjoPasseP1sg) {
		this.subjoPasseP1sg = subjoPasseP1sg;
	}

	public String getSubjoPasseP2sg() {
		return subjoPasseP2sg;
	}

	public void setSubjoPasseP2sg(String subjoPasseP2sg) {
		this.subjoPasseP2sg = subjoPasseP2sg;
	}

	public String getSubjoPasseP3sg() {
		return subjoPasseP3sg;
	}

	public void setSubjoPasseP3sg(String subjoPasseP3sg) {
		this.subjoPasseP3sg = subjoPasseP3sg;
	}

	public String getSubjoPasseP1pl() {
		return subjoPasseP1pl;
	}

	public void setSubjoPasseP1pl(String subjoPasseP1pl) {
		this.subjoPasseP1pl = subjoPasseP1pl;
	}

	public String getSubjoPasseP2pl() {
		return subjoPasseP2pl;
	}

	public void setSubjoPasseP2pl(String subjoPasseP2pl) {
		this.subjoPasseP2pl = subjoPasseP2pl;
	}

	public String getSubjoPasseP3pl() {
		return subjoPasseP3pl;
	}

	public void setSubjoPasseP3pl(String subjoPasseP3pl) {
		this.subjoPasseP3pl = subjoPasseP3pl;
	}

	public String getSubjoImparP1sg() {
		return subjoImparP1sg;
	}

	public void setSubjoImparP1sg(String subjoImparP1sg) {
		this.subjoImparP1sg = subjoImparP1sg;
	}

	public String getSubjoImparP2sg() {
		return subjoImparP2sg;
	}

	public void setSubjoImparP2sg(String subjoImparP2sg) {
		this.subjoImparP2sg = subjoImparP2sg;
	}

	public String getSubjoImparP3sg() {
		return subjoImparP3sg;
	}

	public void setSubjoImparP3sg(String subjoImparP3sg) {
		this.subjoImparP3sg = subjoImparP3sg;
	}

	public String getSubjoImparP1pl() {
		return subjoImparP1pl;
	}

	public void setSubjoImparP1pl(String subjoImparP1pl) {
		this.subjoImparP1pl = subjoImparP1pl;
	}

	public String getSubjoImparP2pl() {
		return subjoImparP2pl;
	}

	public void setSubjoImparP2pl(String subjoImparP2pl) {
		this.subjoImparP2pl = subjoImparP2pl;
	}

	public String getSubjoImparP3pl() {
		return subjoImparP3pl;
	}

	public void setSubjoImparP3pl(String subjoImparP3pl) {
		this.subjoImparP3pl = subjoImparP3pl;
	}

	public String getSubjoPluqpP1sg() {
		return subjoPluqpP1sg;
	}

	public void setSubjoPluqpP1sg(String subjoPluqpP1sg) {
		this.subjoPluqpP1sg = subjoPluqpP1sg;
	}

	public String getSubjoPluqpP2sg() {
		return subjoPluqpP2sg;
	}

	public void setSubjoPluqpP2sg(String subjoPluqpP2sg) {
		this.subjoPluqpP2sg = subjoPluqpP2sg;
	}

	public String getSubjoPluqpP3sg() {
		return subjoPluqpP3sg;
	}

	public void setSubjoPluqpP3sg(String subjoPluqpP3sg) {
		this.subjoPluqpP3sg = subjoPluqpP3sg;
	}

	public String getSubjoPluqpP1pl() {
		return subjoPluqpP1pl;
	}

	public void setSubjoPluqpP1pl(String subjoPluqpP1pl) {
		this.subjoPluqpP1pl = subjoPluqpP1pl;
	}

	public String getSubjoPluqpP2pl() {
		return subjoPluqpP2pl;
	}

	public void setSubjoPluqpP2pl(String subjoPluqpP2pl) {
		this.subjoPluqpP2pl = subjoPluqpP2pl;
	}

	public String getSubjoPluqpP3pl() {
		return subjoPluqpP3pl;
	}

	public void setSubjoPluqpP3pl(String subjoPluqpP3pl) {
		this.subjoPluqpP3pl = subjoPluqpP3pl;
	}

	public String getCondiPreseP1sg() {
		return condiPreseP1sg;
	}

	public void setCondiPreseP1sg(String condiPreseP1sg) {
		this.condiPreseP1sg = condiPreseP1sg;
	}

	public String getCondiPreseP2sg() {
		return condiPreseP2sg;
	}

	public void setCondiPreseP2sg(String condiPreseP2sg) {
		this.condiPreseP2sg = condiPreseP2sg;
	}

	public String getCondiPreseP3sg() {
		return condiPreseP3sg;
	}

	public void setCondiPreseP3sg(String condiPreseP3sg) {
		this.condiPreseP3sg = condiPreseP3sg;
	}

	public String getCondiPreseP1pl() {
		return condiPreseP1pl;
	}

	public void setCondiPreseP1pl(String condiPreseP1pl) {
		this.condiPreseP1pl = condiPreseP1pl;
	}

	public String getCondiPreseP2pl() {
		return condiPreseP2pl;
	}

	public void setCondiPreseP2pl(String condiPreseP2pl) {
		this.condiPreseP2pl = condiPreseP2pl;
	}

	public String getCondiPreseP3pl() {
		return condiPreseP3pl;
	}

	public void setCondiPreseP3pl(String condiPreseP3pl) {
		this.condiPreseP3pl = condiPreseP3pl;
	}

	public String getCondiPasseP1sg() {
		return condiPasseP1sg;
	}

	public void setCondiPasseP1sg(String condiPasseP1sg) {
		this.condiPasseP1sg = condiPasseP1sg;
	}

	public String getCondiPasseP2sg() {
		return condiPasseP2sg;
	}

	public void setCondiPasseP2sg(String condiPasseP2sg) {
		this.condiPasseP2sg = condiPasseP2sg;
	}

	public String getCondiPasseP3sg() {
		return condiPasseP3sg;
	}

	public void setCondiPasseP3sg(String condiPasseP3sg) {
		this.condiPasseP3sg = condiPasseP3sg;
	}

	public String getCondiPasseP1pl() {
		return condiPasseP1pl;
	}

	public void setCondiPasseP1pl(String condiPasseP1pl) {
		this.condiPasseP1pl = condiPasseP1pl;
	}

	public String getCondiPasseP2pl() {
		return condiPasseP2pl;
	}

	public void setCondiPasseP2pl(String condiPasseP2pl) {
		this.condiPasseP2pl = condiPasseP2pl;
	}

	public String getCondiPasseP3pl() {
		return condiPasseP3pl;
	}

	public void setCondiPasseP3pl(String condiPasseP3pl) {
		this.condiPasseP3pl = condiPasseP3pl;
	}

	public String getInfinPrese() {
		return infinPrese;
	}

	public void setInfinPrese(String infinPrese) {
		this.infinPrese = infinPrese;
	}

	public String getInfinPasse() {
		return infinPasse;
	}

	public void setInfinPasse(String infinPasse) {
		this.infinPasse = infinPasse;
	}

	public String getPartiPrese() {
		return partiPrese;
	}

	public void setPartiPrese(String partiPrese) {
		this.partiPrese = partiPrese;
	}

	public String getPartiPasse1() {
		return partiPasse1;
	}

	public void setPartiPasse1(String partiPasse1) {
		this.partiPasse1 = partiPasse1;
	}

	public String getPartiPasse2() {
		return partiPasse2;
	}

	public void setPartiPasse2(String partiPasse2) {
		this.partiPasse2 = partiPasse2;
	}

	public String getGeronPrese() {
		return geronPrese;
	}

	public void setGeronPrese(String geronPrese) {
		this.geronPrese = geronPrese;
	}

	public String getGeronPasse() {
		return geronPasse;
	}

	public void setGeronPasse(String geronPasse) {
		this.geronPasse = geronPasse;
	}
	
}