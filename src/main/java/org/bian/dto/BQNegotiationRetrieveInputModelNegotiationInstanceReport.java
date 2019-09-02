package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQNegotiationRetrieveInputModelNegotiationInstanceReport
 */
public class BQNegotiationRetrieveInputModelNegotiationInstanceReport   {
  private String negotiationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return negotiationInstanceReportReference
  **/

  public String getNegotiationInstanceReportReference() {
    return negotiationInstanceReportReference;
  }

  public void setNegotiationInstanceReportReference(String negotiationInstanceReportReference) {
    this.negotiationInstanceReportReference = negotiationInstanceReportReference;
  }


}

