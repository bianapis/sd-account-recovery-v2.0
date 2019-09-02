package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssessmentUpdateInputModelAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAssessmentUpdateInputModel
 */
public class BQAssessmentUpdateInputModel   {
  private String accountRecoveryProcedureInstanceReference = null;

  private String assessmentInstanceReference = null;

  private BQAssessmentUpdateInputModelAssessmentInstanceRecord assessmentInstanceRecord = null;

  private Object assessmentUpdateActionTaskRecord = null;

  private String assessmentUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Account Recovery Procedure instance 
   * @return accountRecoveryProcedureInstanceReference
  **/

  public String getAccountRecoveryProcedureInstanceReference() {
    return accountRecoveryProcedureInstanceReference;
  }

  public void setAccountRecoveryProcedureInstanceReference(String accountRecoveryProcedureInstanceReference) {
    this.accountRecoveryProcedureInstanceReference = accountRecoveryProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Assessment instance 
   * @return assessmentInstanceReference
  **/

  public String getAssessmentInstanceReference() {
    return assessmentInstanceReference;
  }

  public void setAssessmentInstanceReference(String assessmentInstanceReference) {
    this.assessmentInstanceReference = assessmentInstanceReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return assessmentUpdateActionTaskRecord
  **/

  public Object getAssessmentUpdateActionTaskRecord() {
    return assessmentUpdateActionTaskRecord;
  }

  public void setAssessmentUpdateActionTaskRecord(Object assessmentUpdateActionTaskRecord) {
    this.assessmentUpdateActionTaskRecord = assessmentUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return assessmentUpdateActionRequest
  **/

  public String getAssessmentUpdateActionRequest() {
    return assessmentUpdateActionRequest;
  }

  public void setAssessmentUpdateActionRequest(String assessmentUpdateActionRequest) {
    this.assessmentUpdateActionRequest = assessmentUpdateActionRequest;
  }


}

