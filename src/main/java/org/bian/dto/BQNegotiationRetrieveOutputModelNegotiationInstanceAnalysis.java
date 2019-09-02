package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQNegotiationRetrieveOutputModelNegotiationInstanceAnalysis
 */
public class BQNegotiationRetrieveOutputModelNegotiationInstanceAnalysis   {
  private Object negotiationInstanceAnalysisRecord = null;

  private String negotiationInstanceAnalysisReportType = null;

  private String negotiationInstanceAnalysisParameters = null;

  private Object negotiationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return negotiationInstanceAnalysisRecord
  **/

  public Object getNegotiationInstanceAnalysisRecord() {
    return negotiationInstanceAnalysisRecord;
  }

  public void setNegotiationInstanceAnalysisRecord(Object negotiationInstanceAnalysisRecord) {
    this.negotiationInstanceAnalysisRecord = negotiationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return negotiationInstanceAnalysisReportType
  **/

  public String getNegotiationInstanceAnalysisReportType() {
    return negotiationInstanceAnalysisReportType;
  }

  public void setNegotiationInstanceAnalysisReportType(String negotiationInstanceAnalysisReportType) {
    this.negotiationInstanceAnalysisReportType = negotiationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return negotiationInstanceAnalysisParameters
  **/

  public String getNegotiationInstanceAnalysisParameters() {
    return negotiationInstanceAnalysisParameters;
  }

  public void setNegotiationInstanceAnalysisParameters(String negotiationInstanceAnalysisParameters) {
    this.negotiationInstanceAnalysisParameters = negotiationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return negotiationInstanceAnalysisReport
  **/

  public Object getNegotiationInstanceAnalysisReport() {
    return negotiationInstanceAnalysisReport;
  }

  public void setNegotiationInstanceAnalysisReport(Object negotiationInstanceAnalysisReport) {
    this.negotiationInstanceAnalysisReport = negotiationInstanceAnalysisReport;
  }


}

