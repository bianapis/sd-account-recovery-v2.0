package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRestructuringRetrieveInputModelRestructuringInstanceAnalysis
 */
public class BQRestructuringRetrieveInputModelRestructuringInstanceAnalysis   {
  private String restructuringInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return restructuringInstanceAnalysisReference
  **/

  public String getRestructuringInstanceAnalysisReference() {
    return restructuringInstanceAnalysisReference;
  }

  public void setRestructuringInstanceAnalysisReference(String restructuringInstanceAnalysisReference) {
    this.restructuringInstanceAnalysisReference = restructuringInstanceAnalysisReference;
  }


}

