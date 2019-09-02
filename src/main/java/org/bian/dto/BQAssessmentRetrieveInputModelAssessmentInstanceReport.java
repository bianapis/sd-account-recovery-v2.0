package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssessmentRetrieveInputModelAssessmentInstanceReport
 */
public class BQAssessmentRetrieveInputModelAssessmentInstanceReport   {
  private String assessmentInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return assessmentInstanceReportReference
  **/

  public String getAssessmentInstanceReportReference() {
    return assessmentInstanceReportReference;
  }

  public void setAssessmentInstanceReportReference(String assessmentInstanceReportReference) {
    this.assessmentInstanceReportReference = assessmentInstanceReportReference;
  }


}

