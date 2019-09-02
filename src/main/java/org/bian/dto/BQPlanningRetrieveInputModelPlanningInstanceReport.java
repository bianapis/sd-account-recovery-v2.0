package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPlanningRetrieveInputModelPlanningInstanceReport
 */
public class BQPlanningRetrieveInputModelPlanningInstanceReport   {
  private String planningInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return planningInstanceReportReference
  **/

  public String getPlanningInstanceReportReference() {
    return planningInstanceReportReference;
  }

  public void setPlanningInstanceReportReference(String planningInstanceReportReference) {
    this.planningInstanceReportReference = planningInstanceReportReference;
  }


}

