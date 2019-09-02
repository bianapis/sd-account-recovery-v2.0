package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRAccountRecoveryProcedureExchangeOutputModel
 */
public class CRAccountRecoveryProcedureExchangeOutputModel   {
  private String accountRecoveryProcedureExchangeActionTaskReference = null;

  private Object accountRecoveryProcedureExchangeActionTaskRecord = null;

  private String accountRecoveryProcedureExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Account Recovery Procedure instance exchange service call 
   * @return accountRecoveryProcedureExchangeActionTaskReference
  **/

  public String getAccountRecoveryProcedureExchangeActionTaskReference() {
    return accountRecoveryProcedureExchangeActionTaskReference;
  }

  public void setAccountRecoveryProcedureExchangeActionTaskReference(String accountRecoveryProcedureExchangeActionTaskReference) {
    this.accountRecoveryProcedureExchangeActionTaskReference = accountRecoveryProcedureExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return accountRecoveryProcedureExchangeActionTaskRecord
  **/

  public Object getAccountRecoveryProcedureExchangeActionTaskRecord() {
    return accountRecoveryProcedureExchangeActionTaskRecord;
  }

  public void setAccountRecoveryProcedureExchangeActionTaskRecord(Object accountRecoveryProcedureExchangeActionTaskRecord) {
    this.accountRecoveryProcedureExchangeActionTaskRecord = accountRecoveryProcedureExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return accountRecoveryProcedureExchangeActionResponse
  **/

  public String getAccountRecoveryProcedureExchangeActionResponse() {
    return accountRecoveryProcedureExchangeActionResponse;
  }

  public void setAccountRecoveryProcedureExchangeActionResponse(String accountRecoveryProcedureExchangeActionResponse) {
    this.accountRecoveryProcedureExchangeActionResponse = accountRecoveryProcedureExchangeActionResponse;
  }


}

