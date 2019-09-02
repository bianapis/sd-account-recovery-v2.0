package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPlanningRetrieveInputModelPlanningInstanceAnalysis
 */
public class BQPlanningRetrieveInputModelPlanningInstanceAnalysis   {
  private String planningInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return planningInstanceAnalysisReference
  **/

  public String getPlanningInstanceAnalysisReference() {
    return planningInstanceAnalysisReference;
  }

  public void setPlanningInstanceAnalysisReference(String planningInstanceAnalysisReference) {
    this.planningInstanceAnalysisReference = planningInstanceAnalysisReference;
  }


}

