package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssessmentRetrieveOutputModelAssessmentInstanceAnalysis
 */
public class BQAssessmentRetrieveOutputModelAssessmentInstanceAnalysis   {
  private Object assessmentInstanceAnalysisRecord = null;

  private String assessmentInstanceAnalysisReportType = null;

  private String assessmentInstanceAnalysisParameters = null;

  private Object assessmentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return assessmentInstanceAnalysisRecord
  **/

  public Object getAssessmentInstanceAnalysisRecord() {
    return assessmentInstanceAnalysisRecord;
  }

  public void setAssessmentInstanceAnalysisRecord(Object assessmentInstanceAnalysisRecord) {
    this.assessmentInstanceAnalysisRecord = assessmentInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return assessmentInstanceAnalysisReportType
  **/

  public String getAssessmentInstanceAnalysisReportType() {
    return assessmentInstanceAnalysisReportType;
  }

  public void setAssessmentInstanceAnalysisReportType(String assessmentInstanceAnalysisReportType) {
    this.assessmentInstanceAnalysisReportType = assessmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return assessmentInstanceAnalysisParameters
  **/

  public String getAssessmentInstanceAnalysisParameters() {
    return assessmentInstanceAnalysisParameters;
  }

  public void setAssessmentInstanceAnalysisParameters(String assessmentInstanceAnalysisParameters) {
    this.assessmentInstanceAnalysisParameters = assessmentInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return assessmentInstanceAnalysisReport
  **/

  public Object getAssessmentInstanceAnalysisReport() {
    return assessmentInstanceAnalysisReport;
  }

  public void setAssessmentInstanceAnalysisReport(Object assessmentInstanceAnalysisReport) {
    this.assessmentInstanceAnalysisReport = assessmentInstanceAnalysisReport;
  }


}

