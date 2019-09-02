package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQWritedownUpdateInputModelWritedownInstanceRecord
 */
public class BQWritedownUpdateInputModelWritedownInstanceRecord   {
  private String accountwritedowntransaction = null;

  private Object accountRecoveryCaseWritedownTaskRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Booking to the appropriate asset/liability account required to reflect anticipated loss 
   * @return accountwritedowntransaction
  **/

  public String getAccountwritedowntransaction() {
    return accountwritedowntransaction;
  }

  public void setAccountwritedowntransaction(String accountwritedowntransaction) {
    this.accountwritedowntransaction = accountwritedowntransaction;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Processing record for the write-down task within the account recovery process 
   * @return accountRecoveryCaseWritedownTaskRecord
  **/

  public Object getAccountRecoveryCaseWritedownTaskRecord() {
    return accountRecoveryCaseWritedownTaskRecord;
  }

  public void setAccountRecoveryCaseWritedownTaskRecord(Object accountRecoveryCaseWritedownTaskRecord) {
    this.accountRecoveryCaseWritedownTaskRecord = accountRecoveryCaseWritedownTaskRecord;
  }


}

