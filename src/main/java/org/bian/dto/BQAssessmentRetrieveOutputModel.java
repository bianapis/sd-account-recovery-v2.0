package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssessmentRetrieveOutputModelAccountRecoveryProcedureInstanceRecord;
import org.bian.dto.BQAssessmentRetrieveOutputModelAssessmentInstanceAnalysis;
import org.bian.dto.BQAssessmentRetrieveOutputModelAssessmentInstanceReport;
import org.bian.dto.BQAssessmentUpdateInputModelAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAssessmentRetrieveOutputModel
 */
public class BQAssessmentRetrieveOutputModel   {
  private BQAssessmentRetrieveOutputModelAccountRecoveryProcedureInstanceRecord accountRecoveryProcedureInstanceRecord = null;

  private BQAssessmentUpdateInputModelAssessmentInstanceRecord assessmentInstanceRecord = null;

  private String assessmentRetrieveActionTaskReference = null;

  private Object assessmentRetrieveActionTaskRecord = null;

  private String assessmentRetrieveActionResponse = null;

  private BQAssessmentRetrieveOutputModelAssessmentInstanceReport assessmentInstanceReport = null;

  private BQAssessmentRetrieveOutputModelAssessmentInstanceAnalysis assessmentInstanceAnalysis = null;


  /**
   * Get accountRecoveryProcedureInstanceRecord
   * @return accountRecoveryProcedureInstanceRecord
  **/

  public BQAssessmentRetrieveOutputModelAccountRecoveryProcedureInstanceRecord getAccountRecoveryProcedureInstanceRecord() {
    return accountRecoveryProcedureInstanceRecord;
  }

  public void setAccountRecoveryProcedureInstanceRecord(BQAssessmentRetrieveOutputModelAccountRecoveryProcedureInstanceRecord accountRecoveryProcedureInstanceRecord) {
    this.accountRecoveryProcedureInstanceRecord = accountRecoveryProcedureInstanceRecord;
  }


  /**
   * Get assessmentInstanceRecord
   * @return assessmentInstanceRecord
  **/

  public BQAssessmentUpdateInputModelAssessmentInstanceRecord getAssessmentInstanceRecord() {
    return assessmentInstanceRecord;
  }

  public void setAssessmentInstanceRecord(BQAssessmentUpdateInputModelAssessmentInstanceRecord assessmentInstanceRecord) {
    this.assessmentInstanceRecord = assessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Assessment instance retrieve service call 
   * @return assessmentRetrieveActionTaskReference
  **/

  public String getAssessmentRetrieveActionTaskReference() {
    return assessmentRetrieveActionTaskReference;
  }

  public void setAssessmentRetrieveActionTaskReference(String assessmentRetrieveActionTaskReference) {
    this.assessmentRetrieveActionTaskReference = assessmentRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return assessmentRetrieveActionResponse
  **/

  public String getAssessmentRetrieveActionResponse() {
    return assessmentRetrieveActionResponse;
  }

  public void setAssessmentRetrieveActionResponse(String assessmentRetrieveActionResponse) {
    this.assessmentRetrieveActionResponse = assessmentRetrieveActionResponse;
  }


  /**
   * Get assessmentInstanceReport
   * @return assessmentInstanceReport
  **/

  public BQAssessmentRetrieveOutputModelAssessmentInstanceReport getAssessmentInstanceReport() {
    return assessmentInstanceReport;
  }

  public void setAssessmentInstanceReport(BQAssessmentRetrieveOutputModelAssessmentInstanceReport assessmentInstanceReport) {
    this.assessmentInstanceReport = assessmentInstanceReport;
  }


  /**
   * Get assessmentInstanceAnalysis
   * @return assessmentInstanceAnalysis
  **/

  public BQAssessmentRetrieveOutputModelAssessmentInstanceAnalysis getAssessmentInstanceAnalysis() {
    return assessmentInstanceAnalysis;
  }

  public void setAssessmentInstanceAnalysis(BQAssessmentRetrieveOutputModelAssessmentInstanceAnalysis assessmentInstanceAnalysis) {
    this.assessmentInstanceAnalysis = assessmentInstanceAnalysis;
  }


}

