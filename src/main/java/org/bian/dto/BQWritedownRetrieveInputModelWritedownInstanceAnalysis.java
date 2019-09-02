package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQWritedownRetrieveInputModelWritedownInstanceAnalysis
 */
public class BQWritedownRetrieveInputModelWritedownInstanceAnalysis   {
  private String writedownInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return writedownInstanceAnalysisReference
  **/

  public String getWritedownInstanceAnalysisReference() {
    return writedownInstanceAnalysisReference;
  }

  public void setWritedownInstanceAnalysisReference(String writedownInstanceAnalysisReference) {
    this.writedownInstanceAnalysisReference = writedownInstanceAnalysisReference;
  }


}

