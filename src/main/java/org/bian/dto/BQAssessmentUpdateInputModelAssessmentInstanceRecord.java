package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssessmentUpdateInputModelAssessmentInstanceRecord
 */
public class BQAssessmentUpdateInputModelAssessmentInstanceRecord   {
  private Object accountRecoveryCaseAssessmentTaskRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Processing record for the assessment task within the account recovery process 
   * @return accountRecoveryCaseAssessmentTaskRecord
  **/

  public Object getAccountRecoveryCaseAssessmentTaskRecord() {
    return accountRecoveryCaseAssessmentTaskRecord;
  }

  public void setAccountRecoveryCaseAssessmentTaskRecord(Object accountRecoveryCaseAssessmentTaskRecord) {
    this.accountRecoveryCaseAssessmentTaskRecord = accountRecoveryCaseAssessmentTaskRecord;
  }


}

