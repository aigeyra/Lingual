package lingual.components;


import java.io.IOException;
import java.util.ResourceBundle;
import java.util.Set;

import javax.faces.component.FacesComponent;
import javax.faces.component.NamingContainer;
import javax.faces.component.UIOutput;
import javax.faces.context.FacesContext;

import lingual.entities.NounEn;
import lingual.entities.NounFr;
import lingual.entities.VerbEn;
import lingual.entities.VerbFr;
import lingual.entities.Word;

@FacesComponent("lingual.components.WordInfoComponent")
public class WordInfoComponent extends UIOutput implements NamingContainer{
	
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
	
	private String nameValue;
	private String typeValue;
	private String definitionValue;
	private String pluralValue;
	private String pastTenseValue;
	private String pastParticipleValue;
	private String genderValue;
	private String verbGroupValue;
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

	
	
	private Word word;
	
	@Override
	public String getFamily(){
		return "javax.faces.NamingContainer";
	}
	
	@Override
	public void encodeBegin(FacesContext context) throws IOException{		
		word = (Word)getValue();
		
		if(word != null){
			nameValue = word.getName();
			typeValue = word.getWordType();
			definitionValue = word.getDefinition();
			switch(getWordInfo()){
			case "English noun":				
				pluralValue = ((NounEn)word).getPlural();
				break;
			case "English verb":
				pastTenseValue = ((VerbEn)word).getPastTense(); 
				pastParticipleValue = ((VerbEn)word).getPastParticiple();
				break;
			case "French noun":
				pluralValue = ((NounFr)word).getPlural();
				genderValue = ((NounFr)word).getGender().toString();
				break;			
			case "French verb":
				verbGroupValue = ((VerbFr)word).getVerbGroup().toString();
				transitivityValue = ((VerbFr)word).getTransitivity();
				indicPreseP1sgValue = ((VerbFr)word).getIndicPreseP1sg();
				indicPreseP2sgValue = ((VerbFr)word).getIndicPreseP2sg();
				indicPreseP3sgValue = ((VerbFr)word).getIndicPreseP3sg();
				indicPreseP1plValue = ((VerbFr)word).getIndicPreseP1pl();
				indicPreseP2plValue = ((VerbFr)word).getIndicPreseP2pl();
				indicPreseP3plValue = ((VerbFr)word).getIndicPreseP3pl();
				indicPasscP1sgValue = ((VerbFr)word).getIndicPasscP1sg();
				indicPasscP2sgValue = ((VerbFr)word).getIndicPasscP2sg();
				indicPasscP3sgValue = ((VerbFr)word).getIndicPasscP3sg();
				indicPasscP1plValue = ((VerbFr)word).getIndicPasscP1pl();
				indicPasscP2plValue = ((VerbFr)word).getIndicPasscP2pl();
				indicPasscP3plValue = ((VerbFr)word).getIndicPasscP3pl();
				indicImparP1sgValue = ((VerbFr)word).getIndicImparP1sg();
				indicImparP2sgValue = ((VerbFr)word).getIndicImparP2sg();
				indicImparP3sgValue = ((VerbFr)word).getIndicImparP3sg();
				indicImparP1plValue = ((VerbFr)word).getIndicImparP1pl();
				indicImparP2plValue = ((VerbFr)word).getIndicImparP2pl();
				indicImparP3plValue = ((VerbFr)word).getIndicImparP3pl();
				indicFutusP1sgValue = ((VerbFr)word).getIndicFutusP1sg();
				indicFutusP2sgValue = ((VerbFr)word).getIndicFutusP2sg();
				indicFutusP3sgValue = ((VerbFr)word).getIndicFutusP3sg();
				indicFutusP1plValue = ((VerbFr)word).getIndicFutusP1pl();
				indicFutusP2plValue = ((VerbFr)word).getIndicFutusP2pl();
				indicFutusP3plValue = ((VerbFr)word).getIndicFutusP3pl();
				imperPreseP2sgValue = ((VerbFr)word).getImperPreseP2sg();
				imperPreseP1plValue = ((VerbFr)word).getImperPreseP1pl();
				imperPreseP2plValue = ((VerbFr)word).getImperPreseP2pl();
				subjoPreseP1sgValue = ((VerbFr)word).getSubjoPreseP1sg();
				subjoPreseP2sgValue = ((VerbFr)word).getSubjoPreseP2sg();
				subjoPreseP3sgValue = ((VerbFr)word).getSubjoPreseP3sg();
				subjoPreseP1plValue = ((VerbFr)word).getSubjoPreseP1pl();
				subjoPreseP2plValue = ((VerbFr)word).getSubjoPreseP2pl();
				subjoPreseP3plValue = ((VerbFr)word).getSubjoPreseP3pl();
				subjoPasseP1sgValue = ((VerbFr)word).getSubjoPasseP1sg();
				subjoPasseP2sgValue = ((VerbFr)word).getSubjoPasseP2sg();
				subjoPasseP3sgValue = ((VerbFr)word).getSubjoPasseP3sg();
				subjoPasseP1plValue = ((VerbFr)word).getSubjoPasseP1pl();
				subjoPasseP2plValue = ((VerbFr)word).getSubjoPasseP2pl();
				subjoPasseP3plValue = ((VerbFr)word).getSubjoPasseP3pl();
				condiPreseP1sgValue = ((VerbFr)word).getCondiPreseP1sg();
				condiPreseP2sgValue = ((VerbFr)word).getCondiPreseP2sg();
				condiPreseP3sgValue = ((VerbFr)word).getCondiPreseP3sg();
				condiPreseP1plValue = ((VerbFr)word).getCondiPreseP1pl();
				condiPreseP2plValue = ((VerbFr)word).getCondiPreseP2pl();
				condiPreseP3plValue = ((VerbFr)word).getCondiPreseP3pl();
				break;
			}			
		}

		UIOutput nameValueComponent = (UIOutput)findComponent("nameValue");
		UIOutput nameLabelComponent = (UIOutput)findComponent("nameLabel");
		UIOutput typeValueComponent = (UIOutput)findComponent("typeValue");
		UIOutput typeLabelComponent = (UIOutput)findComponent("typeLabel");
		UIOutput definitionValueComponent = (UIOutput)findComponent("definitionValue");
		UIOutput definitionLabelComponent = (UIOutput)findComponent("definitionLabel");
		UIOutput pluralValueComponent = (UIOutput)findComponent("pluralValue");
		UIOutput pluralLabelComponent = (UIOutput)findComponent("pluralLabel");
		UIOutput pastTenseValueComponent = (UIOutput)findComponent("pastTenseValue");
		UIOutput pastTenseLabelComponent = (UIOutput)findComponent("pastTenseLabel");
		UIOutput pastParticipleValueComponent = (UIOutput)findComponent("pastParticipleValue");
		UIOutput pastParticipleLabelComponent = (UIOutput)findComponent("pastParticipleLabel");
		UIOutput genderValueComponent = (UIOutput)findComponent("genderValue");
		UIOutput genderLabelComponent = (UIOutput)findComponent("genderLabel");
		UIOutput verbGroupValueComponent = (UIOutput)findComponent("verbGroupValue");
		UIOutput verbGroupLabelComponent = (UIOutput)findComponent("verbGroupLabel");	
		UIOutput transitivityValueComponent = (UIOutput)findComponent("transitivityValue");
		UIOutput transitivityLabelComponent = (UIOutput)findComponent("transitivityLabel");	
		UIOutput indicPreseP1sgValueComponent = (UIOutput)findComponent("indicPreseP1sgValue");
		UIOutput indicPreseP2sgValueComponent = (UIOutput)findComponent("indicPreseP2sgValue");
		UIOutput indicPreseP3sgValueComponent = (UIOutput)findComponent("indicPreseP3sgValue");
		UIOutput indicPreseP1plValueComponent = (UIOutput)findComponent("indicPreseP1plValue");
		UIOutput indicPreseP2plValueComponent = (UIOutput)findComponent("indicPreseP2plValue");
		UIOutput indicPreseP3plValueComponent = (UIOutput)findComponent("indicPreseP3plValue");
		UIOutput indicPasscP1sgValueComponent = (UIOutput)findComponent("indicPasscP1sgValue");
		UIOutput indicPasscP2sgValueComponent = (UIOutput)findComponent("indicPasscP2sgValue");
		UIOutput indicPasscP3sgValueComponent = (UIOutput)findComponent("indicPasscP3sgValue");
		UIOutput indicPasscP1plValueComponent = (UIOutput)findComponent("indicPasscP1plValue");
		UIOutput indicPasscP2plValueComponent = (UIOutput)findComponent("indicPasscP2plValue");
		UIOutput indicPasscP3plValueComponent = (UIOutput)findComponent("indicPasscP3plValue");
		UIOutput indicImparP1sgValueComponent = (UIOutput)findComponent("indicImparP1sgValue");
		UIOutput indicImparP2sgValueComponent = (UIOutput)findComponent("indicImparP2sgValue");
		UIOutput indicImparP3sgValueComponent = (UIOutput)findComponent("indicImparP3sgValue");
		UIOutput indicImparP1plValueComponent = (UIOutput)findComponent("indicImparP1plValue");
		UIOutput indicImparP2plValueComponent = (UIOutput)findComponent("indicImparP2plValue");
		UIOutput indicImparP3plValueComponent = (UIOutput)findComponent("indicImparP3plValue");
		UIOutput indicFutusP1sgValueComponent = (UIOutput)findComponent("indicFutusP1sgValue");
		UIOutput indicFutusP2sgValueComponent = (UIOutput)findComponent("indicFutusP2sgValue");
		UIOutput indicFutusP3sgValueComponent = (UIOutput)findComponent("indicFutusP3sgValue");
		UIOutput indicFutusP1plValueComponent = (UIOutput)findComponent("indicFutusP1plValue");
		UIOutput indicFutusP2plValueComponent = (UIOutput)findComponent("indicFutusP2plValue");
		UIOutput indicFutusP3plValueComponent = (UIOutput)findComponent("indicFutusP3plValue");
		UIOutput imperPreseP2sgValueComponent = (UIOutput)findComponent("imperPreseP2sgValue");
		UIOutput imperPreseP1plValueComponent = (UIOutput)findComponent("imperPreseP1plValue");
		UIOutput imperPreseP2plValueComponent = (UIOutput)findComponent("imperPreseP2plValue");
		UIOutput subjoPreseP1sgValueComponent = (UIOutput)findComponent("subjoPreseP1sgValue");
		UIOutput subjoPreseP2sgValueComponent = (UIOutput)findComponent("subjoPreseP2sgValue");
		UIOutput subjoPreseP3sgValueComponent = (UIOutput)findComponent("subjoPreseP3sgValue");
		UIOutput subjoPreseP1plValueComponent = (UIOutput)findComponent("subjoPreseP1plValue");
		UIOutput subjoPreseP2plValueComponent = (UIOutput)findComponent("subjoPreseP2plValue");
		UIOutput subjoPreseP3plValueComponent = (UIOutput)findComponent("subjoPreseP3plValue");
		UIOutput subjoPasseP1sgValueComponent = (UIOutput)findComponent("subjoPasseP1sgValue");
		UIOutput subjoPasseP2sgValueComponent = (UIOutput)findComponent("subjoPasseP2sgValue");
		UIOutput subjoPasseP3sgValueComponent = (UIOutput)findComponent("subjoPasseP3sgValue");
		UIOutput subjoPasseP1plValueComponent = (UIOutput)findComponent("subjoPasseP1plValue");
		UIOutput subjoPasseP2plValueComponent = (UIOutput)findComponent("subjoPasseP2plValue");
		UIOutput subjoPasseP3plValueComponent = (UIOutput)findComponent("subjoPasseP3plValue");
		UIOutput condiPreseP1sgValueComponent = (UIOutput)findComponent("condiPreseP1sgValue");
		UIOutput condiPreseP2sgValueComponent = (UIOutput)findComponent("condiPreseP2sgValue");
		UIOutput condiPreseP3sgValueComponent = (UIOutput)findComponent("condiPreseP3sgValue");
		UIOutput condiPreseP1plValueComponent = (UIOutput)findComponent("condiPreseP1plValue");
		UIOutput condiPreseP2plValueComponent = (UIOutput)findComponent("condiPreseP2plValue");
		UIOutput condiPreseP3plValueComponent = (UIOutput)findComponent("condiPreseP3plValue");
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

		
		nameValueComponent.setValue(nameValue);
		nameLabelComponent.setValue(NAME_LABEL);
		typeValueComponent.setValue(typeValue);	
		typeLabelComponent.setValue(TYPE_LABEL);	
		definitionValueComponent.setValue(definitionValue);
		definitionLabelComponent.setValue(DEFINITION_LABEL);
		pluralValueComponent.setValue(pluralValue);
		pluralLabelComponent.setValue(PLURAL_LABEL);
		pastTenseValueComponent.setValue(pastTenseValue);
		pastTenseLabelComponent.setValue(PAST_TENSE_LABEL);
		pastParticipleValueComponent.setValue(pastParticipleValue);
		pastParticipleLabelComponent.setValue(PAST_PARTICIPLE_LABEL);
		genderValueComponent.setValue(genderValue);
		genderLabelComponent.setValue(GENDER_LABEL);
		verbGroupValueComponent.setValue(verbGroupValue);
		verbGroupLabelComponent.setValue(VERB_GROUP_LABEL);
		transitivityValueComponent.setValue(transitivityValue);
		transitivityLabelComponent.setValue(TRANSITIVITY_LABEL);
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
		indicPreseP1sgValueComponent.setValue(indicPreseP1sgValue);
		indicPreseP2sgValueComponent.setValue(indicPreseP2sgValue);
		indicPreseP3sgValueComponent.setValue(indicPreseP3sgValue);
		indicPreseP1plValueComponent.setValue(indicPreseP1plValue);
		indicPreseP2plValueComponent.setValue(indicPreseP2plValue);
		indicPreseP3plValueComponent.setValue(indicPreseP3plValue);
		indicPasscP1sgValueComponent.setValue(indicPasscP1sgValue);
		indicPasscP2sgValueComponent.setValue(indicPasscP2sgValue);
		indicPasscP3sgValueComponent.setValue(indicPasscP3sgValue);
		indicPasscP1plValueComponent.setValue(indicPasscP1plValue);
		indicPasscP2plValueComponent.setValue(indicPasscP2plValue);
		indicPasscP3plValueComponent.setValue(indicPasscP3plValue);
		indicImparP1sgValueComponent.setValue(indicImparP1sgValue);
		indicImparP2sgValueComponent.setValue(indicImparP2sgValue);
		indicImparP3sgValueComponent.setValue(indicImparP3sgValue);
		indicImparP1plValueComponent.setValue(indicImparP1plValue);
		indicImparP2plValueComponent.setValue(indicImparP2plValue);
		indicImparP3plValueComponent.setValue(indicImparP3plValue);
		indicFutusP1sgValueComponent.setValue(indicFutusP1sgValue);
		indicFutusP2sgValueComponent.setValue(indicFutusP2sgValue);
		indicFutusP3sgValueComponent.setValue(indicFutusP3sgValue);
		indicFutusP1plValueComponent.setValue(indicFutusP1plValue);
		indicFutusP2plValueComponent.setValue(indicFutusP2plValue);
		indicFutusP3plValueComponent.setValue(indicFutusP3plValue);
		imperPreseP2sgValueComponent.setValue(imperPreseP2sgValue);
		imperPreseP1plValueComponent.setValue(imperPreseP1plValue);
		imperPreseP2plValueComponent.setValue(imperPreseP2plValue);
		subjoPreseP1sgValueComponent.setValue(subjoPreseP1sgValue);
		subjoPreseP2sgValueComponent.setValue(subjoPreseP2sgValue);
		subjoPreseP3sgValueComponent.setValue(subjoPreseP3sgValue);
		subjoPreseP1plValueComponent.setValue(subjoPreseP1plValue);
		subjoPreseP2plValueComponent.setValue(subjoPreseP2plValue);
		subjoPreseP3plValueComponent.setValue(subjoPreseP3plValue);
		subjoPasseP1sgValueComponent.setValue(subjoPasseP1sgValue);
		subjoPasseP2sgValueComponent.setValue(subjoPasseP2sgValue);
		subjoPasseP3sgValueComponent.setValue(subjoPasseP3sgValue);
		subjoPasseP1plValueComponent.setValue(subjoPasseP1plValue);
		subjoPasseP2plValueComponent.setValue(subjoPasseP2plValue);
		subjoPasseP3plValueComponent.setValue(subjoPasseP3plValue);
		condiPreseP1sgValueComponent.setValue(condiPreseP1sgValue);
		condiPreseP2sgValueComponent.setValue(condiPreseP2sgValue);
		condiPreseP3sgValueComponent.setValue(condiPreseP3sgValue);
		condiPreseP1plValueComponent.setValue(condiPreseP1plValue);
		condiPreseP2plValueComponent.setValue(condiPreseP2plValue);
		condiPreseP3plValueComponent.setValue(condiPreseP3plValue);

		super.encodeBegin(context);
	}
	
	public String getStyle(){
		return typeValue;
	}
	
	public boolean renderName(String eType){
		boolean render = nameValue != null;
		if(eType != null && !eType.isEmpty()){
    		render = render && eType.equals("enDef");
    	}	
		return render;
	}
	
    public boolean renderBasic(String eType){
    	boolean render = typeValue != null;
		if(eType != null && !eType.isEmpty()){
    		render = render && !(eType.equals("frCon") || eType.equals("enDef"));
    	}
		return render;
	}

    public boolean renderType(String eType){
    	boolean render = typeValue != null;
		if(eType != null && !eType.isEmpty()){
    		render = render && !(eType.equals("frCon") || eType.equals("enDef"));
    	}
		return render;
	}

    public boolean renderDefinition(String eType){
    	boolean render = definitionValue != null;
		if(eType != null && !eType.isEmpty()){
    		render = render && !(eType.equals("frCon") || eType.equals("enDef"));
    	}	
		return render;
	}

    public boolean renderPlural(String eType){
		boolean render = pluralValue != null;
		if(eType != null && !eType.isEmpty()){
    		render = render && !(eType.equals("frCon") || eType.equals("enDef"));
    	}	
		return render;
	}

    public boolean renderPastTense(String eType){
		boolean render = pastTenseValue != null;
		if(eType != null && !eType.isEmpty()){
    		render = render && !(eType.equals("frCon") || eType.equals("enDef"));
    	}	
		return render;
	}

    public boolean renderPastParticiple(String eType){
		boolean render = pastParticipleValue != null;
		if(eType != null && !eType.isEmpty()){
    		render = render && !(eType.equals("frCon") || eType.equals("enDef"));
    	}	
		return render;
	}

    public boolean renderGender(String eType){
		boolean render = genderValue != null;
		if(eType != null && !eType.isEmpty()){
    		render = render && !(eType.equals("frCon") || eType.equals("enDef"));
    	}	
		return render;
	}

    public boolean renderVerbGroup(String eType){
		boolean render = verbGroupValue != null;	
		if(eType != null && !eType.isEmpty()){
    		render = render && !(eType.equals("frCon") || eType.equals("enDef"));
    	}		
		return render;
	}
    
    public boolean renderTransitivity(String eType){
    	boolean render = transitivityValue != null;
		if(eType != null && !eType.isEmpty()){
    		render = render && !(eType.equals("frCon") || eType.equals("enDef"));
    	}
		return render;
	}
    
	public boolean renderConjugation(String eType){
		boolean render = indicPreseP1sgValue != null;
		if(eType != null && !eType.isEmpty()){
    		render = render && eType.equals("frCon");
    	}
		return render;
	}
    
    public boolean renderIndicPrese(String eType, Set<String> selection){
    	boolean render = indicPreseP1sgValue != null;
		if(eType != null && !eType.isEmpty()){
    		render = render && eType.equals("frCon") && (selection != null && selection.contains(INDIC_LABEL + INDIC_PRESE_LABEL));
    	}
		return render;
	}

    public boolean renderIndicPassc(String eType, Set<String> selection){
    	boolean render = indicPasscP1sgValue != null;
		if(eType != null && !eType.isEmpty()){
    		render = render && eType.equals("frCon") && (selection != null && selection.contains(INDIC_LABEL + INDIC_PASSC_LABEL));
    	}
		return render;
	}

    public boolean renderIndicImpar(String eType, Set<String> selection){
    	boolean render = indicImparP1sgValue != null;
		if(eType != null && !eType.isEmpty()){
    		render = render && eType.equals("frCon") && (selection != null && selection.contains(INDIC_LABEL + INDIC_IMPAR_LABEL));
    	}
		return render;
	}

    public boolean renderIndicFutus(String eType, Set<String> selection){
    	boolean render = indicFutusP1sgValue != null;
		if(eType != null && !eType.isEmpty()){
    		render = render && eType.equals("frCon") && (selection != null && selection.contains(INDIC_LABEL + INDIC_FUTUS_LABEL));
    	}
		return render;
	}
	
	public boolean renderImperPrese(String eType, Set<String> selection){
    	boolean render = imperPreseP2sgValue != null;
		if(eType != null && !eType.isEmpty()){
    		render = render && eType.equals("frCon") && (selection != null && selection.contains(IMPER_LABEL + IMPER_PRESE_LABEL));
    	}
		return render;
	}

    public boolean renderSubjoPrese(String eType, Set<String> selection){
    	boolean render = subjoPreseP1sgValue != null;
		if(eType != null && !eType.isEmpty()){
    		render = render && eType.equals("frCon") && (selection != null && selection.contains(SUBJO_LABEL + SUBJO_PRESE_LABEL));
    	}
		return render;
	}

    public boolean renderSubjoPasse(String eType, Set<String> selection){
    	boolean render = subjoPasseP1sgValue != null;
		if(eType != null && !eType.isEmpty()){
    		render = render && eType.equals("frCon") && (selection != null && selection.contains(SUBJO_LABEL + SUBJO_PASSE_LABEL));
    	}
		return render;
	}

    public boolean renderCondiPrese(String eType, Set<String> selection){
    	boolean render = condiPreseP1sgValue != null;
		if(eType != null && !eType.isEmpty()){
    		render = render && eType.equals("frCon") && (selection != null && selection.contains(CONDI_LABEL + CONDI_PRESE_LABEL));
    	}
		return render;
	}
    
	public boolean renderIndic(String eType, Set<String> selection){
		boolean render = indicPreseP1sgValue != null;
		if(eType != null && !eType.isEmpty()){
    		render = render && eType.equals("frCon") && (selection != null && selection.contains(INDIC_LABEL));
    	}
		return render;
	}

    public boolean renderImper(String eType, Set<String> selection){
		boolean render = imperPreseP2sgValue != null;	
		if(eType != null && !eType.isEmpty()){
    		render = render && eType.equals("frCon") && (selection != null && selection.contains(IMPER_LABEL));
    	}
		return render;
	}
	
    public boolean renderSubjo(String eType, Set<String> selection){
		boolean render = subjoPreseP1sgValue != null;	
		if(eType != null && !eType.isEmpty()){
    		render = render && eType.equals("frCon") && (selection != null && selection.contains(SUBJO_LABEL));
    	}
		return render;
	}
	
    public boolean renderCondi(String eType, Set<String> selection){
    	boolean render = condiPreseP1sgValue != null;
    	if(eType != null && !eType.isEmpty()){
    		render = render && eType.equals("frCon") && (selection != null && selection.contains(CONDI_LABEL));
    	}
		return render;
	}
	
	
	private String getWordInfo(){
		return word != null ? (word.getLanguage() + " " + word.getWordType()) : "";
	}
}