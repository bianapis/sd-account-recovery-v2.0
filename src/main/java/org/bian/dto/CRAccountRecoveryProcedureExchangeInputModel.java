package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAccountRecoveryProcedureExchangeInputModelAccountRecoveryProcedureExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRAccountRecoveryProcedureExchangeInputModel
 */
public class CRAccountRecoveryProcedureExchangeInputModel   {
  private String accountRecoveryServicingSessionReference = null;

  private String accountRecoveryProcedureInstanceReference = null;

  private Object accountRecoveryProcedureExchangeActionTaskRecord = null;

  private CRAccountRecoveryProcedureExchangeInputModelAccountRecoveryProcedureExchangeActionRequest accountRecoveryProcedureExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return accountRecoveryServicingSessionReference
  **/

  public String getAccountRecoveryServicingSessionReference() {
    return accountRecoveryServicingSessionReference;
  }

  public void setAccountRecoveryServicingSessionReference(String accountRecoveryServicingSessionReference) {
    this.accountRecoveryServicingSessionReference = accountRecoveryServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Account Recovery Procedure instance 
   * @return accountRecoveryProcedureInstanceReference
  **/

  public String getAccountRecoveryProcedureInstanceReference() {
    return accountRecoveryProcedureInstanceReference;
  }

  public void setAccountRecoveryProcedureInstanceReference(String accountRecoveryProcedureInstanceReference) {
    this.accountRecoveryProcedureInstanceReference = accountRecoveryProcedureInstanceReference;
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
   * Get accountRecoveryProcedureExchangeActionRequest
   * @return accountRecoveryProcedureExchangeActionRequest
  **/

  public CRAccountRecoveryProcedureExchangeInputModelAccountRecoveryProcedureExchangeActionRequest getAccountRecoveryProcedureExchangeActionRequest() {
    return accountRecoveryProcedureExchangeActionRequest;
  }

  public void setAccountRecoveryProcedureExchangeActionRequest(CRAccountRecoveryProcedureExchangeInputModelAccountRecoveryProcedureExchangeActionRequest accountRecoveryProcedureExchangeActionRequest) {
    this.accountRecoveryProcedureExchangeActionRequest = accountRecoveryProcedureExchangeActionRequest;
  }


}

