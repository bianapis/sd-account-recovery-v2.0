package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRestructuringRetrieveOutputModelRestructuringInstanceAnalysis
 */
public class BQRestructuringRetrieveOutputModelRestructuringInstanceAnalysis   {
  private Object restructuringInstanceAnalysisRecord = null;

  private String restructuringInstanceAnalysisReportType = null;

  private String restructuringInstanceAnalysisParameters = null;

  private Object restructuringInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return restructuringInstanceAnalysisRecord
  **/

  public Object getRestructuringInstanceAnalysisRecord() {
    return restructuringInstanceAnalysisRecord;
  }

  public void setRestructuringInstanceAnalysisRecord(Object restructuringInstanceAnalysisRecord) {
    this.restructuringInstanceAnalysisRecord = restructuringInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return restructuringInstanceAnalysisReportType
  **/

  public String getRestructuringInstanceAnalysisReportType() {
    return restructuringInstanceAnalysisReportType;
  }

  public void setRestructuringInstanceAnalysisReportType(String restructuringInstanceAnalysisReportType) {
    this.restructuringInstanceAnalysisReportType = restructuringInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return restructuringInstanceAnalysisParameters
  **/

  public String getRestructuringInstanceAnalysisParameters() {
    return restructuringInstanceAnalysisParameters;
  }

  public void setRestructuringInstanceAnalysisParameters(String restructuringInstanceAnalysisParameters) {
    this.restructuringInstanceAnalysisParameters = restructuringInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return restructuringInstanceAnalysisReport
  **/

  public Object getRestructuringInstanceAnalysisReport() {
    return restructuringInstanceAnalysisReport;
  }

  public void setRestructuringInstanceAnalysisReport(Object restructuringInstanceAnalysisReport) {
    this.restructuringInstanceAnalysisReport = restructuringInstanceAnalysisReport;
  }


}

