package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPlanningUpdateInputModelPlanningInstanceRecord
 */
public class BQPlanningUpdateInputModelPlanningInstanceRecord   {
  private String accountRecoveryPlan = null;

  private Object accountRecoveryCasePlanningTaskRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Recovery tasks and targets added to the Account Recovery Case Resolution Schedule 
   * @return accountRecoveryPlan
  **/

  public String getAccountRecoveryPlan() {
    return accountRecoveryPlan;
  }

  public void setAccountRecoveryPlan(String accountRecoveryPlan) {
    this.accountRecoveryPlan = accountRecoveryPlan;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Processing record for the planning task within the account recovery process 
   * @return accountRecoveryCasePlanningTaskRecord
  **/

  public Object getAccountRecoveryCasePlanningTaskRecord() {
    return accountRecoveryCasePlanningTaskRecord;
  }

  public void setAccountRecoveryCasePlanningTaskRecord(Object accountRecoveryCasePlanningTaskRecord) {
    this.accountRecoveryCasePlanningTaskRecord = accountRecoveryCasePlanningTaskRecord;
  }


}

