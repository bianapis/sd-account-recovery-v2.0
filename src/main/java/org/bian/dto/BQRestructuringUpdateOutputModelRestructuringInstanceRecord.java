package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRestructuringUpdateOutputModelRestructuringInstanceRecord
 */
public class BQRestructuringUpdateOutputModelRestructuringInstanceRecord   {
  private String accountRecoveryRestructuringSchedule = null;

  private Object accountRecoveryCaseRestructuringTaskRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Target dates for account restructuring/set-up added to the Account Recovery Case Resolution Schedule 
   * @return accountRecoveryRestructuringSchedule
  **/

  public String getAccountRecoveryRestructuringSchedule() {
    return accountRecoveryRestructuringSchedule;
  }

  public void setAccountRecoveryRestructuringSchedule(String accountRecoveryRestructuringSchedule) {
    this.accountRecoveryRestructuringSchedule = accountRecoveryRestructuringSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Processing record for the restructuring task within the account recovery process 
   * @return accountRecoveryCaseRestructuringTaskRecord
  **/

  public Object getAccountRecoveryCaseRestructuringTaskRecord() {
    return accountRecoveryCaseRestructuringTaskRecord;
  }

  public void setAccountRecoveryCaseRestructuringTaskRecord(Object accountRecoveryCaseRestructuringTaskRecord) {
    this.accountRecoveryCaseRestructuringTaskRecord = accountRecoveryCaseRestructuringTaskRecord;
  }


}

