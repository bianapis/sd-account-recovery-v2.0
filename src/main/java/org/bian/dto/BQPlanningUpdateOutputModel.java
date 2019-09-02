package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPlanningUpdateInputModelPlanningInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPlanningUpdateOutputModel
 */
public class BQPlanningUpdateOutputModel   {
  private BQPlanningUpdateInputModelPlanningInstanceRecord planningInstanceRecord = null;

  private String planningUpdateActionTaskReference = null;

  private Object planningUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get planningInstanceRecord
   * @return planningInstanceRecord
  **/

  public BQPlanningUpdateInputModelPlanningInstanceRecord getPlanningInstanceRecord() {
    return planningInstanceRecord;
  }

  public void setPlanningInstanceRecord(BQPlanningUpdateInputModelPlanningInstanceRecord planningInstanceRecord) {
    this.planningInstanceRecord = planningInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return planningUpdateActionTaskReference
  **/

  public String getPlanningUpdateActionTaskReference() {
    return planningUpdateActionTaskReference;
  }

  public void setPlanningUpdateActionTaskReference(String planningUpdateActionTaskReference) {
    this.planningUpdateActionTaskReference = planningUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return planningUpdateActionTaskRecord
  **/

  public Object getPlanningUpdateActionTaskRecord() {
    return planningUpdateActionTaskRecord;
  }

  public void setPlanningUpdateActionTaskRecord(Object planningUpdateActionTaskRecord) {
    this.planningUpdateActionTaskRecord = planningUpdateActionTaskRecord;
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

