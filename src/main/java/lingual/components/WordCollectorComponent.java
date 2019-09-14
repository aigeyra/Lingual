package lingual.components;

import java.io.IOException;
import java.util.ResourceBundle;
import java.util.Set;

import javax.faces.component.FacesComponent;
import javax.faces.component.NamingContainer;
import javax.faces.component.UIInput;
import javax.faces.component.UIOutput;
import javax.faces.context.FacesContext;
import javax.faces.convert.ConverterException;

import lingual.entities.NounEn;
import lingual.entities.NounFr;
import lingual.entities.VerbEn;
import lingual.entities.VerbFr;
import lingual.entities.Word;
import lingual.entities.WordFactory;

@FacesComponent("lingual.components.WordCollectorComponent")
public class WordCollectorComponent extends UIInput implements NamingContainer{
	
	private static final ResourceBundle bundle = ResourceBundle.getBundle("wordLabels", FacesContext.getCurrentInstance().getViewRoot().getLocale());
	
	private static final String NAME_LABEL = bundle.getString("nameLabelED");
	private static final String TYPE_LABEL = bundle.getString("typeLabel");
	private static final String DEFINITION_LABEL = bundle.getString("definitionLabel");
	private static final String PLURAL_LABEL = bundle.getString("pluralLabel");
	private static final String PAST_TENSE_LABEL = bundle.getString("pastTenseLabel");
	private static final String PAST_PARTICIPLE_LABEL = bundle.getString("pastParticipleLabel");
	private static final String GENDER_LABEL = bundle.getString("genderLabel");
	private static final String VERB_GROUP_LABEL = bundle.getString("verbGroupLabel");
	private static final String TRANSITIVITY_LABEL = bundle.getString("transitivityLabel");
	private static final String INDIC_PRESE_P1SG_LABEL = bundle.getString("indicPreseP1sgLabel");
	private static final String INDIC_PRESE_P2SG_LABEL = bundle.getString("indicPreseP2sgLabel");
	private static final String INDIC_PRESE_P3SG_LABEL = bundle.getString("indicPreseP3sgLabel");
	private static final String INDIC_PRESE_P1PL_LABEL = bundle.getString("indicPreseP1plLabel");
	private static final String INDIC_PRESE_P2PL_LABEL = bundle.getString("indicPreseP2plLabel");
	private static final String INDIC_PRESE_P3PL_LABEL = bundle.getString("indicPreseP3plLabel");
	private static final String INDIC_PASSC_P1SG_LABEL = bundle.getString("indicPasscP1sgLabel");
	private static final String INDIC_PASSC_P2SG_LABEL = bundle.getString("indicPasscP2sgLabel");
	private static final String INDIC_PASSC_P3SG_LABEL = bundle.getString("indicPasscP3sgLabel");
	private static final String INDIC_PASSC_P1PL_LABEL = bundle.getString("indicPasscP1plLabel");
	private static final String INDIC_PASSC_P2PL_LABEL = bundle.getString("indicPasscP2plLabel");
	private static final String INDIC_PASSC_P3PL_LABEL = bundle.getString("indicPasscP3plLabel");
	private static final String INDIC_IMPAR_P1SG_LABEL = bundle.getString("indicImparP1sgLabel");
	private static final String INDIC_IMPAR_P2SG_LABEL = bundle.getString("indicImparP2sgLabel");
	private static final String INDIC_IMPAR_P3SG_LABEL = bundle.getString("indicImparP3sgLabel");
	private static final String INDIC_IMPAR_P1PL_LABEL = bundle.getString("indicImparP1plLabel");
	private static final String INDIC_IMPAR_P2PL_LABEL = bundle.getString("indicImparP2plLabel");
	private static final String INDIC_IMPAR_P3PL_LABEL = bundle.getString("indicImparP3plLabel");
	private static final String INDIC_FUTUS_P1SG_LABEL = bundle.getString("indicFutusP1sgLabel");
	private static final String INDIC_FUTUS_P2SG_LABEL = bundle.getString("indicFutusP2sgLabel");
	private static final String INDIC_FUTUS_P3SG_LABEL = bundle.getString("indicFutusP3sgLabel");
	private static final String INDIC_FUTUS_P1PL_LABEL = bundle.getString("indicFutusP1plLabel");
	private static final String INDIC_FUTUS_P2PL_LABEL = bundle.getString("indicFutusP2plLabel");
	private static final String INDIC_FUTUS_P3PL_LABEL = bundle.getString("indicFutusP3plLabel");
	private static final String IMPER_PRESE_P2SG_LABEL = bundle.getString("imperPreseP2sgLabel");
	private static final String IMPER_PRESE_P1PL_LABEL = bundle.getString("imperPreseP1plLabel");
	private static final String IMPER_PRESE_P2PL_LABEL = bundle.getString("imperPreseP2plLabel");
	private static final String SUBJO_PRESE_P1SG_LABEL = bundle.getString("subjoPreseP1sgLabel");
	private static final String SUBJO_PRESE_P2SG_LABEL = bundle.getString("subjoPreseP2sgLabel");
	private static final String SUBJO_PRESE_P3SG_LABEL = bundle.getString("subjoPreseP3sgLabel");
	private static final String SUBJO_PRESE_P1PL_LABEL = bundle.getString("subjoPreseP1plLabel");
	private static final String SUBJO_PRESE_P2PL_LABEL = bundle.getString("subjoPreseP2plLabel");
	private static final String SUBJO_PRESE_P3PL_LABEL = bundle.getString("subjoPreseP3plLabel");
	private static final String SUBJO_PASSE_P1SG_LABEL = bundle.getString("subjoPasseP1sgLabel");
	private static final String SUBJO_PASSE_P2SG_LABEL = bundle.getString("subjoPasseP2sgLabel");
	private static final String SUBJO_PASSE_P3SG_LABEL = bundle.getString("subjoPasseP3sgLabel");
	private static final String SUBJO_PASSE_P1PL_LABEL = bundle.getString("subjoPasseP1plLabel");
	private static final String SUBJO_PASSE_P2PL_LABEL = bundle.getString("subjoPasseP2plLabel");
	private static final String SUBJO_PASSE_P3PL_LABEL = bundle.getString("subjoPasseP3plLabel");
	private static final String CONDI_PRESE_P1SG_LABEL = bundle.getString("condiPreseP1sgLabel");
	private static final String CONDI_PRESE_P2SG_LABEL = bundle.getString("condiPreseP2sgLabel");
	private static final String CONDI_PRESE_P3SG_LABEL = bundle.getString("condiPreseP3sgLabel");
	private static final String CONDI_PRESE_P1PL_LABEL = bundle.getString("condiPreseP1plLabel");
	private static final String CONDI_PRESE_P2PL_LABEL = bundle.getString("condiPreseP2plLabel");
	private static final String CONDI_PRESE_P3PL_LABEL = bundle.getString("condiPreseP3plLabel");
	private static final String INDIC_PRESE_LABEL = bundle.getString("indicPreseLabel");
	private static final String INDIC_PASSC_LABEL = bundle.getString("indicPasscLabel");
	private static final String INDIC_IMPAR_LABEL = bundle.getString("indicImparLabel");
	private static final String INDIC_FUTUS_LABEL = bundle.getString("indicFutusLabel");
	private static final String IMPER_PRESE_LABEL = bundle.getString("imperPreseLabel");
	private static final String SUBJO_PRESE_LABEL = bundle.getString("subjoPreseLabel");
	private static final String SUBJO_PASSE_LABEL = bundle.getString("subjoPasseLabel");
	private static final String CONDI_PRESE_LABEL = bundle.getString("condiPreseLabel");
	private static final String INDIC_LABEL = bundle.getString("indicLabel");
	private static final String IMPER_LABEL = bundle.getString("imperLabel");
	private static final String SUBJO_LABEL = bundle.getString("subjoLabel");
	private static final String CONDI_LABEL = bundle.getString("condiLabel");
	private static final String NAME_RM = bundle.getString("nameRM");
	private static final String INDIC_PRESE_P1SG_RM = bundle.getString("indicPreseP1sgRM");
	private static final String INDIC_PRESE_P2SG_RM = bundle.getString("indicPreseP2sgRM");
	private static final String INDIC_PRESE_P3SG_RM = bundle.getString("indicPreseP3sgRM");
	private static final String INDIC_PRESE_P1PL_RM = bundle.getString("indicPreseP1plRM");
	private static final String INDIC_PRESE_P2PL_RM = bundle.getString("indicPreseP2plRM");
	private static final String INDIC_PRESE_P3PL_RM = bundle.getString("indicPreseP3plRM");
	private static final String INDIC_PASSC_P1SG_RM = bundle.getString("indicPasscP1sgRM");
	private static final String INDIC_PASSC_P2SG_RM = bundle.getString("indicPasscP2sgRM");
	private static final String INDIC_PASSC_P3SG_RM = bundle.getString("indicPasscP3sgRM");
	private static final String INDIC_PASSC_P1PL_RM = bundle.getString("indicPasscP1plRM");
	private static final String INDIC_PASSC_P2PL_RM = bundle.getString("indicPasscP2plRM");
	private static final String INDIC_PASSC_P3PL_RM = bundle.getString("indicPasscP3plRM");
	private static final String INDIC_IMPAR_P1SG_RM = bundle.getString("indicImparP1sgRM");
	private static final String INDIC_IMPAR_P2SG_RM = bundle.getString("indicImparP2sgRM");
	private static final String INDIC_IMPAR_P3SG_RM = bundle.getString("indicImparP3sgRM");
	private static final String INDIC_IMPAR_P1PL_RM = bundle.getString("indicImparP1plRM");
	private static final String INDIC_IMPAR_P2PL_RM = bundle.getString("indicImparP2plRM");
	private static final String INDIC_IMPAR_P3PL_RM = bundle.getString("indicImparP3plRM");
	private static final String INDIC_FUTUS_P1SG_RM = bundle.getString("indicFutusP1sgRM");
	private static final String INDIC_FUTUS_P2SG_RM = bundle.getString("indicFutusP2sgRM");
	private static final String INDIC_FUTUS_P3SG_RM = bundle.getString("indicFutusP3sgRM");
	private static final String INDIC_FUTUS_P1PL_RM = bundle.getString("indicFutusP1plRM");
	private static final String INDIC_FUTUS_P2PL_RM = bundle.getString("indicFutusP2plRM");
	private static final String INDIC_FUTUS_P3PL_RM = bundle.getString("indicFutusP3plRM");
	private static final String IMPER_PRESE_P2SG_RM = bundle.getString("imperPreseP2sgRM");
	private static final String IMPER_PRESE_P1PL_RM = bundle.getString("imperPreseP1plRM");
	private static final String IMPER_PRESE_P2PL_RM = bundle.getString("imperPreseP2plRM");
	private static final String SUBJO_PRESE_P1SG_RM = bundle.getString("subjoPreseP1sgRM");
	private static final String SUBJO_PRESE_P2SG_RM = bundle.getString("subjoPreseP2sgRM");
	private static final String SUBJO_PRESE_P3SG_RM = bundle.getString("subjoPreseP3sgRM");
	private static final String SUBJO_PRESE_P1PL_RM = bundle.getString("subjoPreseP1plRM");
	private static final String SUBJO_PRESE_P2PL_RM = bundle.getString("subjoPreseP2plRM");
	private static final String SUBJO_PRESE_P3PL_RM = bundle.getString("subjoPreseP3plRM");
	private static final String SUBJO_PASSE_P1SG_RM = bundle.getString("subjoPasseP1sgRM");
	private static final String SUBJO_PASSE_P2SG_RM = bundle.getString("subjoPasseP2sgRM");
	private static final String SUBJO_PASSE_P3SG_RM = bundle.getString("subjoPasseP3sgRM");
	private static final String SUBJO_PASSE_P1PL_RM = bundle.getString("subjoPasseP1plRM");
	private static final String SUBJO_PASSE_P2PL_RM = bundle.getString("subjoPasseP2plRM");
	private static final String SUBJO_PASSE_P3PL_RM = bundle.getString("subjoPasseP3plRM");
	private static final String CONDI_PRESE_P1SG_RM = bundle.getString("condiPreseP1sgRM");
	private static final String CONDI_PRESE_P2SG_RM = bundle.getString("condiPreseP2sgRM");
	private static final String CONDI_PRESE_P3SG_RM = bundle.getString("condiPreseP3sgRM");
	private static final String CONDI_PRESE_P1PL_RM = bundle.getString("condiPreseP1plRM");
	private static final String CONDI_PRESE_P2PL_RM = bundle.getString("condiPreseP2plRM");
	private static final String CONDI_PRESE_P3PL_RM = bundle.getString("condiPreseP3plRM");
	
	
	private String language;
	private String wordType;
	private String nameValue;	
	private String definitionValue;
	private String pluralValue;
	private String pastTenseValue;
	private String pastParticipleValue;
	private NounFr.Gender genderValue;
	private VerbFr.VerbGroup verbGroupValue;
	private String transitivityValue;
	private String indicPreseP1sgValue;
	private String indicPreseP2sgValue;
	private String indicPreseP3sgValue;
	private String indicPreseP1plValue;
	private String indicPreseP2plValue;
	private String indicPreseP3plValue;
	private String indicPasscP1sgValue;
	private String indicPasscP2sgValue;
	private String indicPasscP3sgValue;
	private String indicPasscP1plValue;
	private String indicPasscP2plValue;
	private String indicPasscP3plValue;
	private String indicImparP1sgValue;
	private String indicImparP2sgValue;
	private String indicImparP3sgValue;
	private String indicImparP1plValue;
	private String indicImparP2plValue;
	private String indicImparP3plValue;
	private String indicFutusP1sgValue;
	private String indicFutusP2sgValue;
	private String indicFutusP3sgValue;
	private String indicFutusP1plValue;
	private String indicFutusP2plValue;
	private String indicFutusP3plValue;
	private String imperPreseP2sgValue;
	private String imperPreseP1plValue;
	private String imperPreseP2plValue;
	private String subjoPreseP1sgValue;
	private String subjoPreseP2sgValue;
	private String subjoPreseP3sgValue;
	private String subjoPreseP1plValue;
	private String subjoPreseP2plValue;
	private String subjoPreseP3plValue;
	private String subjoPasseP1sgValue;
	private String subjoPasseP2sgValue;
	private String subjoPasseP3sgValue;
	private String subjoPasseP1plValue;
	private String subjoPasseP2plValue;
	private String subjoPasseP3plValue;
	private String condiPreseP1sgValue;
	private String condiPreseP2sgValue;
	private String condiPreseP3sgValue;
	private String condiPreseP1plValue;
	private String condiPreseP2plValue;
	private String condiPreseP3plValue;
	
	
	@Override
	public String getFamily(){
		return "javax.faces.NamingContainer";
	}
	
	@Override
	public Object getConvertedValue(FacesContext context, Object newSubmittedValue)
		throws ConverterException{
			
		language = (String)getAttributes().get("language");
		wordType = (String)getAttributes().get("wordType");
		
		UIInput nameValueComponent = (UIInput)findComponent("nameValue");
		UIInput definitionValueComponent = (UIInput)findComponent("definitionValue");
		UIInput pluralValueComponent = (UIInput)findComponent("pluralValue");
		UIInput pastTenseValueComponent = (UIInput)findComponent("pastTenseValue");
		UIInput pastParticipleValueComponent = (UIInput)findComponent("pastParticipleValue");
		UIInput genderValueComponent = (UIInput)findComponent("genderValue");
		UIInput verbGroupValueComponent = (UIInput)findComponent("verbGroupValue");
		UIInput transitivityValueComponent = (UIInput)findComponent("transitivityValue");
		UIInput indicPreseP1sgValueComponent = (UIInput)findComponent("indicPreseP1sgValue");
		UIInput indicPreseP2sgValueComponent = (UIInput)findComponent("indicPreseP2sgValue");
		UIInput indicPreseP3sgValueComponent = (UIInput)findComponent("indicPreseP3sgValue");
		UIInput indicPreseP1plValueComponent = (UIInput)findComponent("indicPreseP1plValue");
		UIInput indicPreseP2plValueComponent = (UIInput)findComponent("indicPreseP2plValue");
		UIInput indicPreseP3plValueComponent = (UIInput)findComponent("indicPreseP3plValue");
		UIInput indicPasscP1sgValueComponent = (UIInput)findComponent("indicPasscP1sgValue");
		UIInput indicPasscP2sgValueComponent = (UIInput)findComponent("indicPasscP2sgValue");
		UIInput indicPasscP3sgValueComponent = (UIInput)findComponent("indicPasscP3sgValue");
		UIInput indicPasscP1plValueComponent = (UIInput)findComponent("indicPasscP1plValue");
		UIInput indicPasscP2plValueComponent = (UIInput)findComponent("indicPasscP2plValue");
		UIInput indicPasscP3plValueComponent = (UIInput)findComponent("indicPasscP3plValue");
		UIInput indicImparP1sgValueComponent = (UIInput)findComponent("indicImparP1sgValue");
		UIInput indicImparP2sgValueComponent = (UIInput)findComponent("indicImparP2sgValue");
		UIInput indicImparP3sgValueComponent = (UIInput)findComponent("indicImparP3sgValue");
		UIInput indicImparP1plValueComponent = (UIInput)findComponent("indicImparP1plValue");
		UIInput indicImparP2plValueComponent = (UIInput)findComponent("indicImparP2plValue");
		UIInput indicImparP3plValueComponent = (UIInput)findComponent("indicImparP3plValue");
		UIInput indicFutusP1sgValueComponent = (UIInput)findComponent("indicFutusP1sgValue");
		UIInput indicFutusP2sgValueComponent = (UIInput)findComponent("indicFutusP2sgValue");
		UIInput indicFutusP3sgValueComponent = (UIInput)findComponent("indicFutusP3sgValue");
		UIInput indicFutusP1plValueComponent = (UIInput)findComponent("indicFutusP1plValue");
		UIInput indicFutusP2plValueComponent = (UIInput)findComponent("indicFutusP2plValue");
		UIInput indicFutusP3plValueComponent = (UIInput)findComponent("indicFutusP3plValue");
		UIInput imperPreseP2sgValueComponent = (UIInput)findComponent("imperPreseP2sgValue");
		UIInput imperPreseP1plValueComponent = (UIInput)findComponent("imperPreseP1plValue");
		UIInput imperPreseP2plValueComponent = (UIInput)findComponent("imperPreseP2plValue");
		UIInput subjoPreseP1sgValueComponent = (UIInput)findComponent("subjoPreseP1sgValue");
		UIInput subjoPreseP2sgValueComponent = (UIInput)findComponent("subjoPreseP2sgValue");
		UIInput subjoPreseP3sgValueComponent = (UIInput)findComponent("subjoPreseP3sgValue");
		UIInput subjoPreseP1plValueComponent = (UIInput)findComponent("subjoPreseP1plValue");
		UIInput subjoPreseP2plValueComponent = (UIInput)findComponent("subjoPreseP2plValue");
		UIInput subjoPreseP3plValueComponent = (UIInput)findComponent("subjoPreseP3plValue");
		UIInput subjoPasseP1sgValueComponent = (UIInput)findComponent("subjoPasseP1sgValue");
		UIInput subjoPasseP2sgValueComponent = (UIInput)findComponent("subjoPasseP2sgValue");
		UIInput subjoPasseP3sgValueComponent = (UIInput)findComponent("subjoPasseP3sgValue");
		UIInput subjoPasseP1plValueComponent = (UIInput)findComponent("subjoPasseP1plValue");
		UIInput subjoPasseP2plValueComponent = (UIInput)findComponent("subjoPasseP2plValue");
		UIInput subjoPasseP3plValueComponent = (UIInput)findComponent("subjoPasseP3plValue");
		UIInput condiPreseP1sgValueComponent = (UIInput)findComponent("condiPreseP1sgValue");
		UIInput condiPreseP2sgValueComponent = (UIInput)findComponent("condiPreseP2sgValue");
		UIInput condiPreseP3sgValueComponent = (UIInput)findComponent("condiPreseP3sgValue");
		UIInput condiPreseP1plValueComponent = (UIInput)findComponent("condiPreseP1plValue");
		UIInput condiPreseP2plValueComponent = (UIInput)findComponent("condiPreseP2plValue");
		UIInput condiPreseP3plValueComponent = (UIInput)findComponent("condiPreseP3plValue");
		
		nameValueComponent.setRequired(true);			
		indicPreseP1sgValueComponent.setRequired(true);
		indicPreseP2sgValueComponent.setRequired(true);
		indicPreseP3sgValueComponent.setRequired(true);
		indicPreseP1plValueComponent.setRequired(true);
		indicPreseP2plValueComponent.setRequired(true);
		indicPreseP3plValueComponent.setRequired(true);
		indicPasscP1sgValueComponent.setRequired(true);
		indicPasscP2sgValueComponent.setRequired(true);
		indicPasscP3sgValueComponent.setRequired(true);
		indicPasscP1plValueComponent.setRequired(true);
		indicPasscP2plValueComponent.setRequired(true);
		indicPasscP3plValueComponent.setRequired(true);
		indicImparP1sgValueComponent.setRequired(true);
		indicImparP2sgValueComponent.setRequired(true);
		indicImparP3sgValueComponent.setRequired(true);
		indicImparP1plValueComponent.setRequired(true);
		indicImparP2plValueComponent.setRequired(true);
		indicImparP3plValueComponent.setRequired(true);
		indicFutusP1sgValueComponent.setRequired(true);
		indicFutusP2sgValueComponent.setRequired(true);
		indicFutusP3sgValueComponent.setRequired(true);
		indicFutusP1plValueComponent.setRequired(true);
		indicFutusP2plValueComponent.setRequired(true);
		indicFutusP3plValueComponent.setRequired(true);
		imperPreseP2sgValueComponent.setRequired(true);
		imperPreseP1plValueComponent.setRequired(true);
		imperPreseP2plValueComponent.setRequired(true);
		subjoPreseP1sgValueComponent.setRequired(true);
		subjoPreseP2sgValueComponent.setRequired(true);
		subjoPreseP3sgValueComponent.setRequired(true);
		subjoPreseP1plValueComponent.setRequired(true);
		subjoPreseP2plValueComponent.setRequired(true);
		subjoPreseP3plValueComponent.setRequired(true);
		subjoPasseP1sgValueComponent.setRequired(true);
		subjoPasseP2sgValueComponent.setRequired(true);
		subjoPasseP3sgValueComponent.setRequired(true);
		subjoPasseP1plValueComponent.setRequired(true);
		subjoPasseP2plValueComponent.setRequired(true);
		subjoPasseP3plValueComponent.setRequired(true);
		condiPreseP1sgValueComponent.setRequired(true);
		condiPreseP2sgValueComponent.setRequired(true);
		condiPreseP3sgValueComponent.setRequired(true);
		condiPreseP1plValueComponent.setRequired(true);
		condiPreseP2plValueComponent.setRequired(true);
		condiPreseP3plValueComponent.setRequired(true);

		nameValueComponent.setRequiredMessage(NAME_RM);		
		indicPreseP1sgValueComponent.setRequiredMessage(INDIC_PRESE_P1SG_RM);
		indicPreseP2sgValueComponent.setRequiredMessage(INDIC_PRESE_P2SG_RM);
		indicPreseP3sgValueComponent.setRequiredMessage(INDIC_PRESE_P3SG_RM);
		indicPreseP1plValueComponent.setRequiredMessage(INDIC_PRESE_P1PL_RM);
		indicPreseP2plValueComponent.setRequiredMessage(INDIC_PRESE_P2PL_RM);
		indicPreseP3plValueComponent.setRequiredMessage(INDIC_PRESE_P3PL_RM);
		indicPasscP1sgValueComponent.setRequiredMessage(INDIC_PASSC_P1SG_RM);
		indicPasscP2sgValueComponent.setRequiredMessage(INDIC_PASSC_P2SG_RM);
		indicPasscP3sgValueComponent.setRequiredMessage(INDIC_PASSC_P3SG_RM);
		indicPasscP1plValueComponent.setRequiredMessage(INDIC_PASSC_P1PL_RM);
		indicPasscP2plValueComponent.setRequiredMessage(INDIC_PASSC_P2PL_RM);
		indicPasscP3plValueComponent.setRequiredMessage(INDIC_PASSC_P3PL_RM);
		indicImparP1sgValueComponent.setRequiredMessage(INDIC_IMPAR_P1SG_RM);
		indicImparP2sgValueComponent.setRequiredMessage(INDIC_IMPAR_P2SG_RM);
		indicImparP3sgValueComponent.setRequiredMessage(INDIC_IMPAR_P3SG_RM);
		indicImparP1plValueComponent.setRequiredMessage(INDIC_IMPAR_P1PL_RM);
		indicImparP2plValueComponent.setRequiredMessage(INDIC_IMPAR_P2PL_RM);
		indicImparP3plValueComponent.setRequiredMessage(INDIC_IMPAR_P3PL_RM);
		indicFutusP1sgValueComponent.setRequiredMessage(INDIC_FUTUS_P1SG_RM);
		indicFutusP2sgValueComponent.setRequiredMessage(INDIC_FUTUS_P2SG_RM);
		indicFutusP3sgValueComponent.setRequiredMessage(INDIC_FUTUS_P3SG_RM);
		indicFutusP1plValueComponent.setRequiredMessage(INDIC_FUTUS_P1PL_RM);
		indicFutusP2plValueComponent.setRequiredMessage(INDIC_FUTUS_P2PL_RM);
		indicFutusP3plValueComponent.setRequiredMessage(INDIC_FUTUS_P3PL_RM);
		imperPreseP2sgValueComponent.setRequiredMessage(IMPER_PRESE_P2SG_RM);
		imperPreseP1plValueComponent.setRequiredMessage(IMPER_PRESE_P1PL_RM);
		imperPreseP2plValueComponent.setRequiredMessage(IMPER_PRESE_P2PL_RM);
		subjoPreseP1sgValueComponent.setRequiredMessage(SUBJO_PRESE_P1SG_RM);
		subjoPreseP2sgValueComponent.setRequiredMessage(SUBJO_PRESE_P2SG_RM);
		subjoPreseP3sgValueComponent.setRequiredMessage(SUBJO_PRESE_P3SG_RM);
		subjoPreseP1plValueComponent.setRequiredMessage(SUBJO_PRESE_P1PL_RM);
		subjoPreseP2plValueComponent.setRequiredMessage(SUBJO_PRESE_P2PL_RM);
		subjoPreseP3plValueComponent.setRequiredMessage(SUBJO_PRESE_P3PL_RM);
		subjoPasseP1sgValueComponent.setRequiredMessage(SUBJO_PASSE_P1SG_RM);
		subjoPasseP2sgValueComponent.setRequiredMessage(SUBJO_PASSE_P2SG_RM);
		subjoPasseP3sgValueComponent.setRequiredMessage(SUBJO_PASSE_P3SG_RM);
		subjoPasseP1plValueComponent.setRequiredMessage(SUBJO_PASSE_P1PL_RM);
		subjoPasseP2plValueComponent.setRequiredMessage(SUBJO_PASSE_P2PL_RM);
		subjoPasseP3plValueComponent.setRequiredMessage(SUBJO_PASSE_P3PL_RM);
		condiPreseP1sgValueComponent.setRequiredMessage(CONDI_PRESE_P1SG_RM);
		condiPreseP2sgValueComponent.setRequiredMessage(CONDI_PRESE_P2SG_RM);
		condiPreseP3sgValueComponent.setRequiredMessage(CONDI_PRESE_P3SG_RM);
		condiPreseP1plValueComponent.setRequiredMessage(CONDI_PRESE_P1PL_RM);
		condiPreseP2plValueComponent.setRequiredMessage(CONDI_PRESE_P2PL_RM);
		condiPreseP3plValueComponent.setRequiredMessage(CONDI_PRESE_P3PL_RM);

		
		nameValue = (String)nameValueComponent.getSubmittedValue();
		definitionValue = (String)definitionValueComponent.getSubmittedValue();		
		
		Word word = null;
		
		switch(language + " " + wordType){
		case "English noun":				
			pluralValue = (String)pluralValueComponent.getSubmittedValue();
			word = new NounEn();
			((NounEn)word).setPlural(pluralValue);
			break;
		case "English verb":
			pastTenseValue = (String)pastTenseValueComponent.getSubmittedValue(); 
			pastParticipleValue = (String)pastParticipleValueComponent.getSubmittedValue();
			word = new VerbEn();
			((VerbEn)word).setPastTense(pastTenseValue);
			((VerbEn)word).setPastParticiple(pastParticipleValue);
			break;
		case "French noun":
			pluralValue = (String)pluralValueComponent.getSubmittedValue();
			genderValue = (NounFr.Gender)genderValueComponent.getSubmittedValue();
			word = new NounFr();
			((NounFr)word).setPlural(pluralValue);
			((NounFr)word).setGender(genderValue);
			break;
		case "French verb":
			verbGroupValue = (VerbFr.VerbGroup)verbGroupValueComponent.getSubmittedValue();
			transitivityValue = (String)transitivityValueComponent.getSubmittedValue();
			indicPreseP1sgValue = (String)indicPreseP1sgValueComponent.getSubmittedValue();
			indicPreseP2sgValue = (String)indicPreseP2sgValueComponent.getSubmittedValue();
			indicPreseP3sgValue = (String)indicPreseP3sgValueComponent.getSubmittedValue();
			indicPreseP1plValue = (String)indicPreseP1plValueComponent.getSubmittedValue();
			indicPreseP2plValue = (String)indicPreseP2plValueComponent.getSubmittedValue();
			indicPreseP3plValue = (String)indicPreseP3plValueComponent.getSubmittedValue();
			indicPasscP1sgValue = (String)indicPasscP1sgValueComponent.getSubmittedValue();
			indicPasscP2sgValue = (String)indicPasscP2sgValueComponent.getSubmittedValue();
			indicPasscP3sgValue = (String)indicPasscP3sgValueComponent.getSubmittedValue();
			indicPasscP1plValue = (String)indicPasscP1plValueComponent.getSubmittedValue();
			indicPasscP2plValue = (String)indicPasscP2plValueComponent.getSubmittedValue();
			indicPasscP3plValue = (String)indicPasscP3plValueComponent.getSubmittedValue();
			indicImparP1sgValue = (String)indicImparP1sgValueComponent.getSubmittedValue();
			indicImparP2sgValue = (String)indicImparP2sgValueComponent.getSubmittedValue();
			indicImparP3sgValue = (String)indicImparP3sgValueComponent.getSubmittedValue();
			indicImparP1plValue = (String)indicImparP1plValueComponent.getSubmittedValue();
			indicImparP2plValue = (String)indicImparP2plValueComponent.getSubmittedValue();
			indicImparP3plValue = (String)indicImparP3plValueComponent.getSubmittedValue();
			indicFutusP1sgValue = (String)indicFutusP1sgValueComponent.getSubmittedValue();
			indicFutusP2sgValue = (String)indicFutusP2sgValueComponent.getSubmittedValue();
			indicFutusP3sgValue = (String)indicFutusP3sgValueComponent.getSubmittedValue();
			indicFutusP1plValue = (String)indicFutusP1plValueComponent.getSubmittedValue();
			indicFutusP2plValue = (String)indicFutusP2plValueComponent.getSubmittedValue();
			indicFutusP3plValue = (String)indicFutusP3plValueComponent.getSubmittedValue();
			imperPreseP2sgValue = (String)imperPreseP2sgValueComponent.getSubmittedValue();
			imperPreseP1plValue = (String)imperPreseP1plValueComponent.getSubmittedValue();
			imperPreseP2plValue = (String)imperPreseP2plValueComponent.getSubmittedValue();
			subjoPreseP1sgValue = (String)subjoPreseP1sgValueComponent.getSubmittedValue();
			subjoPreseP2sgValue = (String)subjoPreseP2sgValueComponent.getSubmittedValue();
			subjoPreseP3sgValue = (String)subjoPreseP3sgValueComponent.getSubmittedValue();
			subjoPreseP1plValue = (String)subjoPreseP1plValueComponent.getSubmittedValue();
			subjoPreseP2plValue = (String)subjoPreseP2plValueComponent.getSubmittedValue();
			subjoPreseP3plValue = (String)subjoPreseP3plValueComponent.getSubmittedValue();
			subjoPasseP1sgValue = (String)subjoPasseP1sgValueComponent.getSubmittedValue();
			subjoPasseP2sgValue = (String)subjoPasseP2sgValueComponent.getSubmittedValue();
			subjoPasseP3sgValue = (String)subjoPasseP3sgValueComponent.getSubmittedValue();
			subjoPasseP1plValue = (String)subjoPasseP1plValueComponent.getSubmittedValue();
			subjoPasseP2plValue = (String)subjoPasseP2plValueComponent.getSubmittedValue();
			subjoPasseP3plValue = (String)subjoPasseP3plValueComponent.getSubmittedValue();
			condiPreseP1sgValue = (String)condiPreseP1sgValueComponent.getSubmittedValue();
			condiPreseP2sgValue = (String)condiPreseP2sgValueComponent.getSubmittedValue();
			condiPreseP3sgValue = (String)condiPreseP3sgValueComponent.getSubmittedValue();
			condiPreseP1plValue = (String)condiPreseP1plValueComponent.getSubmittedValue();
			condiPreseP2plValue = (String)condiPreseP2plValueComponent.getSubmittedValue();
			condiPreseP3plValue = (String)condiPreseP3plValueComponent.getSubmittedValue();
			
			word = new VerbFr();
			
			((VerbFr)word).setVerbGroup(verbGroupValue);
			((VerbFr)word).setTransitivity(transitivityValue);
			((VerbFr)word).setIndicPreseP1sg(indicPreseP1sgValue);
			((VerbFr)word).setIndicPreseP2sg(indicPreseP2sgValue);
			((VerbFr)word).setIndicPreseP3sg(indicPreseP3sgValue);
			((VerbFr)word).setIndicPreseP1pl(indicPreseP1plValue);
			((VerbFr)word).setIndicPreseP2pl(indicPreseP2plValue);
			((VerbFr)word).setIndicPreseP3pl(indicPreseP3plValue);
			((VerbFr)word).setIndicPasscP1sg(indicPasscP1sgValue);
			((VerbFr)word).setIndicPasscP2sg(indicPasscP2sgValue);
			((VerbFr)word).setIndicPasscP3sg(indicPasscP3sgValue);
			((VerbFr)word).setIndicPasscP1pl(indicPasscP1plValue);
			((VerbFr)word).setIndicPasscP2pl(indicPasscP2plValue);
			((VerbFr)word).setIndicPasscP3pl(indicPasscP3plValue);
			((VerbFr)word).setIndicImparP1sg(indicImparP1sgValue);
			((VerbFr)word).setIndicImparP2sg(indicImparP2sgValue);
			((VerbFr)word).setIndicImparP3sg(indicImparP3sgValue);
			((VerbFr)word).setIndicImparP1pl(indicImparP1plValue);
			((VerbFr)word).setIndicImparP2pl(indicImparP2plValue);
			((VerbFr)word).setIndicImparP3pl(indicImparP3plValue);
			((VerbFr)word).setIndicFutusP1sg(indicFutusP1sgValue);
			((VerbFr)word).setIndicFutusP2sg(indicFutusP2sgValue);
			((VerbFr)word).setIndicFutusP3sg(indicFutusP3sgValue);
			((VerbFr)word).setIndicFutusP1pl(indicFutusP1plValue);
			((VerbFr)word).setIndicFutusP2pl(indicFutusP2plValue);
			((VerbFr)word).setIndicFutusP3pl(indicFutusP3plValue);
			((VerbFr)word).setImperPreseP2sg(imperPreseP2sgValue);
			((VerbFr)word).setImperPreseP1pl(imperPreseP1plValue);
			((VerbFr)word).setImperPreseP2pl(imperPreseP2plValue);
			((VerbFr)word).setSubjoPreseP1sg(subjoPreseP1sgValue);
			((VerbFr)word).setSubjoPreseP2sg(subjoPreseP2sgValue);
			((VerbFr)word).setSubjoPreseP3sg(subjoPreseP3sgValue);
			((VerbFr)word).setSubjoPreseP1pl(subjoPreseP1plValue);
			((VerbFr)word).setSubjoPreseP2pl(subjoPreseP2plValue);
			((VerbFr)word).setSubjoPreseP3pl(subjoPreseP3plValue);
			((VerbFr)word).setSubjoPasseP1sg(subjoPasseP1sgValue);
			((VerbFr)word).setSubjoPasseP2sg(subjoPasseP2sgValue);
			((VerbFr)word).setSubjoPasseP3sg(subjoPasseP3sgValue);
			((VerbFr)word).setSubjoPasseP1pl(subjoPasseP1plValue);
			((VerbFr)word).setSubjoPasseP2pl(subjoPasseP2plValue);
			((VerbFr)word).setSubjoPasseP3pl(subjoPasseP3plValue);
			((VerbFr)word).setCondiPreseP1sg(condiPreseP1sgValue);
			((VerbFr)word).setCondiPreseP2sg(condiPreseP2sgValue);
			((VerbFr)word).setCondiPreseP3sg(condiPreseP3sgValue);
			((VerbFr)word).setCondiPreseP1pl(condiPreseP1plValue);
			((VerbFr)word).setCondiPreseP2pl(condiPreseP2plValue);
			((VerbFr)word).setCondiPreseP3pl(condiPreseP3plValue);
			break;	
		default:
			WordFactory factory = new WordFactory();
			word = factory.getWord(language, wordType);
		}
		
		word.setName(nameValue);
		word.setDefinition(definitionValue);
		
		return word;	
		
	}
	
	@Override
	public void encodeBegin(FacesContext context) throws IOException{
		
		language = (String)getAttributes().get("language");
		wordType = (String)getAttributes().get("wordType");
				
		((UIInput)findComponent("nameValue")).resetValue();
		((UIInput)findComponent("definitionValue")).resetValue();
		((UIInput)findComponent("pluralValue")).resetValue();
		((UIInput)findComponent("pastTenseValue")).resetValue();
		((UIInput)findComponent("pastParticipleValue")).resetValue();
		((UIInput)findComponent("genderValue")).resetValue();
		((UIInput)findComponent("verbGroupValue")).resetValue();
		((UIInput)findComponent("transitivityValue")).resetValue();
		((UIInput)findComponent("indicPreseP1sgValue")).resetValue();
		((UIInput)findComponent("indicPreseP2sgValue")).resetValue();
		((UIInput)findComponent("indicPreseP3sgValue")).resetValue();
		((UIInput)findComponent("indicPreseP1plValue")).resetValue();
		((UIInput)findComponent("indicPreseP2plValue")).resetValue();
		((UIInput)findComponent("indicPreseP3plValue")).resetValue();
		((UIInput)findComponent("indicPasscP1sgValue")).resetValue();
		((UIInput)findComponent("indicPasscP2sgValue")).resetValue();
		((UIInput)findComponent("indicPasscP3sgValue")).resetValue();
		((UIInput)findComponent("indicPasscP1plValue")).resetValue();
		((UIInput)findComponent("indicPasscP2plValue")).resetValue();
		((UIInput)findComponent("indicPasscP3plValue")).resetValue();
		((UIInput)findComponent("indicImparP1sgValue")).resetValue();
		((UIInput)findComponent("indicImparP2sgValue")).resetValue();
		((UIInput)findComponent("indicImparP3sgValue")).resetValue();
		((UIInput)findComponent("indicImparP1plValue")).resetValue();
		((UIInput)findComponent("indicImparP2plValue")).resetValue();
		((UIInput)findComponent("indicImparP3plValue")).resetValue();
		((UIInput)findComponent("indicFutusP1sgValue")).resetValue();
		((UIInput)findComponent("indicFutusP2sgValue")).resetValue();
		((UIInput)findComponent("indicFutusP3sgValue")).resetValue();
		((UIInput)findComponent("indicFutusP1plValue")).resetValue();
		((UIInput)findComponent("indicFutusP2plValue")).resetValue();
		((UIInput)findComponent("indicFutusP3plValue")).resetValue();
		((UIInput)findComponent("imperPreseP2sgValue")).resetValue();
		((UIInput)findComponent("imperPreseP1plValue")).resetValue();
		((UIInput)findComponent("imperPreseP2plValue")).resetValue();
		((UIInput)findComponent("subjoPreseP1sgValue")).resetValue();
		((UIInput)findComponent("subjoPreseP2sgValue")).resetValue();
		((UIInput)findComponent("subjoPreseP3sgValue")).resetValue();
		((UIInput)findComponent("subjoPreseP1plValue")).resetValue();
		((UIInput)findComponent("subjoPreseP2plValue")).resetValue();
		((UIInput)findComponent("subjoPreseP3plValue")).resetValue();
		((UIInput)findComponent("subjoPasseP1sgValue")).resetValue();
		((UIInput)findComponent("subjoPasseP2sgValue")).resetValue();
		((UIInput)findComponent("subjoPasseP3sgValue")).resetValue();
		((UIInput)findComponent("subjoPasseP1plValue")).resetValue();
		((UIInput)findComponent("subjoPasseP2plValue")).resetValue();
		((UIInput)findComponent("subjoPasseP3plValue")).resetValue();
		((UIInput)findComponent("condiPreseP1sgValue")).resetValue();
		((UIInput)findComponent("condiPreseP2sgValue")).resetValue();
		((UIInput)findComponent("condiPreseP3sgValue")).resetValue();
		((UIInput)findComponent("condiPreseP1plValue")).resetValue();
		((UIInput)findComponent("condiPreseP2plValue")).resetValue();
		((UIInput)findComponent("condiPreseP3plValue")).resetValue();

		UIOutput nameLabelComponent = (UIOutput)findComponent("nameLabel");
		UIOutput typeLabelComponent = (UIOutput)findComponent("typeLabel");
		UIOutput definitionLabelComponent = (UIOutput)findComponent("definitionLabel");
		UIOutput pluralLabelComponent = (UIOutput)findComponent("pluralLabel");
		UIOutput pastTenseLabelComponent = (UIOutput)findComponent("pastTenseLabel");
		UIOutput pastParticipleLabelComponent = (UIOutput)findComponent("pastParticipleLabel");
		UIOutput genderLabelComponent = (UIOutput)findComponent("genderLabel");
		UIOutput verbGroupLabelComponent = (UIOutput)findComponent("verbGroupLabel");	
		UIOutput transitivityLabelComponent = (UIOutput)findComponent("transitivityLabel"); 
		UIOutput indicPreseP1sgLabelComponent = (UIOutput)findComponent("indicPreseP1sgLabel");
		UIOutput indicPreseP2sgLabelComponent = (UIOutput)findComponent("indicPreseP2sgLabel");
		UIOutput indicPreseP3sgLabelComponent = (UIOutput)findComponent("indicPreseP3sgLabel");
		UIOutput indicPreseP1plLabelComponent = (UIOutput)findComponent("indicPreseP1plLabel");
		UIOutput indicPreseP2plLabelComponent = (UIOutput)findComponent("indicPreseP2plLabel");
		UIOutput indicPreseP3plLabelComponent = (UIOutput)findComponent("indicPreseP3plLabel");
		UIOutput indicPasscP1sgLabelComponent = (UIOutput)findComponent("indicPasscP1sgLabel");
		UIOutput indicPasscP2sgLabelComponent = (UIOutput)findComponent("indicPasscP2sgLabel");
		UIOutput indicPasscP3sgLabelComponent = (UIOutput)findComponent("indicPasscP3sgLabel");
		UIOutput indicPasscP1plLabelComponent = (UIOutput)findComponent("indicPasscP1plLabel");
		UIOutput indicPasscP2plLabelComponent = (UIOutput)findComponent("indicPasscP2plLabel");
		UIOutput indicPasscP3plLabelComponent = (UIOutput)findComponent("indicPasscP3plLabel");
		UIOutput indicImparP1sgLabelComponent = (UIOutput)findComponent("indicImparP1sgLabel");
		UIOutput indicImparP2sgLabelComponent = (UIOutput)findComponent("indicImparP2sgLabel");
		UIOutput indicImparP3sgLabelComponent = (UIOutput)findComponent("indicImparP3sgLabel");
		UIOutput indicImparP1plLabelComponent = (UIOutput)findComponent("indicImparP1plLabel");
		UIOutput indicImparP2plLabelComponent = (UIOutput)findComponent("indicImparP2plLabel");
		UIOutput indicImparP3plLabelComponent = (UIOutput)findComponent("indicImparP3plLabel");
		UIOutput indicFutusP1sgLabelComponent = (UIOutput)findComponent("indicFutusP1sgLabel");
		UIOutput indicFutusP2sgLabelComponent = (UIOutput)findComponent("indicFutusP2sgLabel");
		UIOutput indicFutusP3sgLabelComponent = (UIOutput)findComponent("indicFutusP3sgLabel");
		UIOutput indicFutusP1plLabelComponent = (UIOutput)findComponent("indicFutusP1plLabel");
		UIOutput indicFutusP2plLabelComponent = (UIOutput)findComponent("indicFutusP2plLabel");
		UIOutput indicFutusP3plLabelComponent = (UIOutput)findComponent("indicFutusP3plLabel");
		UIOutput imperPreseP2sgLabelComponent = (UIOutput)findComponent("imperPreseP2sgLabel");
		UIOutput imperPreseP1plLabelComponent = (UIOutput)findComponent("imperPreseP1plLabel");
		UIOutput imperPreseP2plLabelComponent = (UIOutput)findComponent("imperPreseP2plLabel");
		UIOutput subjoPreseP1sgLabelComponent = (UIOutput)findComponent("subjoPreseP1sgLabel");
		UIOutput subjoPreseP2sgLabelComponent = (UIOutput)findComponent("subjoPreseP2sgLabel");
		UIOutput subjoPreseP3sgLabelComponent = (UIOutput)findComponent("subjoPreseP3sgLabel");
		UIOutput subjoPreseP1plLabelComponent = (UIOutput)findComponent("subjoPreseP1plLabel");
		UIOutput subjoPreseP2plLabelComponent = (UIOutput)findComponent("subjoPreseP2plLabel");
		UIOutput subjoPreseP3plLabelComponent = (UIOutput)findComponent("subjoPreseP3plLabel");
		UIOutput subjoPasseP1sgLabelComponent = (UIOutput)findComponent("subjoPasseP1sgLabel");
		UIOutput subjoPasseP2sgLabelComponent = (UIOutput)findComponent("subjoPasseP2sgLabel");
		UIOutput subjoPasseP3sgLabelComponent = (UIOutput)findComponent("subjoPasseP3sgLabel");
		UIOutput subjoPasseP1plLabelComponent = (UIOutput)findComponent("subjoPasseP1plLabel");
		UIOutput subjoPasseP2plLabelComponent = (UIOutput)findComponent("subjoPasseP2plLabel");
		UIOutput subjoPasseP3plLabelComponent = (UIOutput)findComponent("subjoPasseP3plLabel");
		UIOutput condiPreseP1sgLabelComponent = (UIOutput)findComponent("condiPreseP1sgLabel");
		UIOutput condiPreseP2sgLabelComponent = (UIOutput)findComponent("condiPreseP2sgLabel");
		UIOutput condiPreseP3sgLabelComponent = (UIOutput)findComponent("condiPreseP3sgLabel");
		UIOutput condiPreseP1plLabelComponent = (UIOutput)findComponent("condiPreseP1plLabel");
		UIOutput condiPreseP2plLabelComponent = (UIOutput)findComponent("condiPreseP2plLabel");
		UIOutput condiPreseP3plLabelComponent = (UIOutput)findComponent("condiPreseP3plLabel");
		UIOutput indicPreseLabelComponent = (UIOutput)findComponent("indicPreseLabel");
		UIOutput indicPasscLabelComponent = (UIOutput)findComponent("indicPasscLabel");
		UIOutput indicImparLabelComponent = (UIOutput)findComponent("indicImparLabel");
		UIOutput indicFutusLabelComponent = (UIOutput)findComponent("indicFutusLabel");
		UIOutput imperPreseLabelComponent = (UIOutput)findComponent("imperPreseLabel");
		UIOutput subjoPreseLabelComponent = (UIOutput)findComponent("subjoPreseLabel");
		UIOutput subjoPasseLabelComponent = (UIOutput)findComponent("subjoPasseLabel");
		UIOutput condiPreseLabelComponent = (UIOutput)findComponent("condiPreseLabel");
		UIOutput indicLabelComponent = (UIOutput)findComponent("indicLabel");
		UIOutput imperLabelComponent = (UIOutput)findComponent("imperLabel");
		UIOutput subjoLabelComponent = (UIOutput)findComponent("subjoLabel");
		UIOutput condiLabelComponent = (UIOutput)findComponent("condiLabel");
 	
		nameLabelComponent.setValue(NAME_LABEL);
		typeLabelComponent.setValue(TYPE_LABEL);	
		definitionLabelComponent.setValue(DEFINITION_LABEL);
		pluralLabelComponent.setValue(PLURAL_LABEL);
		pastTenseLabelComponent.setValue(PAST_TENSE_LABEL);
		pastParticipleLabelComponent.setValue(PAST_PARTICIPLE_LABEL);
		genderLabelComponent.setValue(GENDER_LABEL);
		verbGroupLabelComponent.setValue(VERB_GROUP_LABEL);
		transitivityLabelComponent.setValue(TRANSITIVITY_LABEL);		
		indicPreseP1sgLabelComponent.setValue(INDIC_PRESE_P1SG_LABEL);
		indicPreseP2sgLabelComponent.setValue(INDIC_PRESE_P2SG_LABEL);
		indicPreseP3sgLabelComponent.setValue(INDIC_PRESE_P3SG_LABEL);
		indicPreseP1plLabelComponent.setValue(INDIC_PRESE_P1PL_LABEL);
		indicPreseP2plLabelComponent.setValue(INDIC_PRESE_P2PL_LABEL);
		indicPreseP3plLabelComponent.setValue(INDIC_PRESE_P3PL_LABEL);
		indicPasscP1sgLabelComponent.setValue(INDIC_PASSC_P1SG_LABEL);
		indicPasscP2sgLabelComponent.setValue(INDIC_PASSC_P2SG_LABEL);
		indicPasscP3sgLabelComponent.setValue(INDIC_PASSC_P3SG_LABEL);
		indicPasscP1plLabelComponent.setValue(INDIC_PASSC_P1PL_LABEL);
		indicPasscP2plLabelComponent.setValue(INDIC_PASSC_P2PL_LABEL);
		indicPasscP3plLabelComponent.setValue(INDIC_PASSC_P3PL_LABEL);
		indicImparP1sgLabelComponent.setValue(INDIC_IMPAR_P1SG_LABEL);
		indicImparP2sgLabelComponent.setValue(INDIC_IMPAR_P2SG_LABEL);
		indicImparP3sgLabelComponent.setValue(INDIC_IMPAR_P3SG_LABEL);
		indicImparP1plLabelComponent.setValue(INDIC_IMPAR_P1PL_LABEL);
		indicImparP2plLabelComponent.setValue(INDIC_IMPAR_P2PL_LABEL);
		indicImparP3plLabelComponent.setValue(INDIC_IMPAR_P3PL_LABEL);
		indicFutusP1sgLabelComponent.setValue(INDIC_FUTUS_P1SG_LABEL);
		indicFutusP2sgLabelComponent.setValue(INDIC_FUTUS_P2SG_LABEL);
		indicFutusP3sgLabelComponent.setValue(INDIC_FUTUS_P3SG_LABEL);
		indicFutusP1plLabelComponent.setValue(INDIC_FUTUS_P1PL_LABEL);
		indicFutusP2plLabelComponent.setValue(INDIC_FUTUS_P2PL_LABEL);
		indicFutusP3plLabelComponent.setValue(INDIC_FUTUS_P3PL_LABEL);
		imperPreseP2sgLabelComponent.setValue(IMPER_PRESE_P2SG_LABEL);
		imperPreseP1plLabelComponent.setValue(IMPER_PRESE_P1PL_LABEL);
		imperPreseP2plLabelComponent.setValue(IMPER_PRESE_P2PL_LABEL);
		subjoPreseP1sgLabelComponent.setValue(SUBJO_PRESE_P1SG_LABEL);
		subjoPreseP2sgLabelComponent.setValue(SUBJO_PRESE_P2SG_LABEL);
		subjoPreseP3sgLabelComponent.setValue(SUBJO_PRESE_P3SG_LABEL);
		subjoPreseP1plLabelComponent.setValue(SUBJO_PRESE_P1PL_LABEL);
		subjoPreseP2plLabelComponent.setValue(SUBJO_PRESE_P2PL_LABEL);
		subjoPreseP3plLabelComponent.setValue(SUBJO_PRESE_P3PL_LABEL);
		subjoPasseP1sgLabelComponent.setValue(SUBJO_PASSE_P1SG_LABEL);
		subjoPasseP2sgLabelComponent.setValue(SUBJO_PASSE_P2SG_LABEL);
		subjoPasseP3sgLabelComponent.setValue(SUBJO_PASSE_P3SG_LABEL);
		subjoPasseP1plLabelComponent.setValue(SUBJO_PASSE_P1PL_LABEL);
		subjoPasseP2plLabelComponent.setValue(SUBJO_PASSE_P2PL_LABEL);
		subjoPasseP3plLabelComponent.setValue(SUBJO_PASSE_P3PL_LABEL);
		condiPreseP1sgLabelComponent.setValue(CONDI_PRESE_P1SG_LABEL);
		condiPreseP2sgLabelComponent.setValue(CONDI_PRESE_P2SG_LABEL);
		condiPreseP3sgLabelComponent.setValue(CONDI_PRESE_P3SG_LABEL);
		condiPreseP1plLabelComponent.setValue(CONDI_PRESE_P1PL_LABEL);
		condiPreseP2plLabelComponent.setValue(CONDI_PRESE_P2PL_LABEL);
		condiPreseP3plLabelComponent.setValue(CONDI_PRESE_P3PL_LABEL);
 		indicPreseLabelComponent.setValue(INDIC_PRESE_LABEL);
		indicPasscLabelComponent.setValue(INDIC_PASSC_LABEL);
		indicImparLabelComponent.setValue(INDIC_IMPAR_LABEL);
		indicFutusLabelComponent.setValue(INDIC_FUTUS_LABEL);
		imperPreseLabelComponent.setValue(IMPER_PRESE_LABEL);
		subjoPreseLabelComponent.setValue(SUBJO_PRESE_LABEL);
		subjoPasseLabelComponent.setValue(SUBJO_PASSE_LABEL);
		condiPreseLabelComponent.setValue(CONDI_PRESE_LABEL);
		indicLabelComponent.setValue(INDIC_LABEL);
		imperLabelComponent.setValue(IMPER_LABEL);
		subjoLabelComponent.setValue(SUBJO_LABEL);
		condiLabelComponent.setValue(CONDI_LABEL);
 
		super.encodeBegin(context);
	}
	
	
	@Override
	public Object getSubmittedValue(){
		return this;
	}
	
	
    public boolean renderName(String eType){
    	return eType.equals("enDef");
	}
    
    public boolean renderBasic(String eType){
    	return false;
	}
	
    public boolean renderType(String eType){
		return false;
	}

    public boolean renderDefinition(String eType){
		return false;
	}

    public boolean renderPlural(String eType){
		return false;
	}

    public boolean renderPastTense(String eType){
		return false;
	}

    public boolean renderPastParticiple(String eType){
		return false;
	}

    public boolean renderGender(String eType){
		return false;
	}

    public boolean renderVerbGroup(String eType){
		return false;
	}
    
    public boolean renderTransitivity(String eType){
    	return false;
    }
    
    public boolean renderConjugation(String eType){
    	return eType.equals("frCon");
    }
    
    public boolean renderIndicPrese(String eType, Set<String> selection){
    	return eType.equals("frCon") && (selection != null && selection.contains(INDIC_LABEL + INDIC_PRESE_LABEL));
	}

    public boolean renderIndicPassc(String eType, Set<String> selection){
    	return eType.equals("frCon") && (selection != null && selection.contains(INDIC_LABEL + INDIC_PASSC_LABEL));
	}

    public boolean renderIndicImpar(String eType, Set<String> selection){
    	return eType.equals("frCon") && (selection != null && selection.contains(INDIC_LABEL + INDIC_IMPAR_LABEL));
	}

    public boolean renderIndicFutus(String eType, Set<String> selection){
    	return eType.equals("frCon") && (selection != null && selection.contains(INDIC_LABEL + INDIC_FUTUS_LABEL));
	}
	
	public boolean renderImperPrese(String eType, Set<String> selection){
    	return eType.equals("frCon") && (selection != null && selection.contains(IMPER_LABEL + IMPER_PRESE_LABEL));
	}

    public boolean renderSubjoPrese(String eType, Set<String> selection){
    	return eType.equals("frCon") && (selection != null && selection.contains(SUBJO_LABEL + SUBJO_PRESE_LABEL));
	}

    public boolean renderSubjoPasse(String eType, Set<String> selection){
    	return eType.equals("frCon") && (selection != null && selection.contains(SUBJO_LABEL + SUBJO_PASSE_LABEL));
	}

    public boolean renderCondiPrese(String eType, Set<String> selection){
    	return eType.equals("frCon") && (selection != null && selection.contains(CONDI_LABEL + CONDI_PRESE_LABEL));
	}
    
	public boolean renderIndic(String eType, Set<String> selection){
		return eType.equals("frCon") && (selection != null && selection.contains(INDIC_LABEL));
	}

    public boolean renderImper(String eType, Set<String> selection){
		return eType.equals("frCon") && (selection != null && selection.contains(IMPER_LABEL));
	}
	
    public boolean renderSubjo(String eType, Set<String> selection){
		return eType.equals("frCon") && (selection != null && selection.contains(SUBJO_LABEL));
	}
	
    public boolean renderCondi(String eType, Set<String> selection){
    	return eType.equals("frCon") && (selection != null && selection.contains(CONDI_LABEL));
	}
	
	
}