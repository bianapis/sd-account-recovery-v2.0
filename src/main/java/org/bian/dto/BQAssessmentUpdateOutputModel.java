package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssessmentUpdateInputModelAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAssessmentUpdateOutputModel
 */
public class BQAssessmentUpdateOutputModel   {
  private BQAssessmentUpdateInputModelAssessmentInstanceRecord assessmentInstanceRecord = null;

  private String assessmentUpdateActionTaskReference = null;

  private Object assessmentUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return assessmentUpdateActionTaskReference
  **/

  public String getAssessmentUpdateActionTaskReference() {
    return assessmentUpdateActionTaskReference;
  }

  public void setAssessmentUpdateActionTaskReference(String assessmentUpdateActionTaskReference) {
    this.assessmentUpdateActionTaskReference = assessmentUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

