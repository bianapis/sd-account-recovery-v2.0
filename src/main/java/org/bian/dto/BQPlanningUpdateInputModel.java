package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPlanningUpdateInputModelPlanningInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPlanningUpdateInputModel
 */
public class BQPlanningUpdateInputModel   {
  private String accountRecoveryProcedureInstanceReference = null;

  private String planningInstanceReference = null;

  private BQPlanningUpdateInputModelPlanningInstanceRecord planningInstanceRecord = null;

  private Object planningUpdateActionTaskRecord = null;

  private String planningUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Planning instance 
   * @return planningInstanceReference
  **/

  public String getPlanningInstanceReference() {
    return planningInstanceReference;
  }

  public void setPlanningInstanceReference(String planningInstanceReference) {
    this.planningInstanceReference = planningInstanceReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return planningUpdateActionRequest
  **/

  public String getPlanningUpdateActionRequest() {
    return planningUpdateActionRequest;
  }

  public void setPlanningUpdateActionRequest(String planningUpdateActionRequest) {
    this.planningUpdateActionRequest = planningUpdateActionRequest;
  }


}

