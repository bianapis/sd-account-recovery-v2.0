package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRestructuringUpdateInputModelRestructuringInstanceRecord
 */
public class BQRestructuringUpdateInputModelRestructuringInstanceRecord   {
  private String accountRecoveryRestructuringSchedule = null;


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


}

