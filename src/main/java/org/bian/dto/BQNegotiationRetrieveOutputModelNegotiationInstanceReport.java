package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQNegotiationRetrieveOutputModelNegotiationInstanceReport
 */
public class BQNegotiationRetrieveOutputModelNegotiationInstanceReport   {
  private Object negotiationInstanceReportRecord = null;

  private String negotiationInstanceReportType = null;

  private String negotiationInstanceReportParameters = null;

  private Object negotiationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return negotiationInstanceReportRecord
  **/

  public Object getNegotiationInstanceReportRecord() {
    return negotiationInstanceReportRecord;
  }

  public void setNegotiationInstanceReportRecord(Object negotiationInstanceReportRecord) {
    this.negotiationInstanceReportRecord = negotiationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return negotiationInstanceReportType
  **/

  public String getNegotiationInstanceReportType() {
    return negotiationInstanceReportType;
  }

  public void setNegotiationInstanceReportType(String negotiationInstanceReportType) {
    this.negotiationInstanceReportType = negotiationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return negotiationInstanceReportParameters
  **/

  public String getNegotiationInstanceReportParameters() {
    return negotiationInstanceReportParameters;
  }

  public void setNegotiationInstanceReportParameters(String negotiationInstanceReportParameters) {
    this.negotiationInstanceReportParameters = negotiationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return negotiationInstanceReport
  **/

  public Object getNegotiationInstanceReport() {
    return negotiationInstanceReport;
  }

  public void setNegotiationInstanceReport(Object negotiationInstanceReport) {
    this.negotiationInstanceReport = negotiationInstanceReport;
  }


}

