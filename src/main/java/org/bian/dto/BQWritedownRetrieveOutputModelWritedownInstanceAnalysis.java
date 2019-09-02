package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQWritedownRetrieveOutputModelWritedownInstanceAnalysis
 */
public class BQWritedownRetrieveOutputModelWritedownInstanceAnalysis   {
  private Object writedownInstanceAnalysisRecord = null;

  private String writedownInstanceAnalysisReportType = null;

  private String writedownInstanceAnalysisParameters = null;

  private Object writedownInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return writedownInstanceAnalysisRecord
  **/

  public Object getWritedownInstanceAnalysisRecord() {
    return writedownInstanceAnalysisRecord;
  }

  public void setWritedownInstanceAnalysisRecord(Object writedownInstanceAnalysisRecord) {
    this.writedownInstanceAnalysisRecord = writedownInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return writedownInstanceAnalysisReportType
  **/

  public String getWritedownInstanceAnalysisReportType() {
    return writedownInstanceAnalysisReportType;
  }

  public void setWritedownInstanceAnalysisReportType(String writedownInstanceAnalysisReportType) {
    this.writedownInstanceAnalysisReportType = writedownInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return writedownInstanceAnalysisParameters
  **/

  public String getWritedownInstanceAnalysisParameters() {
    return writedownInstanceAnalysisParameters;
  }

  public void setWritedownInstanceAnalysisParameters(String writedownInstanceAnalysisParameters) {
    this.writedownInstanceAnalysisParameters = writedownInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return writedownInstanceAnalysisReport
  **/

  public Object getWritedownInstanceAnalysisReport() {
    return writedownInstanceAnalysisReport;
  }

  public void setWritedownInstanceAnalysisReport(Object writedownInstanceAnalysisReport) {
    this.writedownInstanceAnalysisReport = writedownInstanceAnalysisReport;
  }


}

