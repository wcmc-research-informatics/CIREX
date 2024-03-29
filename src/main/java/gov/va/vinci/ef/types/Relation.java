

/* First created by JCasGen Tue Jun 28 15:42:22 CDT 2016 */
package gov.va.vinci.ef.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Jun 28 15:42:22 CDT 2016
 * XML source: C:/Users/VHASLC~3/AppData/Local/Temp/leoTypeDescription_8508a9f0-8c28-4118-921f-f59dc97ac5a96406657150654531677.xml
 * @generated */
public class Relation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Relation.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Relation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Relation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Relation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Relation(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
  
  //*--------------*
  //* Feature: RunDate

  /** getter for RunDate - gets 
   * @generated
   * @return value of the feature 
   */
  public String getRunDate() {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_RunDate == null)
      jcasType.jcas.throwFeatMissing("RunDate", "gov.va.vinci.ef.types.Relation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Relation_Type)jcasType).casFeatCode_RunDate);}
    
  /** setter for RunDate - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRunDate(String v) {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_RunDate == null)
      jcasType.jcas.throwFeatMissing("RunDate", "gov.va.vinci.ef.types.Relation");
    jcasType.ll_cas.ll_setStringValue(addr, ((Relation_Type)jcasType).casFeatCode_RunDate, v);}
    
  //*--------------*
  //* Feature: Term

  /** getter for Term - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTerm() {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_Term == null)
      jcasType.jcas.throwFeatMissing("Term", "gov.va.vinci.ef.types.Relation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Relation_Type)jcasType).casFeatCode_Term);}
    
  /** setter for Term - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTerm(String v) {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_Term == null)
      jcasType.jcas.throwFeatMissing("Term", "gov.va.vinci.ef.types.Relation");
    jcasType.ll_cas.ll_setStringValue(addr, ((Relation_Type)jcasType).casFeatCode_Term, v);}    
  

//*--------------*
  //* Feature: Race

  /** getter for Race - gets 
   * @generated
   * @return value of the feature 
   */
  public String getRace() {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_Race == null)
      jcasType.jcas.throwFeatMissing("Race", "gov.va.vinci.ef.types.Relation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Relation_Type)jcasType).casFeatCode_Race);}
    
  /** setter for Race - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRace(String v) {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_Race == null)
      jcasType.jcas.throwFeatMissing("Race", "gov.va.vinci.ef.types.Relation");
    jcasType.ll_cas.ll_setStringValue(addr, ((Relation_Type)jcasType).casFeatCode_Race, v);}
  
//*--------------*
  //* Feature: Ethnicity

  /** getter for Ethnicity - gets 
   * @generated
   * @return value of the feature 
   */
  public String getEthnicity() {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_Ethnicity == null)
      jcasType.jcas.throwFeatMissing("Ethnicity", "gov.va.vinci.ef.types.Relation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Relation_Type)jcasType).casFeatCode_Ethnicity);}
    
  /** setter for Ethnicity - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEthnicity(String v) {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_Ethnicity == null)
      jcasType.jcas.throwFeatMissing("Ethnicity", "gov.va.vinci.ef.types.Relation");
    jcasType.ll_cas.ll_setStringValue(addr, ((Relation_Type)jcasType).casFeatCode_Ethnicity, v);}
  
    
  //*--------------*
  //* Feature: Value

  /** getter for Value - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValue() {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_Value == null)
      jcasType.jcas.throwFeatMissing("Value", "gov.va.vinci.ef.types.Relation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Relation_Type)jcasType).casFeatCode_Value);}
    
  /** setter for Value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_Value == null)
      jcasType.jcas.throwFeatMissing("Value", "gov.va.vinci.ef.types.Relation");
    jcasType.ll_cas.ll_setStringValue(addr, ((Relation_Type)jcasType).casFeatCode_Value, v);}    
   
    
  //*--------------*
  //* Feature: Value2

  /** getter for Value2 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValue2() {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_Value2 == null)
      jcasType.jcas.throwFeatMissing("Value2", "gov.va.vinci.ef.types.Relation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Relation_Type)jcasType).casFeatCode_Value2);}
    
  /** setter for Value2 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue2(String v) {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_Value2 == null)
      jcasType.jcas.throwFeatMissing("Value2", "gov.va.vinci.ef.types.Relation");
    jcasType.ll_cas.ll_setStringValue(addr, ((Relation_Type)jcasType).casFeatCode_Value2, v);}    
  
  
//*--------------*
  //* Feature: Concentration

  /** getter for Concentration - gets 
   * @generated
   * @return value of the feature 
   */
  public String getConcentration() {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_Concentration == null)
      jcasType.jcas.throwFeatMissing("Concentration", "gov.va.vinci.ef.types.Relation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Relation_Type)jcasType).casFeatCode_Concentration);}
    
  /** setter for Value2 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setConcentration(String v) {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_Value2 == null)
      jcasType.jcas.throwFeatMissing("Concentration", "gov.va.vinci.ef.types.Relation");
    jcasType.ll_cas.ll_setStringValue(addr, ((Relation_Type)jcasType).casFeatCode_Concentration, v);}
  
  
    
  //*--------------*
  //* Feature: ValueString

  /** getter for ValueString - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValueString() {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_ValueString == null)
      jcasType.jcas.throwFeatMissing("ValueString", "gov.va.vinci.ef.types.Relation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Relation_Type)jcasType).casFeatCode_ValueString);}
    
  /** setter for ValueString - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValueString(String v) {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_ValueString == null)
      jcasType.jcas.throwFeatMissing("ValueString", "gov.va.vinci.ef.types.Relation");
    jcasType.ll_cas.ll_setStringValue(addr, ((Relation_Type)jcasType).casFeatCode_ValueString, v);}    
  

//*--------------*
//* Feature: Snippet

/** getter for SnippetString - gets 
 * @generated
 * @return value of the feature 
 */
public String getSnippetString() {
  if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_SnippetString == null)
    jcasType.jcas.throwFeatMissing("SnippetString", "gov.va.vinci.ef.types.Relation");
  return jcasType.ll_cas.ll_getStringValue(addr, ((Relation_Type)jcasType).casFeatCode_SnippetString);}
  
/** setter for ValueString - sets  
 * @generated
 * @param v value to set into the feature 
 */
public void setSnippetString(String v) {
  if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_SnippetString == null)
    jcasType.jcas.throwFeatMissing("SnippetString", "gov.va.vinci.ef.types.Relation");
  jcasType.ll_cas.ll_setStringValue(addr, ((Relation_Type)jcasType).casFeatCode_SnippetString, v);}    
}
    