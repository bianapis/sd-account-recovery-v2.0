package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssessmentRetrieveInputModelAssessmentInstanceAnalysis;
import org.bian.dto.BQAssessmentRetrieveInputModelAssessmentInstanceReport;

import javax.validation.Valid;
  
/**
 * BQAssessmentRetrieveInputModel
 */
public class BQAssessmentRetrieveInputModel   {
  private Object assessmentRetrieveActionTaskRecord = null;

  private String assessmentRetrieveActionRequest = null;

  private BQAssessmentRetrieveInputModelAssessmentInstanceReport assessmentInstanceReport = null;

  private BQAssessmentRetrieveInputModelAssessmentInstanceAnalysis assessmentInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return assessmentRetrieveActionTaskRecord
  **/

  public Object getAssessmentRetrieveActionTaskRecord() {
    return assessmentRetrieveActionTaskRecord;
  }

  public void setAssessmentRetrieveActionTaskRecord(Object assessmentRetrieveActionTaskRecord) {
    this.assessmentRetrieveActionTaskRecord = assessmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return assessmentRetrieveActionRequest
  **/

  public String getAssessmentRetrieveActionRequest() {
    return assessmentRetrieveActionRequest;
  }

  public void setAssessmentRetrieveActionRequest(String assessmentRetrieveActionRequest) {
    this.assessmentRetrieveActionRequest = assessmentRetrieveActionRequest;
  }


  /**
   * Get assessmentInstanceReport
   * @return assessmentInstanceReport
  **/

  public BQAssessmentRetrieveInputModelAssessmentInstanceReport getAssessmentInstanceReport() {
    return assessmentInstanceReport;
  }

  public void setAssessmentInstanceReport(BQAssessmentRetrieveInputModelAssessmentInstanceReport assessmentInstanceReport) {
    this.assessmentInstanceReport = assessmentInstanceReport;
  }


  /**
   * Get assessmentInstanceAnalysis
   * @return assessmentInstanceAnalysis
  **/

  public BQAssessmentRetrieveInputModelAssessmentInstanceAnalysis getAssessmentInstanceAnalysis() {
    return assessmentInstanceAnalysis;
  }

  public void setAssessmentInstanceAnalysis(BQAssessmentRetrieveInputModelAssessmentInstanceAnalysis assessmentInstanceAnalysis) {
    this.assessmentInstanceAnalysis = assessmentInstanceAnalysis;
  }


}

