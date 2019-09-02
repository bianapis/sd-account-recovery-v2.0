package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRestructuringRetrieveInputModelRestructuringInstanceReport
 */
public class BQRestructuringRetrieveInputModelRestructuringInstanceReport   {
  private String restructuringInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return restructuringInstanceReportReference
  **/

  public String getRestructuringInstanceReportReference() {
    return restructuringInstanceReportReference;
  }

  public void setRestructuringInstanceReportReference(String restructuringInstanceReportReference) {
    this.restructuringInstanceReportReference = restructuringInstanceReportReference;
  }


}

