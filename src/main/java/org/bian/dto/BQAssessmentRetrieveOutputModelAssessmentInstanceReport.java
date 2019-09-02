package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssessmentRetrieveOutputModelAssessmentInstanceReport
 */
public class BQAssessmentRetrieveOutputModelAssessmentInstanceReport   {
  private Object assessmentInstanceReportRecord = null;

  private String assessmentInstanceReportType = null;

  private String assessmentInstanceReportParameters = null;

  private Object assessmentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return assessmentInstanceReportRecord
  **/

  public Object getAssessmentInstanceReportRecord() {
    return assessmentInstanceReportRecord;
  }

  public void setAssessmentInstanceReportRecord(Object assessmentInstanceReportRecord) {
    this.assessmentInstanceReportRecord = assessmentInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return assessmentInstanceReportType
  **/

  public String getAssessmentInstanceReportType() {
    return assessmentInstanceReportType;
  }

  public void setAssessmentInstanceReportType(String assessmentInstanceReportType) {
    this.assessmentInstanceReportType = assessmentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return assessmentInstanceReportParameters
  **/

  public String getAssessmentInstanceReportParameters() {
    return assessmentInstanceReportParameters;
  }

  public void setAssessmentInstanceReportParameters(String assessmentInstanceReportParameters) {
    this.assessmentInstanceReportParameters = assessmentInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return assessmentInstanceReport
  **/

  public Object getAssessmentInstanceReport() {
    return assessmentInstanceReport;
  }

  public void setAssessmentInstanceReport(Object assessmentInstanceReport) {
    this.assessmentInstanceReport = assessmentInstanceReport;
  }


}

